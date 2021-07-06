package processors.impl;

import exceptions.UnknownSymbolException;
import handler.ReadLineHandler;
import processors.IQuestions;
import utils.RomanNumeralUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;

public class HowManyMaterialQuestionImpl implements IQuestions {

    private Map<String, Object> romanMap;
    private Map<String, Object> materialMap;

    public HowManyMaterialQuestionImpl() {
        this.romanMap = ReadLineHandler.getInstance().getRomanMap();
        this.materialMap = ReadLineHandler.getInstance().getMaterialMap();
    }

    @Override
    public void processor(String commandLine) {
        String str = RomanNumeralUtils.getRomanStrFromCommandLine(romanMap, commandLine);
        String romanStr = RomanNumeralUtils.getRomanStr(romanMap, commandLine);
        List<String> materialTypeList = RomanNumeralUtils.getMaterialTypeList(commandLine);
        double materialValueTarget = Double.parseDouble(materialMap.get(materialTypeList.get(0)) + "");
        double materialValueResource = Double.parseDouble(materialMap.get(materialTypeList.get(1)) + "");
        int romanValue = 0;
        try {
            romanValue = RomanNumeralUtils.getValueFromRomanStr(romanStr);
        } catch (UnknownSymbolException e) {
            System.err.println(e.getMessage());
        }
        BigDecimal result = new BigDecimal(romanValue)
                .multiply(new BigDecimal(materialValueResource))
                .divide(new BigDecimal(materialValueTarget)) ;
        NumberFormat nf = new DecimalFormat("#.####");
        System.out.printf("%s %s is %s %s ", str, materialTypeList.get(1), nf.format(result), materialTypeList.get(0));

    }
}
