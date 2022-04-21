package com.akuya.LeetCode;

/**
 * @author akuya
 * @create 2022-04-21-23:47
 */
public class ac {}


//本数据全为leetcode格式，所以代码均为leetcode格式，用注释表示，此后一样

    /*

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+","+j+"]");
                    return new int []{i,j};
                }
            }
        }

        return new int[0];
    }
}

}}}
