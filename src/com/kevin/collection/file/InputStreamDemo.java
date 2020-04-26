package com.kevin.collection.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //System.out.println(len);
       /* System.out.println(Arrays.toString(bytes));*/

        fis.close();
    }
}
