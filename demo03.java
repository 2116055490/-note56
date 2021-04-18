package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/3/25 8:25
 */
public class demo03 {
    public static void main(String[] args) {
        int [] scores;  //声明  :告诉操作系统有一个数组变量   scores
        int [ ] scores1 = new  int [5];  //声明初始化  申请了内存空间 申请空间成功 则在内存中初始化为0
        for(int i = 0; i<5 ; i++){
            System.out.print(scores1[i] + "\t");
        }
        //定义： 给定元素的值
        scores1[0] = 45;
        scores1[2] = 34;
        scores1[3] = 54;
        scores1[4] = 87;

        /*
        * 数组的3种定义
        * */
        //1
        int [] array1 = new  int[3];
        for(int i=0;i<3; i++)
            array1[i] = i;
        //2
        int [] array2 = new int[]{0,1,2};  // 申请空间并初始化直接给定0，1 2

        //3
        int[] array3 = {0,1,2};  //创建的时候直接给定值 0 1 2
    }
}
