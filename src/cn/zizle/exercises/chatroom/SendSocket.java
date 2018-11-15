package cn.zizle.exercises.chatroom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SendSocket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入1开始发送消息:");

        while ("1".equals(sc.next())){

            try{
                System.out.println("开启发收器...");
                Socket client = new Socket("127.0.0.1", 6666);
                System.out.println("连接上了收发器！");
                OutputStream outToServer = client.getOutputStream();
                DataOutputStream out = new DataOutputStream(outToServer);
                // 发送消息
                System.out.print("发送消息：");
                String outMessage = sc.next();
                out.writeUTF(outMessage);
                System.out.println("按'1'继续：");

                // 接收消息
                InputStream inFromServer = client.getInputStream();
                DataInputStream in = new DataInputStream(inFromServer);
                System.out.print("收到消息:" + in.readUTF());
                client.close();
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("发生异常退出");
                break;
            }
        }
    }
}
