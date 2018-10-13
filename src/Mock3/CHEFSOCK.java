package Mock3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEFSOCK {
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

        int jacketCost=fr.nextInt();
        int sockCost=fr.nextInt();
        int money=fr.nextInt();
        int remain=Math.floorDiv(money-jacketCost,sockCost);
        if(remain%2==0)
            System.out.print("Lucky Chef");
        else
            System.out.println("Unlucky Chef");
    }
}
