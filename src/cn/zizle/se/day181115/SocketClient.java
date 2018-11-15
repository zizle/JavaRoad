package cn.zizle.se.day181115;

import java.io.*;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
//        String serverName = args[0];
        String serverName = "127.0.0.1";  // 要连接的远程主机ip
//        int port = Integer.parseInt(args[1]);
        int port = 6666;
        try{
            System.out.println("连接到主机：" + serverName + ", 端口号：" + port);
            Socket client = new Socket(serverName, port);  // 实例化连接服务器的客户端
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            // getOutputStream()返回此套接字的输出流
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("服务器你好，我是"+ client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应：" + in.readUTF());
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
