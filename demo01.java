package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/23 16:46
 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println("迷你游戏平台 > 游戏晋级");
        Scanner scanner = new Scanner(System.in);
        String shifou ="";
        int count = 0; //统计80分以上的局数
        for(int i = 0; i < 5; i++){
            System.out.println("你正在玩第" + (i+1) + "局，成绩为");
            int score = scanner.nextInt();
            boolean flag = true;
            if(score>=80){
                count++;
            }
            if(i<4){
                System.out.println("继续玩下一局吗 （y/n）");
                shifou = scanner.next();
            }
            if("n".equals(shifou)){  //建议把确定有值的字符串写前面
                flag = false;
                break;
            }
            if(i<4){
                System.out.println("进入下一局");
            }
            System.out.println("游戏结束");
            if(flag){
                double rate = count / 5.0;   //3/5  0.....3
                System.out.println(rate);
                if(rate >= 0.8){
                    System.out.println("恭喜！通过一级");
                }else if(rate >= 0.6){
                    System.out.println("恭喜！通过二级");
                }else{
                    System.out.println("太菜了，无法通过");
                }

            }


        }
    }
}
