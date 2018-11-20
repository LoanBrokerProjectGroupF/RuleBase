package dk.kepp.rulebase;

import dk.kepp.rulebase.entity.Bank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RuleService {
    private final Bank tineOne;
    private final Bank tineTwo;
    private final Bank ourOne;
    private final Bank ourTwo;

    public RuleService() {
        tineOne = new Bank("XMLBank", 250, 500, 0, 100000, 0, 360);
        tineTwo = new Bank("JsonBank", 0, 800, 0, 100000, 0, 360);
        ourOne = new Bank("WebBank", 100, 400, 0, 100000, 0, 360);
        ourTwo = new Bank("RabbitBank", 400, 800, 0, 100000, 0, 360);
    }

    public String getBanks(int creditScore, int amount, int duration){
        List<Bank> banks = new LinkedList<>(Arrays.asList(tineOne, tineTwo, ourOne, ourTwo));
        List<Bank> tem = new LinkedList<>(Arrays.asList(tineOne, tineTwo, ourOne, ourTwo));
        String result = "";
        for (Bank bank: tem) {
            if (!bank.isCreditScoreInrange(creditScore)) {
                banks.remove(bank);
            } else if (!bank.isAmountInrange(amount)) {
                banks.remove(bank);
            } else if (!bank.isDurationInrange(duration)) {
                banks.remove(bank);
            } else {
                result = result.concat(bank.getName().concat(","));
            }
        }
        return result.substring(0, result.length() - 1);
    }
}
