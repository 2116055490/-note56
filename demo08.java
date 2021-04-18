package edu.xcdq;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/25 10:34
 */
public class demo08 {
    public static void main(String[] args) {

        //插入新数组  保持原数组有序
        int [] scores = new int[7];

        scores[0] = 99;
        scores[1] = 88;
        scores[2] = 77;
        scores[3] = 66;
        scores[4] = 55;
        scores[5] = 44;
        //获取要插入的值
        System.out.println("请输入插入的值");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //2 找到插入新值的位置
        int index  = 0;
        for (int i = 0; i < scores.length; i++) {
            if(num > scores[i]){  //找到数组中第一个比num小的值，该位置是num要插入的位置
                index = i;  //把位置记录在index中
                 break;
            }
        }
        //3  把元素向后移动  index      length-1  之间全部数据向后移动一位
        for(int i = scores.length -1; i>index;i--){
            System.out.println("把" + (i-1) +"位置的元素" + scores[i-1]+"移动到" +i +"位置"+scores[i]);
            scores[i] = scores[i-1];
            System.out.println(Arrays.toString(scores));

        }

        //4  插入新值
        System.out.println("在" + index + "位置 " + scores[index] + "插入新值" + num);
        scores[index] = num;

        //5 打印插入后的结果
        //降序
        System.out.println("插入后结果为：降序");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t");
        }
        System.out.println();
        System.out.println("升序：");
        for(int i = scores.length-1; i>=0;i--){
            System.out.println(scores[i] + "\t");
        }

    }
}
