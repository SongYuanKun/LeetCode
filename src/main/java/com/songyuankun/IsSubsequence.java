package com.songyuankun;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence1("ahc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        String[] c = s.split("");
        int defIndexOf = -1;
        for (String value : c) {
            int indexOf = t.indexOf(value, defIndexOf + 1);
            if (defIndexOf < indexOf) {
                defIndexOf = indexOf;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isSubsequence1(String s, String t) {
        if (s.equals("")) {
            return true;
        }
        byte[] ss = s.getBytes();
        byte[] ts = t.getBytes();
        int i1 = 0;
        int i2 = 0;
        while (i1 <= ss.length - 1 && i2 <= ts.length - 1) {
            if (ss[i1] == ts[i2]) {
                i1++;
            }
            i2++;
        }
        return i1 == ss.length;
    }
}
