package cn.zizle.se.day190228.demo02;


// 接口中定义私有方法只有在java9之后才可以

public interface MyInterfacePrivate {
    // 接口中的默认方法出现重复代码
    public default void methodDefault1(){
        System.out.println("默认方法1");
    };

    public default void methodDefault2(){
        System.out.println("默认方法2");
    };

    // 定义私有方法
//    private void method1(){
//        // 默认方法中重复的逻辑
//    }

    // 接口中静态方法出现重复代码
    public static void methodStatic1(){
        System.out.println("静态方法1");
    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
    }
    // 定义私有方法供静态方法调用
//    private static void method2(){
//        // 静态方法中重复的逻辑
//    }

}
