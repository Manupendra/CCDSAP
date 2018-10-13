package Mock1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSUB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; testcase--) {
            int N=Integer.parseInt(br.readLine());
            int onesCount=0;
            String sp=br.readLine();
            for (int i = 0; i < sp.length() ; i++) {
                if(sp.charAt(i)=='1')
                    onesCount++;
            }
            int substrings=(onesCount*(onesCount+1))/2;
            s.append(substrings).append('\n');

        }
        System.out.print(s);

    }
}
