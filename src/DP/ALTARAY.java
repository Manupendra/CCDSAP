package DP;

import java.util.Scanner;

public class ALTARAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        for (int testcases = sc.nextInt(); testcases > 0; testcases--) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            int len[]=new int[N];
            for (int i = 0; i < N ; i++) {
                arr[i]=sc.nextInt();
            }
            //Initialise all the elements len as 1
            /*for (int i = 0; i <N ; i++) {
                len[i]=1;
            }*/
            len[N-1]=1;
            for (int i = N - 2; i >=0; i--) {
                long l=arr[i]*arr[i+1];
                if(l<0){
                    len[i]=len[i+1]+1;
                    /*System.out.print(i+" "+len[i]+" ");*/
                }
                else
                    len[i]=1;

            }
            System.out.println();
            for (int i = 0; i < N ; i++) {
                s.append(len[i]).append(' ');
            }
            s.append('\n');

        }
        System.out.print(s);
    }
}
