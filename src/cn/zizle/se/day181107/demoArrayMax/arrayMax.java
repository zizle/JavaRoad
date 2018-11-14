package cn.zizle.se.day181107.demoArrayMax;

public class arrayMax {
    public static void main(String[] args) {
        int array[] = new int[] {1, 2,39,6,12,34,16,5,28,8};
        printMax(array);
    }
    public static void printMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("最大值是：" + max);
    }
}
