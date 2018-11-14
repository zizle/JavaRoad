package cn.zizle.se.day181113.demoShoot;

public class Sniper {
    int brood = 100;
    String name = "狙击手";

    public void shoot(int num){
        System.out.println("狙击手开枪了...攻击力为：" + num);

    }

    public void getAttact(int num){
        System.out.println("狙击手被反击, 防御20");
        brood -= num-20;
    }
}
