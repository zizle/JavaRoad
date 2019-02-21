package cn.zizle.se.day190221.demo02;


/*
继承中父类与子类拥有重名方法，先访问本类方法，没有则向上找。

继承关系中方法的：
重写(override): 在继承关系中，方法名称一样，参数列表也一样。覆盖，覆写。
重载(overload): 在继承关系中，方法名称一样，参数列表不一样。
 */
public class Demo02ExtendMehod {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
