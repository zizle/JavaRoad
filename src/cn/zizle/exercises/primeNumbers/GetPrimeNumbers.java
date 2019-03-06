package cn.zizle.exercises.primeNumbers;

// 题目：输入一个正整数，输出这个正整数以内的所有质数

import java.util.ArrayList;
import java.util.Scanner;

public class GetPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();
        System.out.println(n + "以内的所有质数：");
        System.out.println(getPrimeNumbers(n));

    }

    public static ArrayList<Integer> getPrimeNumbers(int n){
        // 创建数组存放结果集合
        ArrayList<Integer> primeNumbersArray = new ArrayList<>();
        // 加入2
        primeNumbersArray.add(2);
        for (int i = 3; i <= n; i++) {
            // 标记质数
            int flag = 1;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    flag = 0;
                }
            }
            if (flag == 1){
                primeNumbersArray.add(i);
            }
        }
        return primeNumbersArray;
    }
}
