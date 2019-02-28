package cn.zizle.se.day190228.demo02;

public class Demo01MyInterfaceDefault {

    public static void main(String[] args) {
        // 实例化实现类
        MyInterfaceImpA a = new MyInterfaceImpA();
        MyInterfaceImpB b = new MyInterfaceImpB();

        // 运行方法
        a.methodAbs();
        b.methodAbs();

        // 添加了默认方法后的接口的使用
        a.methodDefault();
        b.methodDefault(); // B实现类可以重写默认方法
    }
}
