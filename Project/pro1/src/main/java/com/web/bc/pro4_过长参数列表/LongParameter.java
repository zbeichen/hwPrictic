package com.web.bc.pro4_过长参数列表;

public class LongParameter {
    public static void main(String[] args) {
        getStudentInfo1(new Student(), "lisi");
        getStudentInfo2("1001", "lisi");
        getStudentInfo3("1001", "lisi");
    }
    public static void getStudentInfo1(Student student, String name) {
        System.out.println(student);
        System.out.println(name);
    }

    public static void getStudentInfo2(String id, String name) {
        System.out.println(id);
        System.out.println(name);
    }

    public static void getStudentInfo3(String id, String name) {
        System.out.println(id);
        System.out.println(name);
    }
}
