package com.web.bc.pro2_重复代码;

public class DuplicatedCode {
    public static void main(String[] args) {
        boolean isDiscount = true;
        double prices;
        if (isDiscount) {
            prices= computeMoneyWithPrivileges("apple", 2, 0.8);
        } else {
            prices = computeMoneyWithoutPrivileges("apple", 2);
        }
        System.out.println(prices);
    }

    /**
     * 计算无折扣价格
     *
     * @param type
     * @param numbers
     * @return
     */
    public static double computeMoneyWithoutPrivileges(String type, int numbers) {
        double prices;
        switch (type) {
            case "apple" :
                prices = 5.5;
                break;
            case "banana":
                prices = 4.0;
                break;
            default:
                throw new IllegalArgumentException("xxxx");
        }
        return prices * numbers;
    }

    /**
     * 计算折扣价格
     *
     * @param type
     * @param numbers
     * @return
     */
    public static double computeMoneyWithPrivileges(String type, int numbers, double discount) {
        double prices;
        switch (type) {
            case "apple" :
                prices = 5.5;
                break;
            case "banana":
                prices = 4.0;
                break;
            default:
                throw new IllegalArgumentException("xxxx");
        }
        return prices * numbers * discount;
    }


}
