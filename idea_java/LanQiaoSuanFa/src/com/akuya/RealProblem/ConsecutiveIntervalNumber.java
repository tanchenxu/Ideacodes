package com.akuya.RealProblem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description 小明这些天一直在思考这样一个奇怪而有趣的问题：
 *
 * 　　在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：
 *
 * 　　如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。
 *
 * 　　当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。
 * @author akuya
 * @create 2022-04-01-17:52
 */
/*标答
 *
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;++i) arr[i]=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;++i) {
			int max=arr[i];
			int min=arr[i];
			for(int j=i;j<n;++j) {
				max=Math.max(max, arr[j]);
				min=Math.min(min,arr[j]);
				if(max-min==j-i) ans++;
			}
		}
		System.out.println(ans);
	}
}
 */
public class ConsecutiveIntervalNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int numbers[]=new int [number];
        for(int i=0;i<number;i++){
            numbers[i]=scanner.nextInt();
        }
        int result=0;
        for(int i=0;i<number;i++){
            for(int j=i;j<number;j++){
                int temp[]=new int [j-i+1];
                System.arraycopy(numbers, i, temp, 0, temp.length);
                Arrays.sort(temp);
                if(temp[temp.length-1]-temp[0]==temp.length-1){
                    result++;
                }
            }

        }
        System.out.println(result);
        scanner.close();
    }
}

