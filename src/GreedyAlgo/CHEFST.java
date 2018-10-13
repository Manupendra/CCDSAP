package GreedyAlgo;

import java.math.BigInteger;
import java.util.Scanner;

public class CHEFST {
    static long max(long a,long b,long c){
        if(a>b){
            if(a>c)
                return a;
            else
                return c;
        }
        else{
            if(b>c)
                return b;
            else
                return c;
        }
    }


    public static void main(String[] args)  {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        for (int testcases = sc.nextInt(); testcases > 0; testcases--) {
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();

            long m = sc.nextLong();


            s.append(n1.subtract(n2).max(n2.subtract(n1)).max(n1.add(n2).subtract(BigInteger.valueOf(m * (m + 1))))).append('\n');
        }
        System.out.println(s);


    }
}
