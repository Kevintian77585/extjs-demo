package com.kevin.collection.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropretiesDemo {
    public static void main(String[] args) throws IOException{

        //show01();
        show02();
    }

    /**
     * load 方法
     *  void load(InputStream inStream)
     *           从输入流中读取属性列表（键和元素对）。
     *  void load(Reader reader)
     *           按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
     */
    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("prop.txt"));
        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            //System.out.println(name);
            String property = prop.getProperty(name);
            System.out.println(name+"\t"+property);

        }
    }

    /**
     * 使用Properties集合存储数据遍历获取数据
     */
    private static void show01() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("王力宏", "181");
        prop.setProperty("周杰伦", "170");

        /*Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string);
            System.out.println(prop.getProperty(string));
        }*/
        //字符流写入
        /*FileWriter fw = new FileWriter("prop.txt");
        prop.store(fw,"save data test");*/
        prop.store(new FileOutputStream("prop2.txt"), "");
        System.out.println("成功写入数据");
    }
}
