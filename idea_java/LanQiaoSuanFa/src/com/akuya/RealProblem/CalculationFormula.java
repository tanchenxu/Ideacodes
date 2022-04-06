package com.akuya.RealProblem;

/**
 * @ 图片，找不到出处，简单说是  a+b/c+def/ghi abcdefghi各不相同1-9
 * @author akuya 运用全排列
 * @create 2022-04-05-20:40
 */

public class CalculationFormula {
    static int arr[]={1,2,3,4,5,6,7,8,9};
    static int result=0;
    public static void main(String[] args) {
        dfs(0);
        System.out.println(result);
    }
    public static void dfs(int k) {
        if(k==9){
            if(check()){
                result++;
                return;
            }
        }

        for(int i=k;i<arr.length;i++){
            exch(i, k);
            dfs(k+1);
            exch(i, k);
        }

    }

    public static boolean check(){
        int x = arr[3] * 100 + arr[4] * 10 + arr[5];
        int y = arr[6] * 100 + arr[7] * 10 + arr[8];
        if ((arr[1] * y + arr[2] * x) % (y * arr[2]) == 0 && arr[0] + (arr[1] * y + arr[2] * x) / (y * arr[2]) == 10) {
            return true ;
        }
        return false;
    }

    public static void exch(int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
