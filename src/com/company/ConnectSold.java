package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConnectSold {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();

        //for calculating Max length used
        int Max[] = new int[51];

        //for calculating Min length used
        int Min[] = new int[51];

        Max[0]=Min[0]=0;

        //Preprocessing for n=50 coz 0<n<=50
        for (int i = 1; i <= 50; i++){
            int k=i/2;
            Max[i]=Max[i-1]+Max[0]+i+1;
            Min[i]=Min[k]+Min[i-k-1]+i+1;
        }/*
        for (int i=0;i<=50;i++){
            System.out.print(Max[i]+" ");
        }
        System.out.println();
        for (int i=0;i<=50;i++){
            System.out.print(Min[i]+" ");
        }
        System.out.println();*/

        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; testcases--) {
            System.out.println(testcases);

            int N=sc.nextInt();
            int M=sc.nextInt();
            System.out.println(M+" "+N);
            if(M<Min[N])
                s.append("-1").append('\n');
            else if(M<=Max[N])
                s.append("0").append('\n');
            else
                s.append(M-Max[N]).append('\n');
        }
        System.out.println(s);
    }
}
