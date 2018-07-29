/**
 * 3. 无重复字符的最长子串
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "doiqh329PHDOPCWENHFQ3RJHF9OPH";
        int result = new LengthOfLongestSubstring().lengthOfLongestSubstring(s);
        System.out.print(result);
    }

    private int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        //开始标识
        int start = 0;
        //结束标识
        int end = 1;
        //将字符串切成数组
        String[] bytes = s.split("");
        //结果
        int result = 0;
        for (int i = 0; i < bytes.length; i++) {
            String tempString = s.substring(start, end);
            int tempResult = 0;
            if (tempString.length() > result) {
                tempResult = tempString.length();
            }
            int index = tempString.length() - tempString.replace(bytes[i], "").length();
            if (index > 1) {
                start++;
                i--;
                if (start > end) {
                    end = start;
                }
            } else {
                end++;
                if (tempResult > result) {
                    result = tempResult;
                }
            }
        }
        return result;
    }
}