package com.web.bd.文件操作;

import java.io.*;

/**
 * 8 : 0x00-0xff  补码 0x表示16进制
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        errTest1();
    }

    public static void errTest1() throws IOException {
        File file = new File("D://cs//test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data;
        char c;
        while ((c = (char)fileInputStream.read())!= -1) {
            System.out.print(c);
        }
        fileInputStream.close();
    }

    public static void errTest2() throws IOException {
        File file = new File("D://cs//test.txt");
        FileReader fileReader = new FileReader(file);
        int date;
        char c;
        while((c = (char)fileReader.read()) != -1) {
            System.out.print(c);
        }
    }
}
