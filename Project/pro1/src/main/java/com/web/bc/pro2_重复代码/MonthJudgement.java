package com.web.bc.pro2_重复代码;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MonthJudgement {
    public static void main(String[] args) {
        System.out.println(judgeMonth());
    }
    public static boolean judgeMonth() {
        Long timeMillis = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date(timeMillis));
        String month = date.split(" ")[0].split("-")[1];
        return month.equals("12");
    }

    public static boolean judgeYear() {
        Long timeMillis = System.currentTimeMillis();
        System.out.println("获取当前时间戳");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date(timeMillis));
        return date.startsWith("2021");
    }
}
