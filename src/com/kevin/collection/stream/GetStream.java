package com.kevin.collection.stream;

import java.util.*;
import java.util.stream.Stream;

public class GetStream {

    public static void main(String[] args) {

        /**
         * 将集合转化为流
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //将集合转化为流
        Set<String> set = new HashSet<>();

        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取map得键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        //将set集合转化为流
        Stream<String> stream3 = keySet.stream();
        //获取map中得值，间接转化为流
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取map得键值对，将其转化为流
        Set<Map.Entry<String, String>> entrySets = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entrySets.stream();

        /**
         * 把数组转化为stream流
         */
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] strArr = {"1","2","3","4","5"};
        Stream<String> stream8 = Stream.of(strArr);

    }
}
