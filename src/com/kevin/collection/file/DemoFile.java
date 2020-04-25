package com.kevin.collection.file;

import java.io.File;
import java.io.IOException;

public class DemoFile {

    public static void main(String[] args) throws Exception{

        //路径分割符windows默认是“;” linux默认是“:”
      /*  String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);*/
        //文件名称分割符
        /*String separator = File.separator;
        System.out.println(separator);*/
        
        //show1();
        show2();

    }

    private static void show2() throws IOException {
        File f1 = new File("b.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }

    private static void show1() throws IOException {
        File f1 = new File("C:\\Users\\kevin\\IdeaProjects\\extjs-demo\\a.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }
}
