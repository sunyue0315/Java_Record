package com.anzhi.minimumsizesubarraysum;

public class Solution {
    // 暴力解法
    public int minSubArrayLen(int target, int[] nums) {

        // 最终结果变量
        int result = Integer.MAX_VALUE;
        // 求和字符串长度
        int subLength = 0;
        for(int i=0; i<nums.length; i++){
            // 每次开始重新求解最小子数组之和 >= target，sum值都要重新初始化
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                // 计算子串求和
                sum += nums[j];
                if(sum >= target){ // 当求得的 sum 值大于target,此次循环结束
                    subLength = j-i+1; // 计算最小子串长度
                    result = Math.min(result, subLength); // 每次与上一个值比较，取最小值
                    break;
                }
            }
        }
        return result  == Integer.MAX_VALUE ? 0 : result;
    }
}
