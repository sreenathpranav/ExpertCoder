package DivideConquer;
import java.util.Scanner;

public class _2SquareRoot_Optimize {
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        int t=sn.nextInt();
        while(t-->0) {
            long n = sn.nextLong();
            System.out.println(squareroot(n));;
        }
    }
    static long squareroot(long n){
        if(n==0||n==1)
            return n;

        long start=1,end=n/2,ans=0;

        while(start<=end){
         long mid=(start+end)/2;
         if(mid*mid==n)
             return mid;
         if(mid*mid<n){
             ans=mid;
             start=mid+1;
         }
         else
             end=mid-1;
        }
        return ans;
    }
}
