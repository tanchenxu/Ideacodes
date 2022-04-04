package com.akuya.RealProblem;

/**
 * @description 四平方和定理，又称为拉格朗日定理：
 *
 * 每个正整数都可以表示为至多 44 个正整数的平方和。
 *
 * 如果把 00 包括进去，就正好可以表示为 44 个数的平方和。
 *
 * 比如：
 *
 * 5=0^2+0^2+1^2+2^2
 * 7=1^2+1^2+1^2+2^2
 *
 * 对于一个给定的正整数，可能存在多种平方和的表示法。
 *
 * 要求你对 4 个数排序：
 *
 * 0≤a≤b≤c≤d
 *
 * 并对所有的可能表示法按 a,b,c,d为联合主键升序排列，最后输出第一个表示法。
 * ————————————————
 * 版权声明：本文为CSDN博主「执 梗」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_57487901/article/details/123290508
 * @author akuya
 * @create 2022-04-04-17:15
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Node{
    int x;
    int y;

    public Node () {

    }

    public Node (int a ,int b) {
        Node.this.x=a;
        Node.this.y=b;
    }
}


public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        Map<Integer, Node> map=new HashMap<>();
        for(int c=0;(c*c)<=n;c++){
            for(int d=c;c*c+d*d<=n;d++){
                int temp=c*c+d*d;
                if(!map.containsKey(temp)){
                    map.put(temp, new Node(c,d));
                }
            }
        }

        for(int a=0;a*a<=n;a++){
            for(int b=a;b*b+a*a<=n;b++){
                if(map.containsKey(n-a*a-b*b)){
                    System.out.println(a+" "+b+" "+map.get(n-a*a-b*b).x+" "+map.get(n-a*a-b*b).y);
                    return;
                }
            }
        }
    }
}

/*
public class SumOfSquares {
	static Map<Integer,Node> map=new HashMap<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        //注意abcd枚举时的判断条件
		for(int c=0;c*c<=n;++c) {
			for(int d=c;d*d+c*c<=n;d++) {
				int t=c*c+d*d;
				if(!map.containsKey(t)) {
					map.put(t, new Node(c,d));
				}
			}
		}
		for(int a=0;a*a<=n;++a) {
			for(int b=a;a*a+b*b<=n;++b) {
				int ans=n-a*a-b*b;
				if(map.containsKey(ans)) {
					System.out.println(a+" "+b+" "+map.get(ans).x+" "+map.get(ans).y);
					return;
				}
			}
		}

	}
}
*/
