package com.songyuankun;

import java.util.Arrays;

public class SortedMergeLcci {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 0, 0, 0};
        new SortedMergeLcci().merge(ints, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(ints));
    }

    public void merge(int[] A, int m, int[] B, int n) {
        int[] F = Arrays.copyOf(A, m);
        int a = 0;
        int b = 0;
        if (n == 0) {
            return;
        }
        for (int i = 0; i < m + n; i++) {
            boolean aNext = a < m;
            boolean bNext = b < n;
            if (aNext && bNext) {
                A[i] = F[a] < B[b] ? F[a++] : B[b++];
                continue;
            }
            if (!aNext) {
                A[i] = B[b++];
            }
            if (!bNext) {
                A[i] = F[a++];
            }
        }
    }

}