package cn.zizle.se.day181113.demoPrivate;

public class useStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("小二");
        System.out.println("名字是：" + stu.getName());


        stu.setMale(true);
        System.out.println("是否是男的:" + stu.isMale());
    }

}
