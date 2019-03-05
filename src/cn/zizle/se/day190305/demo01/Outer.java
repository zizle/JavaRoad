package cn.zizle.se.day190305.demo01;

public class Outer {
    public int num = 10;
    public class Inner{
        public int num = 20;
        public void interMethod(){
            int num = 30;
            System.out.println("内部类方法");
            System.out.println("访问内部类局部变量：" + num);
            System.out.println("访问内部类成员变量：" + this.num);
            System.out.println("访问外部类成员变量：" + Outer.this.num);

        }
    }

    public void outerMethod(){
        int num = 40;
        System.out.println("外部类方法");
        System.out.println("访问局部变量：" + num); // 40
        System.out.println("访问内部类成员变量：" + new Inner().num); // 20
    }
}
