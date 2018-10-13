package Mock3;
import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    static int compute(long[] a,int s,int e,long k,int n){

        int res=-1;
        int b=s;
        while(s<=e){
            int mid=(s+e)/2;
            long val1=a[mid]-a[b-1];
            long val2=k*(mid-b+1);
            long diff=val2-val1;
            long count=(n-mid);

            //System.out.println(diff+" "+count+" "+s+" "+mid+" "+e);
            if(diff<=count){
                res=mid;
                //System.out.print(k+"y ");
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int q=input.nextInt();
            long[] a=new long[n];
            long[] sum=new long[n+1];
            for(int i=0;i<n;i++){
                a[i]=input.nextLong();
            }

            Arrays.sort(a);

            for(int i=0,j=n-1;i<j;i++,j--){
                long temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

            sum[0]=0;
            for(int i=0;i<n;i++){
                sum[i+1]=sum[i]+a[i];
            }

            while(q-->0){
                long k=input.nextLong();

                //int ind=-1;

                int s=0;
                int e=n-1;

                int res=-1;
                while(s<=e){
                    int mid=(s+e)/2;
                    if(a[mid]>=k){
                        res=mid;
                        s=mid+1;
                    }
                    else{
                        e=mid-1;
                    }
                }


                //   for(int i=1;i<=n;i++)
                //      System.out.print(sum[i]+" ");

                //System.out.println()
                //System.out.println(res);
                int val=compute(sum,res+2,n,k,n);
                if(val==-1)
                    System.out.println(res+1);
                else
                    System.out.println(val);
            }
        }
    }
}