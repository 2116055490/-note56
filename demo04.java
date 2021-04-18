package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/25 9:19
 */
public class demo04 {
    public static void main(String[] args) {
        int []  number  = new int[] {8,4,2,1,23,344,12};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + "\t");
            sum += number[i];
        }
        System.out.println("和为“" +sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的数据");
        int shushu = scanner.nextInt();
        boolean flag = true;
        for (int i = 0; i < number.length; i++) {
            if(shushu == number[i]){
                flag = false;
                System.out.println("恭喜你猜中了");
                break;
            }
        }
        if(flag){
            System.out.println("你猜中的不存在");
        }




    }
}
