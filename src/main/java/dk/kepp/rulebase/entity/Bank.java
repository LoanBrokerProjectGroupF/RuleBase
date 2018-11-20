package dk.kepp.rulebase.entity;

public class Bank {

    private final String name;
    private final int minScoreCredit;
    private final int maxScoreCredit;
    private final int minAmount;
    private final int maxAmount;
    private final int minDuration;
    private final int maxDuration;

    public Bank(String name, int minScoreCredit, int maxScoreCredit, int minAmount, int maxAmount, int minDuration, int maxDuration) {
        this.name = name;
        this.minScoreCredit = minScoreCredit;
        this.maxScoreCredit = maxScoreCredit;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
    }

    public boolean isCreditScoreInrange(int creditScore){
        return creditScore >= this.minScoreCredit && creditScore <= this.maxScoreCredit;
    }

    public boolean isAmountInrange(int amount){
        return amount >= this.minAmount && amount <= this.maxAmount;
    }

    public boolean isDurationInrange(int duration){
        return duration >= this.minDuration && duration <= this.maxDuration;
    }

    public String getName(){
        return this.name;
    }
}
