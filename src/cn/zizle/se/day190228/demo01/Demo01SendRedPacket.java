package cn.zizle.se.day190228.demo01;

import java.util.ArrayList;

public class Demo01SendRedPacket {
    public static void main(String[] args) {
        // 实例化
        Manager manager = new Manager("群主", 200);
        Member member1 = new Member("成员1", 0);
        Member member2 = new Member("成员2", 10);
        Member member3 = new Member("成员3", 0);
        Member member4 = new Member("成员4", 5);
        Member member5 = new Member("成员5", 0);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();

        ArrayList<Integer> redList = manager.send(73, 5);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        member4.receive(redList);
        member5.receive(redList);

        System.out.println("================群主发了红包之后=================");

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();

    }
}
