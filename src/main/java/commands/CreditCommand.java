package commands;

import exceptions.UnknownSymbolException;
import utils.RomanNumeralUtils;

import java.math.BigDecimal;
import java.util.Map;

public class CreditCommand extends Command {

    CreditCommand() {

    }

    public CreditCommand(String commandLine) {
        super(commandLine);
    }

    @Override
    public void executeCommand() {
        String commandLine = getCommandLine();
        Map<String, Object> materialMap = getReadLineHandler().getMaterialMap();
        Map<String, Object> romanMap = getReadLineHandler().getRomanMap();
        String materialType = RomanNumeralUtils.getMaterialType(commandLine);
        String romanStr = RomanNumeralUtils.getRomanStr(romanMap, commandLine);
        int creditValue = RomanNumeralUtils.getCreditValue(commandLine);
        int romanValue = 0;
        try {
            romanValue = RomanNumeralUtils.getValueFromRomanStr(romanStr);
        } catch (UnknownSymbolException e) {
            System.err.println(e.getMessage());
        }
        ;
        BigDecimal value = new BigDecimal(creditValue).divide(new BigDecimal(romanValue));
        materialMap.put(materialType.trim(), value);
    }
}
