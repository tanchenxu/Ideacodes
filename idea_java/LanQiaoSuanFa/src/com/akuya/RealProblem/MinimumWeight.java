package com.akuya.RealProblem;

/**
 * @description 你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意 小于等于 NN 的正整数重量。
 *
 * 那么这套砝码最少需要包含多少个砝码？
 *
 * 注意砝码可以放在天平两边。
 * @author akuya
 * @create 2022-04-03-17:22
 * @result 这是2021年的省赛真题，需要运用到贪心思想。我们来分析前几步选择：
 *          1.首先表示1这个数，我们只能用1这个砝码，此时砝码个数为1。这一步很容易思考。
 *         2.这时考虑表示2这个数，我们难道选两个1吗？这就涉及到贪心思想了，为了尽可能表示更大的数，这时候我们选用砝码3，这样3-1=2，3+1=4。我们能同时表示1，2，3，4这四个数，此时砝码有1，3，砝码个数为2。
 *        3.这时我们需要考虑如何表示5这个数。还是利用贪心思想，我们此时能表达的最大数是4，为了表达5且使用更大的砝码，我们选择9这个砝码，因为9-3-1=5。这时候我们能表达的最大数是多少呢？理所当然是1+3+9=13。那么问题来了？[6,12]我们能表达出来吗？
 *         我们尝试一下：
 *         9-3=6;
 *         9-3+1=7;
 *         9-1=8;
 *         9=9;
 *         9+1=10;
 *         9+3-1=11;
 *         9+3=12;
 *      我们发现这个区间的数是可以完全表达出来的，到这我相信你也一个大胆的猜想。我们让初始砝码数count=1，初始可表达最大值ans=1。每当count++，ans的范围将会变为2*ans+1。这里我通过一个简图给大家看看：
 *       我们只需要一直按照这个规律推算ans的值，当ans>=题目要求的N，说明此时的count就是我们的答案。
 * ————————————————
 * 版权声明：本文为CSDN博主「执 梗」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_57487901/article/details/123290508
 */
public class MinimumWeight {
}
