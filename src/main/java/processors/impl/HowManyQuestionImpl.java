package processors.impl;

import exceptions.UnknownSymbolException;
import handler.ReadLineHandler;
import processors.IQuestions;
import utils.RomanNumeralUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;

public class HowManyQuestionImpl implements IQuestions {
    @Override
    public void processor(String commandLine) {
        Map<String, Object> romanMap = ReadLineHandler.getInstance().getRomanMap();
        Map<String, Object> materialMap = ReadLineHandler.getInstance().getMaterialMap();
        String string = RomanNumeralUtils.getRomanStrFromCommandLine(romanMap, commandLine);
        String materialType = RomanNumeralUtils.getMaterialType(commandLine);
        String romanStr = RomanNumeralUtils.getRomanStr(romanMap, commandLine);
        int romanValue = 0;
        try {
            romanValue = RomanNumeralUtils.getValueFromRomanStr(romanStr);
        } catch (UnknownSymbolException e) {
            System.err.println(e.getMessage());
        }
        double materialValue = Double.parseDouble(materialMap.get(materialType) + "");
        NumberFormat nf = new DecimalFormat("#.####");
        System.out.printf("%s %s is %s Credits\n", string, materialType, nf.format(romanValue * materialValue));
    }
}
