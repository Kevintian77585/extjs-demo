package com.kevin.collection.file;

import java.io.File;

public class DemoFileFilter {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kevin\\Desktop");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {

        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }

        }
    }
}