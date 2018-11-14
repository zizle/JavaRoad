package cn.zizle.se.day181113.demoPrivate;

public class Student {
    private String name;
    private boolean male;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setMale(boolean m){
        male = m;
    }

    public boolean isMale(){
        return male;
    }
}
