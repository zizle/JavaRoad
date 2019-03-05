package cn.zizle.se.day190305.demo01;


// 外部类与内部类
public class Demo01Main {
    public static void main(String[] args) {
        // 创建一个内部类对象
        Outer.Inner inner = new Outer(). new Inner();
        inner.interMethod();

        // 创建一个外部类对象
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
