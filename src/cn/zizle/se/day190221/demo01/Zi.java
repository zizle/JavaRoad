package cn.zizle.se.day190221.demo01;

public class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;

        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
