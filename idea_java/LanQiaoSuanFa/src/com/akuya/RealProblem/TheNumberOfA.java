package com.akuya.RealProblem;

/**
 * @description 以下是一个 25 行 25 列的字母矩阵，全部由字母 A 和 B 组成。
 * AAAAAAABABBAABABABAAAAAAA
 * ABBBBBABBAABBBBBABABBBBBA
 * ABAAABABBBABAABBBBABAAABA
 * ABAAABABBBBBAABAABABAAABA
 * ABAAABABBABABBABABABAAABA
 * ABBBBBABBBABAABBBBABBBBBA
 * AAAAAAABABABABABABAAAAAAA
 * BBBBBBBBABAABABBBBBBBBBBB
 * AABAABABBAAABBAAABABBBBBA
 * ABBABABBBABBAAAABBBBAAAAB
 * BBBBAAABABAABABAABBBAABBA
 * BBAABABABAAAABBBAABBAAAAA
 * ABABBBABAABAABABABABBBBBA
 * AAAABBBBBABBBBAAABBBABBAB
 * AABAABAAABAAABAABABABAAAA
 * ABBBBBBBBABABBBBABAABBABA
 * ABBBAAABAAABBBAAAAAAABAAB
 * BBBBBBBBABBAAABAABBBABBAB
 * AAAAAAABBAAABBBBABABAABBA
 * ABBBBBABBAABABAAABBBABBAA
 * ABAAABABABBBAAAAAAAAAABAA
 * ABAAABABABABBBABBAABBABAA
 * ABAAABABBABBABABAABAABAAA
 * ABBBBBABABBBBBABBAAAABAAA
 * AAAAAAABAABBBAABABABBABBA
 * 请问在这个矩阵中有多少个字母A？
 * ————————————————
 * @author akuya
 * @create 2022-03-27-13:59
 */
public class TheNumberOfA {

    public static void main(String[] args) {
    String string=new String();
    string="AAAAAAABABBAABABABAAAAAAA\n" +
            "ABBBBBABBAABBBBBABABBBBBA\n" +
            "ABAAABABBBABAABBBBABAAABA\n" +
            "ABAAABABBBBBAABAABABAAABA\n" +
            "ABAAABABBABABBABABABAAABA\n" +
            "ABBBBBABBBABAABBBBABBBBBA\n" +
            "AAAAAAABABABABABABAAAAAAA\n" +
            "BBBBBBBBABAABABBBBBBBBBBB\n" +
            "AABAABABBAAABBAAABABBBBBA\n" +
            "ABBABABBBABBAAAABBBBAAAAB\n" +
            "BBBBAAABABAABABAABBBAABBA\n" +
            "BBAABABABAAAABBBAABBAAAAA\n" +
            "ABABBBABAABAABABABABBBBBA\n" +
            "AAAABBBBBABBBBAAABBBABBAB\n" +
            "AABAABAAABAAABAABABABAAAA\n" +
            "ABBBBBBBBABABBBBABAABBABA\n" +
            "ABBBAAABAAABBBAAAAAAABAAB\n" +
            "BBBBBBBBABBAAABAABBBABBAB\n" +
            "AAAAAAABBAAABBBBABABAABBA\n" +
            "ABBBBBABBAABABAAABBBABBAA\n" +
            "ABAAABABABBBAAAAAAAAAABAA\n" +
            "ABAAABABABABBBABBAABBABAA\n" +
            "ABAAABABBABBABABAABAABAAA\n" +
            "ABBBBBABABBBBBABBAAAABAAA\n" +
            "AAAAAAABAABBBAABABABBABBA";

    int number =0;
    char[] result =string.toCharArray();
    for(int i=0;i<result.length;i++){
        if(result[i]=='A'){
            number ++;
        }
        }
        System.out.println(number);
    }

}
