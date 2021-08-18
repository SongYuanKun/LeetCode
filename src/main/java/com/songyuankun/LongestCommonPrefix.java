package com.songyuankun;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String s = new LongestCommonPrefix().longestCommonPrefix(new String[]{"cir","car"});
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].indexOf(result, 0) != 0) {
                result = result.substring(0, result.length() - 1);
                i = 0;
            }
        }
        return result;
    }
}
