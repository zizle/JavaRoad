package cn.zizle.se.day181106.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    //自定义方法
    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
