package com.web.bc.pro13_循环语句;

import lombok.Data;

@Data
public class Apple {
    private int id;

    private String color;

    private int weight;

    private String origin;

    public Apple(int id, String color, int weight, String origin) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }
}
