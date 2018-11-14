package cn.zizle.se.day181106.demo05;

public class printHelloWorld {
    public static void main(String[] args) {
        printMethod(5);

    }

    public static void printMethod(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("hello world!" + i);
        }
    }
}
