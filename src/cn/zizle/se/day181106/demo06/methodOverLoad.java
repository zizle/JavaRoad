package cn.zizle.se.day181106.demo06;

public class methodOverLoad {
    public static void main(String[] args){
        System.out.println(isSame((byte) 10, (byte) 20));
        System.out.println(isSame(20, 20));
        System.out.println(isSame(10L, 20L));
        System.out.println(isSame((short) 30, (short) 32));

    }

    public static boolean isSame(byte a, byte b){
        System.out.println("两个byte方法执行！");
        boolean same;
        if (a == b) {
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b){
        System.out.println("两个short方法执行！");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(long a, long b){
        System.out.println("两个long方法执行！");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b){
        System.out.println("两个int方法执行！");
        return a == b;
    }
}
