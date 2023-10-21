package com.web.bc.pro1;

public enum Type {
    TYPE1("101", "悲剧"),
    TYPE2("102", "戏剧");

    private String id;
    private String name;

    Type(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
