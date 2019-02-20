package cn.zizle.se.day190220.demo02;

//父类子类成员变量重名访问方式：两种方法中子类如果没有，将会向上找
//直接
//间接

public class Demo02Extend {
    public static void main(String[] args) {
        // 直接访问
        Zi zi = new Zi();
        System.out.println(zi.num);
        // 间接访问：成员方法，
        zi.method();
    }


}
