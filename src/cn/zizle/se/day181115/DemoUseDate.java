package cn.zizle.se.day181115;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoUseDate {

    public static void main(String[] args) {
//        System.out.println(getCurrentTime());
        parseStringToDate();
    }

    public static String getCurrentTime(){
        Date date = new Date();
        // 使用toString转变格式
        String strDate1 = date.toString();  // Thu Nov 15 10:56:23 CST 2018
        // 使用SimpleDateFormat改变格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String strDate2 = ft.format(date);
        return strDate2;
    }

    public static void parseStringToDate(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入字符串:");
//        String input = sc.next();
        String input = "1818-11-11 11:20:30";  // 12点会解析为00点
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date t = null;
        try{
            t = ft.parse(input);
        }catch (ParseException e){
            System.out.println("无法解析。");
        }
        System.out.println("转化为:");
        System.out.println(t);
    }
}
