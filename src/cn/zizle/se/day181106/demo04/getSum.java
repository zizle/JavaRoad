package cn.zizle.se.day181106.demo04;

public class getSum {
    public static void main(String[] args) {
        System.out.println("结果是:" + sum());

    }
    public static int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
