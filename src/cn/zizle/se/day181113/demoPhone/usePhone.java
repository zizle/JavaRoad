package cn.zizle.se.day181113.demoPhone;

public class usePhone {
    public static void main(String[] args) {
        Phone xs = new Phone();

        System.out.println("查看初始属性：");
        System.out.println(xs.brand);
        System.out.println(xs.color);
        System.out.println(xs.price);

        System.out.println("使用方法call：");
        xs.call("二愣子");

        System.out.println("使用方法senMessage：");
        xs.senMessage();

        System.out.println("赋予属性值。。。");

        xs.brand = "iPhone XS";
        xs.color = "土豪金";
        xs.price = 13888.0;

        System.out.println("查看赋值后的属性");
        System.out.println(xs.brand);
        System.out.println(xs.color);
        System.out.println(xs.price);

        System.out.println("使用方法call：");
        xs.call("牛逼人物");

        System.out.println("使用方法senMessage：");
        xs.senMessage();
    }
}
