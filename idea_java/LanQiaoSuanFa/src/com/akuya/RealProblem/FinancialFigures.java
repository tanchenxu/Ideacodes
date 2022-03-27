package com.akuya.RealProblem;

import java.util.Scanner;

/**
 * @description 在金融领域，通常将金额的百位和千位之间、十万位和百万位之间增加逗号（千分位分隔符），以方便阅读。一般从个位开始，每三位之前增加一个逗号。
 * 例如：1234567890.00 通常写成 1,234,567,890.00。
 * 注意小数点后固定保留 2 位。
 * 给定一个包含千分位分隔符的数值，请读入后输出对应的不含千分位的数值，小数点仍然保留 2 位。
 *
 * @author akuya
 * @create 2022-03-27-17:36
 */
public class FinancialFigures {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=new String();
        string=scanner.nextLine();
         String string2=string.replace(",","");
        System.out.println(string2);
    }
}
