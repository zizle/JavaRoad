package cn.zizle.se.day190308.demo01;

public class Demo01HireSister {
    public static void main(String[] args) {
        // 正常的Lambda表达式
        hireSister(food -> System.out.println("将" + food + "煮成可口的菜肴。"));
        /*
        * 如果Lambda表达式的方法体已经在别的类中有定义一模一样的方法，则可以更优写法引用
        * 这里我们Cook类中的cook()方法和上文的Lambada方法体一致，可以用以下写法
        */
        hireSister(Cook::cook);
    }

    public static void hireSister(Sister sister){
        sister.cook("白菜");
    }
}
