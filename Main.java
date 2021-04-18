package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("欢迎进入游戏迷你平台");
        System.out.println("\n");
        System.out.println("请选择您喜爱的游戏:");
        System.out.println("\n");
        System.out.println("********************");
        System.out.println("\t\t1.斗地主");
        System.out.println("\t\t2.斗牛");
        System.out.println("\t\t3.泡泡龙");
        System.out.println("\t\t4.连连看");
        System.out.println("*********************");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择，输入数字:");
        int number = scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("斗地主");
                break;
            case 2:
                System.out.println("斗牛");
                break;
            case 3:
                System.out.println("泡泡龙");
                break;
            case 4:
                System.out.println("连连看");
                break;
            default:
                System.out.println("抱歉");
        }
        System.out.println("您已进入斗地主房间！");
        System.out.println("""
                欢迎进入游戏平台
                
                选择你喜欢的游戏
                """);
    }
}
