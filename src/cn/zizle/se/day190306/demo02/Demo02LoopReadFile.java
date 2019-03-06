package cn.zizle.se.day190306.demo02;

import java.io.FileReader;
import java.io.IOException;

public class Demo02LoopReadFile {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/se/day190306/demo02/";
        FileReader fileReader = new FileReader(path + "file01.txt");
//        singleCharLoop(fileReader);  // 单个循环读取内容
        manyCharLoop(fileReader);  // 分批次读取内容

    }

    public static void singleCharLoop(FileReader fileReader) throws IOException {
        int c;
        while ((c = fileReader.read())!= -1){
            System.out.println((char) c);
        }
        fileReader.close();
    }

    public static void manyCharLoop(FileReader fileReader) throws IOException {
        char[] buf = new char[3];
        int len;
        while ((len = fileReader.read(buf))!= -1){
            String str = new String(buf, 0, len);
            System.out.println(str);
        }
        fileReader.close();
    }

}
