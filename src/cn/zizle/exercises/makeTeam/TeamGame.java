package cn.zizle.exercises.makeTeam;

import sun.misc.ASCIICaseInsensitiveComparator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamGame {
    public static void main(String[] args) throws IOException {
        // 存储文件的路径
        String path = "./src/cn/zizle/exercises/makeTeam/friends.txt";
        // 创建集合存储
        ArrayList<Hero> list = new ArrayList<Hero>();

        // 读取文件内容
        readFriendsMessage(list, path);

        boolean isNew = list.isEmpty();
        // 判断是否为首次创建
        if (isNew){
            createHero(list);
            writeFriendsMessage(list, path);
        }

        showTeam(list);  // 队伍展示

        System.out.println("退出游戏");
    }

    /*
    读取文件信息
     */
    public static void readFriendsMessage(ArrayList<Hero> list, String path) throws IOException{
        // 创建读取文件的对象
        BufferedReader br = new BufferedReader(new FileReader(path));
        // 遍历读取文件
        String line;
        while ((line=br.readLine())!=null){
            // 分割line内容
            String[] lineList = line.split(",");
            String name = lineList[0];
            int attack = Integer.parseInt(lineList[1]);
            String type = lineList[2];
            Hero hero = new Hero(name, attack, type);
            list.add(hero);  // 无需返回，因为是引用类型的参数，会改变原来的集合
        }
        br.close();
    }

    // 创建对象
    public static void createHero(ArrayList<Hero> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "位英雄的名字：");
            String name = sc.next();
            System.out.println("请输入第" + i + "位英雄的战力：");
            int attack = sc.nextInt();
            System.out.println("请输入第" + i + "位英雄的类型：");
            String type = sc.next();
            // 创建英雄
            Hero hero = new Hero(name, attack, type);
            list.add(hero);
        }
    }

    // 信息写入文件
    public static void writeFriendsMessage(ArrayList<Hero> list, String path) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            String message = hero.getName() + "," + hero.getAttack() + "," + hero.getAttack();
            bw.write(message);
            bw.newLine();
        }
        bw.close();
    }

    // 展示队伍阵容,并计算总战力
    public static void showTeam(ArrayList<Hero> list){
        int totalAttack = 0;
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            System.out.println("第" + (i+1) + "位队员\t名字：" + hero.getName() + "\t战力："+ hero.getAttack() +"\t类型："+ hero.getType());
            totalAttack += hero.getAttack();
        }
        System.out.println("队伍总战力：" + totalAttack);
    }
}
