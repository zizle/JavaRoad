package cn.zizle.se.day181115;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class SocketServer extends Thread{
    private ServerSocket serverSocket;
    public SocketServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);  // 实例化服务器套接字
//        serverSocket.setSoTimeout(10000);  // 超时未连接即关闭
    }

    public void run(){
        while(true){
            try{
//                System.out.println(serverSocket.getLocalSocketAddress());
                // getLocalPort()返回本服务器绑定的端口
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort());
                // accept()返回上一个新的socket引用，该socket是连接到客户端的socket
                Socket server = serverSocket.accept();
                // getRemoteSocketAddress()返回此套接字连接的端点的地址，未连接则是null
                System.out.println("远程主机地址："+ server.getRemoteSocketAddress());
                // 服务器输入流，server.getInputStream()返回此套接字的输入流
                DataInputStream in = new DataInputStream(server.getInputStream());
                // readUTF()读入一个已使用UTF-8修改版格式编码的字符串
                System.out.println(in.readUTF());
                // 服务器输出流， server.getOutputStream()返回此套接字的输出流
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                // writeUTF(String s) 将表示长度信息的两个字节写入输出流，后跟字符串s中每个字符的UTF-8修改版表示形式
                out.writeUTF(server.getLocalAddress() + "你已经连接上我了！");
                server.close(); // 关闭套接字
            }catch (SocketTimeoutException s){
                System.out.println("连接超时！");
                break;
            }catch(IOException e){
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
//        int port = Integer.parseInt(args[0]);
        int port = 6666;
        try{
            Thread t = new SocketServer(port);
            t.run();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
