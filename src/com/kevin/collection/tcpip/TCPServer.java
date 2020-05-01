package com.kevin.collection.tcpip;

import sun.security.util.Length;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    /**
     * 接受客户端的请求，给客户端发送数据
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        /**
         * 服务器的创建
         * 1.创建对象ServerSocket
         * 2.使用accept() 侦听并接受到此套接字的连接。
         * 3.使用Socket对象中的方法getInputStream() 获取此套接字的输入流 InputStream
         * 4.使用网络字节的输入流InputStream中的read方法读取服务器的回写的数据
         * 5.用Socket对象中的方法getOutputStream() 获取此套接字的输出流 OutputStream
         * 6.使用网络字节输出流 OutputStream对象中的write方法给服务器发送数据
         */
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes, 0, len));
        OutputStream os = socket.getOutputStream();
        os.write("收到客户端的信息，谢谢".getBytes());
        socket.close();
        server.close();
    }
}
