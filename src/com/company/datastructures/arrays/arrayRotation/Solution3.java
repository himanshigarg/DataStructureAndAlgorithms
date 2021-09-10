package com.company.datastructures.arrays.arrayRotation;

import com.company.FastReader;
import com.company.algorithms.MathUtils;

import java.util.Arrays;

public class Solution3 {

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

            long gcd = MathUtils.gcd(d, n);

            for (int i = 0; i < gcd; i++) {
                int pointer = i;
                int temp = arr[pointer];
                while (true) {
                    int next_pointer = (pointer + d) % n;
                    if (next_pointer == i) {
                        arr[pointer] = temp;
                        break;
                    }
                    arr[pointer] = arr[next_pointer];
                    pointer = next_pointer;

                }
            }

            Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
            System.out.println();
            t--;
        }
    }
}
