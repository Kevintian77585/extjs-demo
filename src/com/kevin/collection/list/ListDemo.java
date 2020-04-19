package com.kevin.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        //集合不能存储基本数据类型
        List list = new ArrayList();
        list.add("java");
        list.add("mysql");
        list.add("java");
        list.add(true);//Boolean
        list.add(12);//Integer
        list.add(3.14F);//Float

        Object data1 = list.get(0);
        System.out.println(data1);

        list.forEach(temp->{
            System.out.println(temp);
        });

    }
}
