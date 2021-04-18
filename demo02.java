package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/23 17:44
 */
public class demo02 {
    public static void main(String[] args) {
        System.out.println("""
                迷你游戏平台 > 游戏币支付
                
                请选择你玩的游戏类型
                     1.牌类
                     2.修心经济类
                """);
        Scanner scanner = new Scanner(System.in);
        int game = scanner.nextInt();
        System.out.println("请输入游戏时长：");
        
    }
}
