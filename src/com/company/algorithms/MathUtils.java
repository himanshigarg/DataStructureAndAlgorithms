package com.company.algorithms;

public class MathUtils {

    public static long gcd(long a, long b) {
        if (b < a) return gcd(b, a);

        if (a == 0) return b;

        return gcd(b % a, a);
    }
}
