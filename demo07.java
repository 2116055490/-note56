package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/25 10:21
 */
public class demo07 {
    public static void main(String[] args) {
        int [] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "个学生的成绩");
            scores[i] = scanner.nextInt();
        }
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
    }
}
