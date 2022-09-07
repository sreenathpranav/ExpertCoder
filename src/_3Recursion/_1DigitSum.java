package _3Recursion;

public class _1DigitSum {
    public static void main(String[] args) {
        int no=1345;
        System.out.println(sumDigit(no));
    }
    static int sumDigit(int n){
        if(n==0)
            return 0;

        n=n/10; // 134
        return (n%10) + sumDigit(n);

    }
}
