package com.kevin.collection.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class DemoFileFilter {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\kevin\\Desktop");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {

        //System.out.println(dir);
        //传入文件过滤器
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //直接书写校验逻辑
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

        File[] files = dir.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".doc");
            }
        });

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }

        }
    }
}