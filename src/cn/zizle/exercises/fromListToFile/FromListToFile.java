package cn.zizle.exercises.fromListToFile;

// 题目：
// 定义一个集合存储多个字符串,向其中添加一些字符串,
// 再将集合写到文件中去,要求每个字符串独占一行

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FromListToFile {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/exercises/fromListToFile/";
        // 创建集合并添加字符串
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        // 创建BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter(path + "test.txt"));
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i == list.size()-1){
                bw.write(str);
            }else{
                bw.write(str);
                bw.newLine();
            }
        }
        bw.close();
    }
}
