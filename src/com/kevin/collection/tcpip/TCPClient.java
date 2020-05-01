package com.kevin.collection.tcpip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {
        /**
         * Socket(InetAddress address, int port)
         *           创建一个流套接字并将其连接到指定 IP 地址的指定端口号。
         *  Socket(String host, int port)
         *           创建一个流套接字并将其连接到指定主机上的指定端口号。
         *  实现步骤
         *  1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址及端口号
         *  2.使用Socket对象中的方法getOutputStream() 获取此套接字的输出流 OutputStream
         *  3.使用网络字节输出流 OutputStream对象中的write方法给服务器发送数据
         *  4.使用Socket对象中的方法getInputStream() 获取此套接字的输入流 InputStream
         *  5.使用网络字节的输入流InputStream中的read方法读取服务器的回写的数据
         */
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes, 0, len));

        os.close();
    }
}
