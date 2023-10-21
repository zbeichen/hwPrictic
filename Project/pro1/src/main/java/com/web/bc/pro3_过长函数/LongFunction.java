package com.web.bc.pro3_过长函数;

public class LongFunction {
    public static void main(String[] args) {
        print();
    }

    /**
     * 打印发票
     */
    public static void print() {
        System.out.println("1、打印表头xxxxxx");
        System.out.println("Buyer: xxxxxx");
        System.out.println("Seller: xxxxxx");

        System.out.println("2、打印详细xxxxxx");
        int count = 0;
        for (int i = 0; i < 100; i++) {
            //计算细节内容 。。。。
            count++;
        }

        System.out.println("3、打印票根xxx" + count);
    }
}
