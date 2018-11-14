package cn.zizle.se.day181113.demoGame;

import java.util.Random;
import java.util.Scanner;

public class guessNumber2 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(101);

        Scanner sc = new Scanner(System.in);
        int flag = 0;
        while (true){
            if (flag == 3){
                System.out.println("不好意思，次数耗尽...");
                System.out.println("您输了！");
                break;
            }
            System.out.println("请输入您的猜测：");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum){
                System.out.println("太大了，再来一次！");
                flag += 1;
            }else if (guessNum < randomNum){
                System.out.println("太小了，在来一次！");
                flag += 1;
            }else{
                System.out.println("恭喜你，猜对了！");
                break;

            }
        }
    }
}
