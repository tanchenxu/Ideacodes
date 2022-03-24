package com.akuya.DFS;

import java.util.Scanner;

/**
 * @author akuya
 * @create 2022-03-20-10:31
 */

//1.9.2.1.6.8.0.1
public class ElectronicMask {
    static String str=new String();
    static StringBuilder result=new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        str=scanner.nextLine();//我对这个电子掩码的个数要求也不太清晰，暂定八个
        int level=1;
        int pos=-1;
        StringBuilder capacity=new StringBuilder();
        dsf(str,level,pos,capacity);
        System.out.println(result);
        

    }
    public static void dsf(String str,int level,int pos,StringBuilder capacity){

        if(level==5||pos==str.length()-1){
            if(level==5&&pos==str.length()-1)
            result=result.append(capacity+"/");
            return;
        }
        for(int i=1;i<4;i++) {
            if (pos + 1 +i<= str.length()) {
                String temp = str.substring(pos + 1, pos + 1 + i);
                int x = Integer.parseInt(temp);
                if (x < 255 && (x == 0 || !temp.startsWith("0"))) {
                    capacity.append(temp);

                    if (level < 4) {
                        capacity.append(".");
                    }
                    dsf(str, level + 1, pos + i, capacity);
                    if(level==4){
                        capacity.delete(capacity.length()-temp.length(),capacity.length());
                    }else{
                        capacity.delete(capacity.length()-temp.length()-1,capacity.length());
                    }
                }

            }else{
                dsf(str, level + 1, pos , capacity);
        }

        }
    }
}
