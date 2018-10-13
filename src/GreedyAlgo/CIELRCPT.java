package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIELRCPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        int t[]=new int[12];
        for (int i = 0; i < 12; i++) {
            t[i]=1<<i;
        }
        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; testcases--) {
            int res = 0;
            int p=Integer.parseInt(br.readLine());
            for(int i=11;i>=0;i--){
                res += p/t[i]; /* p/t[i] (floor(p/t[i])) denotes the number of menu i which Tomya orders */
                p %= t[i];     /* p decrease by used money */
            }
            //System.out.println(res+""+testcases+""+p);
            s.append(res).append('\n');
        }
        System.out.println(s);
    }
}
