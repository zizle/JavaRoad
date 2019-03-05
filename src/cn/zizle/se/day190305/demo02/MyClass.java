package cn.zizle.se.day190305.demo02;

public class MyClass {

    public void method(){
        int num = 10; // 如果局部内部类使用了该变量，那么它就是final型的
        // 局部内部类
        class Inner{
            public void methodInner(){
                System.out.println(num);  // 局部内部类使用了方法的局部变量
            }
        }

        // 局部内部类只能在自己方法中使用
        Inner inner = new Inner();
        inner.methodInner();
    }
}
