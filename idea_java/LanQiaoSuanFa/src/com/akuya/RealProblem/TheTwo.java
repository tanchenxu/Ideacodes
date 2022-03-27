package com.akuya.RealProblem;

/**
 * @description 如果一个整数的某个数位包含 2 ，则称这个数为一个“最2数字”。例如：102、2021 都是最2数字。
 * 请问在 1（含） 到 2021（含） 中，有多少个最2数字。
 * @author akuya
 * @create 2022-03-27-14:07
 * 连续做了两个简单题，要么觉得自己太傻，要么细节十分不到位，需要多多练题！！！！！！！！
 */
public class TheTwo {
    public static void main(String[] args) {
        int result=0;
        for(int i=12;i<=2021;i++){
            int n=i;
            while (n!=0){
                if(n%10==2){
                    result++;
                    break;
                }
               n= n/10;
            }
        }
        System.out.println(result);
    }
}
