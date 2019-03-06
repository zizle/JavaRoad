package cn.zizle.exercises.fromFileToList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FromFileToList {
    public static void main(String[] args) throws IOException {
        String path = "./src/cn/zizle/exercises/fromListToFile/";
        BufferedReader br = new BufferedReader(new FileReader(path+"test.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list.add(line);
        }

        // 遍历查看集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
