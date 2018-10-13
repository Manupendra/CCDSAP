package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TACHSTCK {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int countpair = 0;
        int n = sc.nextInt();
        long d = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; ) {
            if ((arr[i - 1] - arr[i]) <= d) {
                countpair++;
                i += 2;
            } else
                i++;
        }
        System.out.println(countpair);

    }

}
