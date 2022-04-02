package com.akuya.test;

/**
 * @author akuya
 * @create 2022-04-01-17:36
 */
public class DfsFullArrangement {
    static int arr[]={1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        dfs(0);
    }
    public static void dfs(int a){
        if(a==9){
          int temp=0;
          for(int x:arr){
              temp=temp*10+x;
          }
            System.out.println(temp);
          return;
        }

        for(int i=a;i<arr.length;i++){
         exch(i,a);
         dfs(a+1);
         exch(i,a);
      }
    }

    static void exch(int a,int b) {
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}
