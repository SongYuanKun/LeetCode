package com.songyuankun;

import java.util.HashMap;
import java.util.stream.Collectors;

public class LongestPalindromeSubseq {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubseq().longestPalindromeSubseq("aabaa"));
    }

    public int longestPalindromeSubseq(String s) {
        String[] split = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String ss : split) {
            map.merge(ss, 1, Integer::sum);
        }
        return map.entrySet().stream().sorted((o1, o2) -> -o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList()).get(0).getValue();
    }
}