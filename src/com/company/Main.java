package com.company;

public class Main {
    public static int recursivegcd(int a, int b) {
        if (a == 0 && b == 0)
            return 0;
        if (a == b)
            return a;
        if (a > b)
            return recursivegcd(a - b, b);
        else
            return recursivegcd(a, b - a);
    }

    public static int iterativegcd(int a, int b) {
        while (b != 0) {
            final int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println(recursivegcd(400, 143));
    }
}
