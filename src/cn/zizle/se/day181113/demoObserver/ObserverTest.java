package cn.zizle.se.day181113.demoObserver;

public class ObserverTest {
    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);

        observable.addProduct("iPhone XS");
    }
}
