package com.company.datastructures.arrays.arrayRotation;

import com.company.FastReader;

import java.util.Arrays;

public class Solution2 {
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

            reverse(arr, 0, d);
            reverse(arr, d, n);
            reverse(arr, 0, n);


            Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
            System.out.println();
            t--;
        }
    }

    public static void reverse(int[] arr, int low, int high) {
        for (int i = low; i < (high + low) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[high + low - i - 1];
            arr[high + low - i - 1] = temp;
        }
    }
}
