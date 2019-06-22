package com.example.demo.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-22 下午3:40
 */
public class SocketServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);
        System.out.println("Server 等待连接的到来");
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get Message form Client: " + sb);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello Client, I get the Mesage".getBytes("UTF-8"));

        inputStream.close();
        outputStream.close();
        socket.close();
        server.close();

    }
}
