package Recursion;

public class _1DigitSum {
    public static void main(String[] args) {
        int no=1345;
        System.out.println(sumDigit(no));
    }
    static int sumDigit(int n){
        if(n==0)
            return 0;

        int rem=n%10; //5
        n=n/10; // 134
        return (n%10) + sumDigit(n);

    }
}
