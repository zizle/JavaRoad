package cn.zizle.se.day190228.demo02;

// 定义接口实现类A
public class MyInterfaceImpA implements MyInterfaceDefault {
    // 实现类要实现接口的抽象方法
    @Override
    public void methodAbs() {
        System.out.println("实现类A实现了抽象方法");
    }
}
