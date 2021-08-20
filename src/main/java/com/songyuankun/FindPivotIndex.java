package com.songyuankun;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-pivot-index/submissions/
 */
class FindPivotIndex {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 7, 3, 6, 5, 6);
        int[] arr1 = integers.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(new FindPivotIndex().pivotIndex(arr1));
    }

    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (left * 2 == sum - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}