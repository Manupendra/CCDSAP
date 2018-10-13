package Mock3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SNAKEEAT {
    static int[] strtointarr(String s) {
        String st[] = s.split(" ");
        int temp[] = new int[st.length];
        for (int i = 0; i < st.length; i++) {
            temp[i] = Integer.parseInt(st[i]);
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; testcases--) {
            String t = br.readLine();

            int a1[] = strtointarr(t);

            int N = a1[0];
            int Q = a1[1];

            String t1 = br.readLine();
            int snakelen[] = strtointarr(t1);

            int query[] = new int[Q];
            for (int i = 0; i < Q; i++) {
                query[i] = Integer.parseInt(br.readLine());
            }
            /*System.out.println("N:"+N+" Q:"+Q);
            for (int i = 0; i < N; i++) {
                System.out.print(snakelen[i]+" ");
            }
            System.out.println();
            for (int i = 0; i <Q ; i++) {
                System.out.print(query[i]+" ");
            }*/
            Arrays.sort(snakelen);
            for (int j = 0; j <query.length ; j++) {
                int size=snakelen.length-1;
                int count=0;
                for (int i = snakelen.length-1; i >=0 ; i--) {
                    if(query[j]>snakelen[i]){
                        if(query[j]>snakelen[i]+size){
                            break;
                        }
                        else if(query[j]==(snakelen[i]+size))
                        {
                            count++;
                            break;
                        }
                        else{
                            count++;
                            size-=query[j]-snakelen[i];
                            //System.out.print("Size: "+size+" ");
                        }
                    }
                    else{
                        count++;
                        size--;
                    }
                }
                //System.out.println(count);
                s.append(count).append('\n');
            }

        }
        System.out.println(s);
    }
}
