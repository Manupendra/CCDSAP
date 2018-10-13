package GreedyAlgo;
import java.util.Arrays;
import java.util.Scanner;

public class MAXDIFF {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        Scanner sc =new Scanner(System.in);

        for (int testcases = sc.nextInt(); testcases > 0; testcases--) {
            /*String s1=br.readLine();
            String s11[]=s1.split(" ");*/
            int n=sc.nextInt();
            int k=sc.nextInt();
            int w[]=new int[n];
            //System.out.println(" "+n+" "+k+" ");
            int total=0;
            int diff=0;
            int small=n-k>k?k:n-k;
            for (int i = 0; i < n; i++) {
                w[i]=sc.nextInt();
                total+=w[i];
            }
            //System.out.println(total);
            Arrays.sort(w);
            int totalF=0;
            int totalS=0;
            for (int i = 0; i < small ; i++) {
                totalS+=w[i];
            }
            //System.out.println(total+" "+totalS);
            totalF=total-totalS;
            diff=(totalF-totalS);
            s.append(diff).append('\n');
        }
        System.out.print(s);
    }
}
