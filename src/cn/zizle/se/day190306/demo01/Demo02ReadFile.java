package cn.zizle.se.day190306.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo02ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/se/day190306/demo01/";
        FileReader fileReader = new FileReader(path + "file01.txt");
        // 读取单个字符
        int c = fileReader.read();
        System.out.println((char) c);
        // 利用字符数组读取字符
        char[] buf = new char[3];
        int len = fileReader.read(buf); // 按长度读取字符，len为读取的有效字符长度
        String str = new String(buf, 0, len);
        System.out.println("len=" + len);
        System.out.println("str=" + str);
    }


}
