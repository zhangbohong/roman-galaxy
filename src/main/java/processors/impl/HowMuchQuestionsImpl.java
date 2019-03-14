package processors.impl;

import exceptions.UnknownSymbolException;
import handler.ReadLineHandler;
import processors.IQuestions;
import utils.RomanNumeralUtils;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowMuchQuestionsImpl implements IQuestions {
    @Override
    public void processor(String commandLine) {
        Map<String, Object> romanMap = ReadLineHandler.getInstance().getRomanMap();
        String string = RomanNumeralUtils.getRomanStrFromCommandLine(romanMap, commandLine);
        String romanStr = RomanNumeralUtils.getRomanStr(romanMap, commandLine);
        int romanValue = 0;
        try {
            romanValue = RomanNumeralUtils.getValueFromRomanStr(romanStr);
        } catch (UnknownSymbolException e) {
            System.err.println(e.getMessage());
        }
        System.out.printf("%s is %d\n", string, romanValue);
    }
}
