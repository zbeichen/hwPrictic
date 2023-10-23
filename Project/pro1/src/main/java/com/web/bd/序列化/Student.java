package com.web.bd.序列化;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1218543721283023795L;

    private String id;

    private String name;

    private transient String phone;

    private String address;

    public Student() {
    }

    public Student(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
