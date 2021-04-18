package edu.xcdq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/25 10:01
 */
public class demo06 {
    public static void main(String[] args) {
        int score [ ] = new int [5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i+1) + "个元素");
            score [i] = scanner.nextInt();
        }
        System.out.println("排序前");
        for(int i = 0; i< score.length; i++){
            System.out.print(score[i]+ "\t");
        }
        //排序 sort排序
        Arrays.sort(score);

        System.out.println("排序后");
        for(int i = 0; i< score.length; i++) {
            System.out.print(score[i] + "\t");
        }
    }
}
