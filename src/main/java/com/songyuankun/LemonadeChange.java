package com.songyuankun;

public class LemonadeChange {
    int five = 0;
    int ten = 0;
    int twenty = 0;


    public static void main(String[] args) {
        boolean b = new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5});
        System.out.println(b);
    }

    public boolean lemonadeChange(int[] bills) {
        for (int pay : bills) {
            int zhao = pay - 5;
            if (zhao == 15) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five > 2) {
                    five -= 3;
                } else {
                    return false;
                }
            } else if (zhao == 10) {
                if (ten > 0) {
                    ten--;
                } else if (five > 1) {
                    five -= 2;
                } else {
                    return false;
                }
            } else if (zhao == 5) {
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
            }

            if (pay == 5) {
                five++;
            }
            if (pay == 10) {
                ten++;
            }
        }
        return true;
    }
}
