package cn.zizle.se.day190308.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo01UseStream {
    public static void main(String[] args) {
        ArrayList<String> recordList = new ArrayList<>();
        recordList.add("赵丽颖,98");
        recordList.add("胡歌,95");
        recordList.add("鹿晗,90");
        recordList.add("迪丽热巴,88");

        // 集合使用流
        recordList.stream().map((String str) -> {
            String score = str.split(",")[1];
            return score;
        }).map((String str) -> {
            Integer score = Integer.parseInt(str);
            return score;
        }).filter((Integer score)->{
            boolean b = score >= 90;
            return b;
        }).forEach(System.out::println);

    }
}
