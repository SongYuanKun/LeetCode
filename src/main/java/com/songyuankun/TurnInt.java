package com.songyuankun;

public class TurnInt {
    public static void main(String[] args) {
        int x = -4236469;
        System.out.println(turnInt(x));

    }

    private static int turnInt(int x) {
        String s = Integer.toString(x);
        s = s.replace("-", "");
        byte[] bytes = s.getBytes();
        byte[] resultBytes = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            resultBytes[bytes.length - 1 - i] = bytes[i];
        }
        String result = new String(resultBytes);
        long i = Long.parseLong(result);
        if (x < 0) {
            i = -i;
        }
        if (i > Integer.MAX_VALUE || i < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) i;
    }
}
