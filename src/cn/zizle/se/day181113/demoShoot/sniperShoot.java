package cn.zizle.se.day181113.demoShoot;

public class sniperShoot {
    public static void main(String[] args) {
        System.out.println("创建狙击手和敌人");
        Sniper sniper = new Sniper();
        Enemy enemy = new Enemy();

        System.out.println("查看敌人初始血量：");
        System.out.println(enemy.brood);

        System.out.println("查看狙击手初始血量：");
        System.out.println(sniper.brood);

        sniper.shoot(50);
        enemy.getShoot(50);
        System.out.println("查看敌人当前血量：");
        System.out.println(enemy.brood);

        sniper.shoot(146);
        enemy.getShoot(146);
        System.out.println("查看敌人当前血量：");
        System.out.println(enemy.brood);

        sniper.shoot(1000);
        enemy.hide();

        enemy.attack(50);
        sniper.getAttact(50);

        System.out.println("查看狙击手当前血量：");
        System.out.println(sniper.brood);

    }
}
