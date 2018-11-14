package cn.zizle.se.day181113.demoArrayList;

import java.util.ArrayList;

public class demoStudentList {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Student> stuList = new ArrayList<>();
        // 创建学生类
        Student stu1 = new Student("学生1", 10);
        Student stu2 = new Student();
        Student stu3 = new Student("学生3", 20);
        Student stu4 = new Student("学生4", 25);

        // 添加学生
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);

        System.out.println(stuList);
        // 遍历集合
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println("第" + (i + 1) + "个学生姓名是:" + stuList.get(i).getName());
            System.out.println("第" + (i + 1) + "个学生年龄是:" + stuList.get(i).getAge());
            System.out.println();

        }

    }
}
