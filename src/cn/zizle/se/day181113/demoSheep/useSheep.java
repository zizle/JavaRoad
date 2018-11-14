package cn.zizle.se.day181113.demoSheep;

public class useSheep {
    public static void main(String[] args) {

        Sheep sheep = new Sheep();
        System.out.println("使用方法eat:");
        sheep.eat();

        System.out.println("修改属性:");
        sheep.name = "山羊";
        sheep.color = "黑色";
        sheep.weight = 80.0;

        System.out.println("使用方法eat:");
        sheep.eat();
    }
}
