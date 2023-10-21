package com.web.bc.pro16_临时字段;

public class Account {
    private String name;

    private String cardId;

    private double balance;

    public Account(String name, String cardId, double balance) {
        this.name = name;
        this.cardId = cardId;
        this.balance = balance;
    }

    //....

    /**
     * 最大资产
     */
    private int maxAsset;

    /**
     * 使用频率
     */
    private double usageFrequency;

    /**
     * 逾期次数
     */
    private int overdueTimes;

    /**
     * 消费水平评估
     *
     * @return
     */
    public int evaluateConsumptionLevel() {
        return (int)(usageFrequency * 365) - overdueTimes * 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMaxAsset() {
        return maxAsset;
    }

    public void setMaxAsset(int maxAsset) {
        this.maxAsset = maxAsset;
    }

    public double getUsageFrequency() {
        return usageFrequency;
    }

    public void setUsageFrequency(double usageFrequency) {
        this.usageFrequency = usageFrequency;
    }

    public int getOverdueTimes() {
        return overdueTimes;
    }

    public void setOverdueTimes(int overdueTimes) {
        this.overdueTimes = overdueTimes;
    }
}
