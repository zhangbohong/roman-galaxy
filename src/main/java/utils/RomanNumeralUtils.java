package utils;

import exceptions.UnknownSymbolException;
import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RomanNumeralUtils {

    public static Pattern pattern = Pattern.compile("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    public static boolean isValidRomanNumeral(String romanStr) {
        Matcher matcher = pattern.matcher(romanStr);
        return romanStr.length() > 0 && matcher.matches();
    }

    public static int getValueFromRomanStr(String romanStr) throws UnknownSymbolException {
        if (!isValidRomanNumeral(romanStr)) {
            throw new UnknownSymbolException("Illegal Roman Numbers");
        }
        List<String> valueList = Stream.of(romanStr.split(""))
                .map(s -> String.valueOf(RomanNumeral.valueOf(s).getValue())).collect(Collectors.toList());
        final int[] result = {0};
        valueList.stream()
                .flatMapToInt(s -> IntStream.of(Integer.parseInt(s)))
                .reduce((current, next) -> {
                    if (current >= next) {
                        result[0] += current;
                    } else {
                        result[0] -= current;
                    }
                    return next;
                });
        return result[0] + Integer.parseInt(valueList.get(valueList.size() - 1).trim());
    }

    public static String getMaterialType(String commandLine) {
        return Stream.of(commandLine.split("\\s"))
                .filter(MaterialType::contains).collect(Collectors.joining(" "));
    }

    public static String getRomanStr(Map<String, Object> romanMap, String commandLine) {
        return Stream.of(commandLine.split("\\s"))
                .filter(romanMap::containsKey)
                .map(s -> romanMap.get(s).toString().split("=")[0]).collect(Collectors.joining(""));
    }

    public static int getCreditValue(String commandLine) {
        return Stream.of(commandLine.split("\\s"))
                .filter(StringUtils::isNumeric).mapToInt(Integer::parseInt).sum();
    }

    public static String getRomanStrFromCommandLine(Map<String, Object> romanMap, String commandLine) {
        return Stream.of(commandLine.split("\\s"))
                .filter(romanMap::containsKey).collect(Collectors.joining(" "));
    }


}
