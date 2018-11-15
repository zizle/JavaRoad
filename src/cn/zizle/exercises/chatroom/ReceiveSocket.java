package cn.zizle.exercises.chatroom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ReceiveSocket extends Thread{
    Scanner sc = new Scanner(System.in);
    private ServerSocket serverSocket;
    public ReceiveSocket(int port) throws IOException{
        serverSocket = new ServerSocket(port);
    }
    public void run(){
        System.out.println("收发器开启...");
        while (true){
            try{
                Socket server = serverSocket.accept();
                System.out.println(server.getRemoteSocketAddress() + "进入了聊天！");
                DataInputStream in = new DataInputStream(server.getInputStream());
                // 读取接收到的消息
                System.out.println("收到消息：" + in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                // 发送消息
                System.out.print("发送消息:");
                String outMessage = sc.next();
                out.writeUTF(outMessage);
                server.close();
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("服务器异常退出");
                break;
            }

        }
    }

    public static void main(String[] args) {
        try{
            Thread t = new ReceiveSocket(6666);
            t.run();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
