package com.web.bc.pro13_循环语句;

import java.util.*;
import java.util.stream.Collectors;

public class Loops {
    public static void main(String[] args) {
        List<Apple> appliList = new ArrayList<>();
        appliList.add(new Apple(1, "red", 500, "河南"));
        appliList.add(new Apple(2, "red", 400, "河南"));
        appliList.add(new Apple(3, "green", 300, "天津"));
        appliList.add(new Apple(4, "green", 100, "天津"));
        Map<String, Integer> stringIntegerMap = averageWeightByColor2(appliList);
        System.out.println(stringIntegerMap);
    }

    public static Map<String, Integer> averageWeightByColor1(List<Apple> appliList) {
        Map<String, Integer> result = new HashMap<>();
        Map<String, List<Apple>> applesMap = new HashMap<>();
        for (Apple apple : appliList) {
            applesMap.computeIfAbsent(apple.getColor(), key -> new ArrayList<>()).add(apple);
        }
        for (Map.Entry<String, List<Apple>> entyr : applesMap.entrySet()) {
            int weights = 0;
            for (Apple apple : entyr.getValue()) {
                weights += apple.getWeight();
            }
            result.put(entyr.getKey(), weights/entyr.getValue().size());
        }
        return result;
    }

    public static Map<String, Integer> averageWeightByColor2(List<Apple> appliList) {
        Map<String, Integer> result = new HashMap<>();
        appliList.stream().collect(Collectors.groupingBy(Apple::getColor, Collectors.averagingInt(Apple::getWeight)))
                .forEach((key, value) ->
            result.put(key, value.intValue()));
        return result;
    }
}
