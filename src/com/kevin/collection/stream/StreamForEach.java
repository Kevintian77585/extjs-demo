package com.kevin.collection.stream;

import java.util.stream.Stream;

/**
 * 遍历流  中介方法
 */
public class StreamForEach {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三1", "张三2", "张三3", "张三4", "张三5", "张三6", "网阿布");
       /* stream.forEach((String name)->{
            System.out.println(name);
        });*/

        /* stream.forEach(name -> System.out.println(name));*/
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        stream1.forEach((String name)->{
            System.out.println(name);
        });
    }
}
