package com.songyuankun;

import java.util.*;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //存在就加1不存在就是1
            map.merge(num, 1, Integer::sum);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        //降序排序
        list.sort((o1, o2) -> -o1.getValue().compareTo(o2.getValue()));
        //切割数组变成k个
        return list.subList(0, k).stream().mapToInt(Map.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 6, 3, 4, 4, 5);
        int[] arr1 = integers.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(topKFrequent(arr1, 1)));
    }
}