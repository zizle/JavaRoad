package cn.zizle.se.day181113.demoShoot;

public class Enemy {
    int brood = 1000;
    String name = "敌人";

    public void hide(){
        System.out.println("敌人躲开了...");
    }

    public void getShoot(int num){
        System.out.println("敌人中枪了， 掉血" + num);
        brood -= num;
    }

    public void attack(int num){
        System.out.println("敌人反击, 攻击力" + num);
    }
}
