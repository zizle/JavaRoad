package cn.zizle.se.day190228.demo01;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    // 发红包的方法
    public ArrayList<Integer> send(int totalMoney, int count){
        // 红包集合
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        // 判断
        if(leftMoney < totalMoney){
            System.out.println("您的余额不足！");
            return redList;
        }
        // 发红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod);
        // 设置余额
        super.setMoney(leftMoney - totalMoney);
        // 发出红包
        return redList;
    }
}
