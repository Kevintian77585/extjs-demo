package com.kevin.collection.file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DemoReader {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("b.txt");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        reader.close();
    }
}
