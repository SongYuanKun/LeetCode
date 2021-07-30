package com.songyuankun;

/**
 * 两个排序数组的中位数
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 你可以假设 nums1 和 nums2 均不为空。
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        double medianSortedArrays = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);


    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {


        return 0.0D;
    }
}