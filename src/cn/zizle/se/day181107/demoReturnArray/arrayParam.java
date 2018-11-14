package cn.zizle.se.day181107.demoReturnArray;

public class arrayParam {
    public static void main(String[] args) {
        int[] array = retrunArray(10, 15, 30);
        System.out.println("总和是：" + array[0]);
        System.out.println("平均是：" + array[1]);
    }

    public static int[] retrunArray(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        return array;
    }
}
