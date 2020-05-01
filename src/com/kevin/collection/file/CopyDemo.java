package com.kevin.collection.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的复制（实质就是先读后写）
 */
public class CopyDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\kevin\\Desktop\\远程办公\\体检报告.pdf");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\kevin\\Desktop\\ps激活\\体检报告.pdf");
        byte[] bytes = new byte[1024];
        long start = System.currentTimeMillis();
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fos.close();
        fis.close();

    }
}
