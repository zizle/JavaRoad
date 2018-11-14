package cn.zizle.se.day181113.demoPhone;

public class Phone {
    String brand;
    String color;
    double price;

    public void call(String who){
        System.out.println("给" + who + "打电话！");
    }

    public void senMessage(){
        System.out.println(brand + "正在群发短信！");
    }
}
