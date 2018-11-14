package cn.zizle.se.day181113.demoArrayListReturn;

/*
随机产生一个含有20个随机数的集合，自定义方法返回一个集合，元素是产生的随机数中的偶数
*/

import java.util.ArrayList;
import java.util.Random;

public class demoReturnArrayList {
    public static void main(String[] args) {
        // 产生随机数放在集合中
        Random r = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(101);
            bigList.add(num);
        }

        System.out.println("查看原来集合：");
        System.out.println(bigList);

        System.out.println("筛选集合！");
        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("得到的集合元素个数是:" + smallList.size());
        System.out.println("得到的集合是：");
        System.out.println(smallList);

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        // 创建小集合
        ArrayList<Integer> smallList = new ArrayList<>();
        // 遍历大集合，筛选元素
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }


}
