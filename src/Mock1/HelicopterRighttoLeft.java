package Mock1;

import java.util.Scanner;

public class HelicopterRighttoLeft {
    static int[] calculateFlights(int [] peaks)
    {
        int [] ans = new int[peaks.length];
        for(int i=0; i<peaks.length;i++)
        {
            ans[i] = calculateFlights(peaks,i,0);
        }
        return ans;
    }

    static int calculateFlights(int [] peaks,int index,int min)
    {
        int maxDistance = 0;
        if(min>=peaks[index])
            return 0;
        else
        {
            for(int i=index+1; i<peaks.length; i++)
            {
                int distance = calculateFlights(peaks,i,peaks[index]);
                if(maxDistance<distance)
                {
                    maxDistance = distance;
                }
            }
        }

        return maxDistance+1;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] peaks = new int[n];
        System.out.println("Enter array of peaks");

        for(int i=0; i<n; i++)
            peaks[i] = sc.nextInt();

        int []ans = calculateFlights(peaks);

        for(int a: ans)
        {
            System.out.print(a+" ");
        }

    }
}
