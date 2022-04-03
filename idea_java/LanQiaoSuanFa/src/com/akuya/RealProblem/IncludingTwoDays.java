package com.akuya.RealProblem;

/**
 * @description 小蓝特别喜欢 22，今年是公元 2020 年，他特别高兴，因为每天日历上都可以看到 22。
 *
 * 如果日历中只显示年月日，请问从公元 1900 年 1 月 1 日到公元 99 年 12 月 31 日，一共有多少天日历上包含 22。即有多少天中年月日的数位中包含数字 2。
 * @author akuya
 * @create 2022-04-01-17:55
 */

public class IncludingTwoDays {
    static int[] M={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        int result=0;
        int year=1900;
        int mouth=1;
        int day=0;
        while(year!=9999||mouth!=12||day!=31){
            if(year%400==0||(year%4==0&&year%100!=0)){
                M[2]=29;
            }else {
                M[2]=28;
            }
            day++;
            if(day>M[mouth]){
                mouth++;
                day=1;
            }
            if(mouth>12){
                year++;
                mouth=1;
                day=1;
            }
            if(check(year,mouth,day)){
                System.out.print(year+" ");
                System.out.print(mouth+" ");
                System.out.println(day);
                result++;
            }
        }
    }
    public static boolean check(int year,int mouth,int day) {
        while(year!=0){
            if(year%10==2){
                return true;
            }
            year=year/10;
        }

        while(mouth!=0){
            if(mouth%10==2){
                return true;
            }
            mouth=mouth/10;
        }

        while(day!=0){
            if(day%10==2){
                return true;
            }
            day=day/10;
        }

        return false;

    }
}
