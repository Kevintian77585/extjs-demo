package com.kevin.collection.reflect;

import com.kevin.collection.anno.Pro;

import java.lang.reflect.Method;

@Pro(className = "com.kevin.collection.anno.Demo1",methodName = "show")
public class ReflectTest {

    public static void main(String[] args) throws Exception {

        //解析注解
        //1.获取该类得字节码文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2获取注解对象
        Pro anno = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义得抽象方法
        String className = anno.className();
        String methodName = anno.methodName();

        System.out.println(className);
        System.out.println(methodName);

        //加载该类进内存
        Class cls = Class.forName(className);
        //创建对象
        Object o = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
       method.invoke(o);


    }
}
