package com.akuya.RealProblem;

/**
 * @author akuya
 * @create 2022-04-16-8:28
 */
import java.util.Arrays;
import java.util.Scanner;

public class CompetitionD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int temp[] = new int[N];
        int tempans[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            int high;
            int temph=i+1;
            if(temph!=temp.length) {
                while(temp[temph]==temp[i]) {
                    if(i==temp.length-1) {
                        high=0;
                        break;
                    }
                    temph++;
                }
                high=temp.length-temph;
            }else {
                high=0;
            }

            int templ=i-1;
            if(templ<0) {
                templ=0;
            }else {
                while(temp[templ]==temp[i]&&templ>=0) {
                    templ--;
                }
            }
            int low = templ+1;
            int cha = high - low;
            if(cha<=0) {
                tempans[i]=0;
                continue;
            }
            int pos = 0;
            if (cha % 2 == 0) {
                pos = cha / 2;
            } else if (cha % 2 != 0) {
                pos = cha / 2 + 1;
            }
            tempans[i] = temp[i + pos] -temp[i]+ 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] == temp[j]) {
                    System.out.print(tempans[j]+" ");
                }
            }
        }
        scanner.close();
    }

}

