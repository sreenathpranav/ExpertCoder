package DivideConquer;
import java.util.Scanner;

public class _1SquareRoot {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int t=sn.nextInt();
        while(t-->0)
        {
            long n=sn.nextLong();
            int i=0;
            if(n==0 || n==1)
                System.out.println(n);
            else {
                while (i * i <= n)
                    i = i + 1;

                    System.out.println(i - 1);
            }
        }
    }
}
