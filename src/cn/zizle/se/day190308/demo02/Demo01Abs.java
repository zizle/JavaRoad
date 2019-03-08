package cn.zizle.se.day190308.demo02;

public class Demo01Abs {
    public static void main(String[] args) {
        // 写Lambda表达式
        methodAbs(num -> {
            return (num < 0 )? -num : num;
        });
        // 使用方法引用
        methodAbs(Math::abs);
    }

    public static void methodAbs(GetAbs getAbs){
        int ret = getAbs.getStatic(-45);
        System.out.println("结果是：" + ret);
    }

}
