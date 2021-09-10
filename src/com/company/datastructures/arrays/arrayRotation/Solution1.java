package com.company.datastructures.arrays.arrayRotation;

import com.company.FastReader;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        FastReader reader = new FastReader();

        int t = reader.nextInt();
        while (t > 0) {
            int n = reader.nextInt();
            int d = reader.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            int[] temp = Arrays.copyOfRange(arr, 0, d);

            for (int i = 0; i < n - d; i++) {
                arr[i] = arr[i + d];
            }

            for (int i = 0; i < d; i++) {
                arr[n - d + i] = temp[i];
            }

            Arrays.stream(arr).forEach(i -> System.out.println(i + " "));
            System.out.println();
            t--;
        }
    }
}
