package cn.zizle.se.day190228.demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    // 收红包
    public void receive(ArrayList<Integer> redList){
        // 随机产生一个索引
        int index = new Random().nextInt(redList.size());
        int delta = redList.remove(index);
        // 原先的钱数
        int money = super.getMoney();
        // 抢完红包设置余额
        super.setMoney(money + delta);
    }
}
