package cn.zizle.se.day181114;

// 求出在-10.8 到 2.1之间所有绝对值大于等于6，或者小于2的数有几个

// 求直径为6的圆的面积

public class PracticeMath {
    public static void main(String[] args) {
        int count = getAbs(-10.8, 2.1);
        System.out.println("符合条件的数个数是：" + count + "个");
        System.out.println("直径为6的圆的面积是：" + getArea(3));
    }


    public static int getAbs(double min, double max){
        // 将最大值和最小值取整
        double minNum = Math.ceil(min);
        double maxNum = Math.floor(max);
        int count = 0;
        for (double i=minNum; i<=maxNum; i++){
            int abs = Math.abs((int)i);
            if (abs >= 6 || abs < 2){
                System.out.println(i);
                count += 1;
            }
        }
        return count;
    }

    public static double getArea(int r){
        double area = Math.PI * (r * r);
        return area;
    }
}
