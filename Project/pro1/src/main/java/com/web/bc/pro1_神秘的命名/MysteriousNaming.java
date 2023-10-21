package com.web.bc.pro1_神秘的命名;


/**
 * 剧院包场金额结算：
 * 1）悲剧--30人以内(包括)算40000，超过30人的，超出部分没人加1000
 * 2）喜剧--20人以内(包括)算30000，超过20人的，超出部分没人加500
 */
public class MysteriousNaming {
    public static void main(String[] args) {
        Perf perf = new Perf(20);
        try {
            int amont = new MysteriousExample().amont(perf, Type.TYPE1);
            System.out.println(amont);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MysteriousExample {
    public int amont(Perf perf, Type type) throws Exception {
        switch (type) {
            case TYPE1:
                return resfortype1(perf);
            case TYPE2:
                return resfortype2(perf);
            default:throw new Exception("xxx");
        }
    }

    private int resfortype1(Perf perf) {
        int s = 40000;
        if(perf.getAud() > 30) {
            s += 1000 * (perf.getAud() - 30);
        }
        return s;
    }

    private int resfortype2(Perf perf) {
        int s = 30000;
        if(perf.getAud() > 20) {
            s += 1000 + 500 * (perf.getAud() - 20);
        }
        return s;
    }
}
