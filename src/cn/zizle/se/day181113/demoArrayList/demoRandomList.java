package cn.zizle.se.day181113.demoArrayList;


import java.util.ArrayList;
import java.util.Random;

// 生成6个随机整数，放到集合中，并遍历它
public class demoRandomList {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int n = r.nextInt(101);
            intArray.add(n);
        }
        System.out.println("添加完毕！");
        System.out.println("查看：");

        for (int i = 0; i < intArray.size(); i++) {
            System.out.println("第" + (i + 1) + "个数是：" + intArray.get(i));
        }

    }
}
