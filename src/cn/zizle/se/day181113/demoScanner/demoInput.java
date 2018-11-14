package cn.zizle.se.day181113.demoScanner;

import java.util.Scanner;

public class demoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");

        int num = sc.nextInt();
        System.out.println("您输入的数字是：" + num);

    }

}
