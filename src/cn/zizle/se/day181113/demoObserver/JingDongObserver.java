package cn.zizle.se.day181113.demoObserver;

import java.util.Observable;
import java.util.Observer;

public class JingDongObserver implements Observer{
    @Override
    public void update (Observable o, Object product){
        String newProduct = (String) product;
        System.err.println("发送新产品【" + newProduct + "】同步到京东商城");
    }

}
