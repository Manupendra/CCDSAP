package Mock3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SIMPSTAT {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null || !st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        String nextLine()
        {
            String s="";
            try{
                s=br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return s;
        }
    }

    public static void main(String[] args) {

        FastReader fr=new FastReader();

        int t=fr.nextInt();
        while(t--!=0)
        {
            int n=fr.nextInt();
            int k=fr.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=fr.nextInt();
            Arrays.sort(a);
            double sum=0;
            for(int i=k;i<n-k;i++)
                sum+=a[i];
            sum=sum/(n-2*k);
            System.out.println(sum);
        }
    }
}
