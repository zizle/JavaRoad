package cn.zizle.se.day190221.demo01;

/*
父类、子类、方法中变量重名访问方法
在子类中：
访问局部变量直接写；
访问本类成员变量 this.成员变量名
访问父类成员变量 super.成员变量名
*/

public class Demo01Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.method();
    }
}
