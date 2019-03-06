package cn.zizle.se.day190306.demo02;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01LoopWriteFile {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/se/day190306/demo02/";
        FileWriter fileWriter = new FileWriter(path + "file01.txt");
        String str = "我是中国人,\n我爱祖国！";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            fileWriter.write(c);
        }
        fileWriter.close();
    }
}
