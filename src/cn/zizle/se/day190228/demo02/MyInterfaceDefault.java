package cn.zizle.se.day190228.demo02;


// 定义一个接口类 interface
// 抽象类 abstract
public interface MyInterfaceDefault {
    // 1 定义一个抽象方法  (抽象类和接口类才能定义抽象方法)
    public abstract void methodAbs();

//     2 实现类投入使用后，接口新增一个抽象方法,马上引起实现类的出错。此时不能这样使用，只能使用默认方法
//    public abstract void methodAbs1();

    // 3 接口新增方法，默认方法
    public default void methodDefault(){
        System.out.println("接口新增的默认方法");
    }
}
