package com.web.bc.pro23_被拒绝的遗赠;

import lombok.Data;

@Data
public class PersonInfo {
    protected String name;
    protected int age;
    protected double height;
    protected double weight;
    /**
     * 到达学龄
     */
    protected boolean isReachSchoolAge;
    /**
     * 通勤时间
     */
    protected String commutingtimeeverywork;

    protected String getChildInfo() {
        return "Name:" + name + "age:" + age + "isReachSchoolAge:" + isReachSchoolAge;
    }

    protected String getAdultInfo() {
        return "Name:" + name + "age:" + age + "commutingtimeeverywork:" + commutingtimeeverywork;
    }

    protected void printInfo() {}
}
