package com.web.bd.文件操作;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    private static final String PATHT = "D:/cs/test/";

    public static void main(String[] args) throws IOException {
        int i = 3;
        switch (i) {
            case 1 :
                readFile1("/readFileTest.txt"); break;
            case 2:
                readFile1("../test.txt"); break;
            case 3:
                readFile2("../test.txt"); break;
        }
    }

    public static void readFile1(String fileName) throws IOException {
        File file = new File(PATHT, fileName);
        String path = file.getPath();
        if (! validPath1(path)) {
            System.out.println("文件路径错误！！");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int data;
        while ((data = fileInputStream.read())!= -1) {
            System.out.print((char) data);
        }
        fileInputStream.close();
    }

    private static boolean validPath1(String path) {
        String resultPath = PATHT.replace("/", "\\");
        if (path.startsWith(resultPath)) {
            return true;
        }
        return false;
    }

    public static void readFile2(String fileName) throws IOException {
        File file = new File(PATHT, fileName);
        String canonicalPath = file.getCanonicalPath();
        if (!validPath1(canonicalPath)) {
            System.out.println("路径错误");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(canonicalPath));
        int data;
        while ((data = fileInputStream.read())!= -1) {
            System.out.print((char) data);
        }
        fileInputStream.close();
    }
}
