package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shknum {


    public static void main(String[] args) throws IOException {
        int len = 27;         //coz 2^26 aprox equal to 1 Billion(10^9)
        int powerof2[] = new int[len];
        for (int i = 0; i < len; i++) {
            powerof2[i] = (int) Math.pow(2, i);
            //System.out.print(powerof2[i]+" ");
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();
        label1:
        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; testcase--) {
            int N = Integer.parseInt(br.readLine());
            //System.out.println(N);
            int diff = 0;
            while (true) {
                for (int i = 0; i < len - 1; i++)
                    for (int j = i + 1; j < len; j++) {
                        //System.out.println("i:" + i + " j:" + j);
                        if (N + diff == powerof2[i] + powerof2[j]) {
                            //System.out.println(diff);
                            s.append(diff).append('\n');
                            continue label1;
                        }
                    }
                diff++;
            }

        }
        System.out.println(s);
    }
}
