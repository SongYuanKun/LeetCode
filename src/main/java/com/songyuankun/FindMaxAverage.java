package com.songyuankun;

public class FindMaxAverage {
    public static void main(String[] args) {
        //46339
        double result = new FindMaxAverage().findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1);
        System.out.println(result);
    }

    public double findMaxAverage(int[] nums, int k) {
        int result = 0;
        int size = nums.length;
        for (int j = 0; j < k; j++) {
            result += nums[j];
        }
        int temp = result;
        for (int i = 0; i < size - k; i++) {
            temp = temp - nums[i] + nums[i + k];
            if (result < temp) {
                result = temp;
            }
        }
        return 1.0 * result / k;
    }

}