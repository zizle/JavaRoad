package cn.zizle.se.day190306.demo01;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01WriteFile {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/se/day190306/demo01/";
        // 创建一个对象 FileWriter只能写纯文本文件
        // 构造方法中append为true时是追加写入
        FileWriter fileWriter = new FileWriter(path + "file01.txt", true);
        // 写入数据
        // 1. 写入单个字符
        fileWriter.write(65);
        // 2. 写入完整字符串
        fileWriter.write("\nHello World");  // 换行：Window-"\r\n", Linux-"\n"
        // 3. 写入部门字符串
        fileWriter.write("HELLO", 2, 3);  // len参数为长度，即几个字符
        // 4. 写入字符数组
        char[] array = {'j', 'a', 'v', 'a'};
        fileWriter.write(array);
        // 5. 写入部分数组
        fileWriter.write("\n");
        fileWriter.write(array, 1, 3);
        // 关闭
        fileWriter.close();
    }

}
