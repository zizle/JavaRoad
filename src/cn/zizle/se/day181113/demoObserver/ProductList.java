package cn.zizle.se.day181113.demoObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    private List<String> productList = null;
    private static ProductList instance;
    private ProductList(){}

    // 取得单例产品列表
    public static ProductList getInstance(){
        if (instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    // 增加观察者
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    // 新增产品
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.err.println("产品列表新增了产品:" + newProduct);
        this.setChanged();  // 设置被观察对象发生了变化
        this.notifyObservers(newProduct);  // 通知观察者，并传递了新产品
    }
}
