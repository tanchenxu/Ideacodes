package com.akuya.DFS;

/**
 * @author akuya
 * @create 2022-03-21-20:36
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 */

public class TheGroupOfTel {
    static List<String> list =new ArrayList<>();
    static char[][] chars=new char[][]{
            {},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}
    };

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str =new String();//输入数字
        str=scanner.nextLine();
        if(str.length()==0){
            System.out.println("0");
            return;
        }
        dfs(str,0,new StringBuilder());
        for(String s:list){
            System.out.print(s+" ");
        }
    }


    public static void dfs(String str,int index,StringBuilder sb){
        if(index==str.length()){
            list.add(sb.toString());
            return;
        }

        for(char c:chars[str.charAt(index)-'0']){
            sb.append(c);
            dfs(str,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }



}
