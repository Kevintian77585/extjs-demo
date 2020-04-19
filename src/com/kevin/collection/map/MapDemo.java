package com.kevin.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");

        Collection<String> values = map.values();
        for (String s :values) {
            System.out.println(s);
        }

        Set<String> keySet = map.keySet();
        for (String s :keySet) {
            System.out.println(s);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> s :entries) {
            System.out.print(s.getKey());
            System.out.print(s.getValue());
            System.out.println();
        }


    }
}
