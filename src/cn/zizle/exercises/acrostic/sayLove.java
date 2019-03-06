package cn.zizle.exercises.acrostic;

import java.io.*;
import java.util.ArrayList;

public class sayLove {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/exercises/acrostic/";
        // 读取文件
        BufferedReader br = new BufferedReader(new FileReader(path + "love.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();

        // 写入新文件
        BufferedWriter bw = new BufferedWriter(new FileWriter(path + "love2.txt"));
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            if (i != 0){
                bw.newLine();
            }

        }

        bw.close();
    }

}
