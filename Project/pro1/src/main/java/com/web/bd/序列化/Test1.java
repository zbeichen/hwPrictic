package com.web.bd.序列化;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("101", "lisi", "17767666276", "五一路");
        File file = new File("D:/css/file.txt");



//        serializableStudent(file, student                                                  );
        unSerializableStudent(file);

    }

    private static void serializableStudent(File file, Student student) throws IOException, ClassNotFoundException {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(student);
        outputStream.close();
        fileOutputStream.close();
    }

    private static void unSerializableStudent(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Student student = (Student)inputStream.readObject();
        System.out.println(student);
        inputStream.close();
    }
}
