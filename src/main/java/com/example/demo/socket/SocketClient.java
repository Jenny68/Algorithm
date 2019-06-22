package com.example.demo.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-22 下午3:48
 */
public class SocketClient {
    public static void main(String[] args) throws Exception{
        String localHost = "127.0.0.1";
        Socket socket = new Socket(localHost, 8888);
        OutputStream outputStream = socket.getOutputStream();
        String message = "Hello Server";
        outputStream.write(message.getBytes("UTF-8"));
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get the message from Server: " + sb);

        inputStream.close();
        outputStream.close();
        socket.close();


    }
}
