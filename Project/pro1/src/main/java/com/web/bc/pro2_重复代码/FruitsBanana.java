package com.web.bc.pro2_重复代码;

public class FruitsBanana extends Fruits {
    public double profitMoney(int number) {
        return Math.max(0, number - minSaleableMun) + this.prices - this.costPrices * number;
    }
}
