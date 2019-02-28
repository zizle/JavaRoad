package cn.zizle.se.day190228.demo02;

public class MyInterfaceImpB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现类B实现了接口的抽象方法");
    }

    @Override
    public void methodDefault() {
        // 实现类覆盖重写了接口的默认方法
        System.out.println("实现类B覆盖重写了接口后来新增的默认方法");
    }
}
