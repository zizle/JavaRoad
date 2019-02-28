package cn.zizle.se.day190228.demo02;

// 接口中的静态方法
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("接口中的静态方法,静态方法和对象没有关系，使用方式为接口类.方法名称(参数)");
    }
}
