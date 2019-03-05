package cn.zizle.se.day190305.demo03;

// 使用匿名内部类

public class DemoMain {
    public static void main(String[] args) {
        MyInterface interFace = new MyInterface() {  // 直接new接口，并跟{}重写所有方法
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        interFace.method();
    }
}
