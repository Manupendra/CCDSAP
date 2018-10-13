package com.company;

import java.util.ArrayList;
import java.util.List;

public class PrimeSieve {

    public static void main(String[] args) {
        System.out.println(findAllPrimesUpto(102));
    }

    public static List<Integer> findAllPrimesUpto(final int n) {
        final boolean[] touched = new boolean[n + 1];
        final double sqrtOfN = Math.sqrt(n);
        final List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 2; i <= n; i += 2) {
            touched[i] = true;
        }
        for (int i = 3; i <= sqrtOfN; i++) {
            if (!touched[i]) {
                for (int j = i * i; j <= n; j = j + (i * 2)) {
                    touched[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!touched[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}