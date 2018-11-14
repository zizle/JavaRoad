package cn.zizle.se.day181113.demoGame;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(101);
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("请输入您的猜测：");
            int guessNum = sc.nextInt();
            if(guessNum > randomNum){
                System.out.println("太大了，请重新猜！");
            }else if (guessNum < randomNum) {
                System.out.println("太小了，请重新猜！");
            }else{
                System.out.println("恭喜你！猜对了！");
                break;
            }
        }

    }
}
