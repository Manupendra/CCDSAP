package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FitSquares {

    static int noofSquares(int b) {

        b /= 2;
        return (b * b - b) / 2;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; testcases--) {
            int base = Integer.parseInt(br.readLine());
            s.append(noofSquares(base)).append('\n');
        }
        System.out.println(s);
    }
}
