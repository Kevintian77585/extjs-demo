package com.kevin.collection.tcpip;

import java.io.*;
import java.net.Socket;

public class FileUploadClient {

    public static void main(String[] args) throws IOException {
        //获取客户端的文件路径
        File file = new File("C:\\Users\\kevin\\Desktop\\test.jpg");
        //转化输入流
        FileInputStream fis = new FileInputStream(file);
        //获取客户端的套接字对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        //使用本地字节流fis对象的read方法读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            //使用套接字的输出流对象将数据写至服务器上
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        //使用Socket对象中的方法getInputStream() 获取此套接字的输入流 InputStream
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            //显示服务器返回的数据
            System.out.println(new String(bytes, 0, len));
        }
        //释放资源
        fis.close();
        socket.close();
    }
}
