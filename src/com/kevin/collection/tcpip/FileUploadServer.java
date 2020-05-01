package com.kevin.collection.tcpip;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadServer {

    public static void main(String[] args) throws IOException {
        //创建服务器套接字对象
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            //获取客户端的套接字对象
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        //获取客户端套接字的输入流
                        InputStream is = socket.getInputStream();
                        //判断服务器上硬盘需要写入的文件是否存在，不存在新建
                        File file = new File("C:\\Users\\kevin\\Desktop\\ps激活");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String fileName = "kevin" + System.currentTimeMillis() + new Random().nextInt(8888);
                        //创建服务器本地的输出流
                        FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        //使用客户端套接字对象的输入流读取客户端上传的文件
                        while ((len = is.read(bytes)) != -1) {
                            //写入到服务器的硬盘上
                            fos.write(bytes, 0, len);
                        }
                        //获取客户端套接字的输出流对象
                        OutputStream os = socket.getOutputStream();
                        //给客户端发送成功信息
                        os.write("文件上传成功".getBytes());
                        //关闭流
                        fos.close();
                        socket.close();
                        //server.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });


        }
    }
}
