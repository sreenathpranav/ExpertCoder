package _3Recursion;

public class _3StepsReduction_0 {
    public static void main(String[] args) {
        int no=144;
        System.out.println(reduce(no));
    }
    static int reduce(int no){
        int steps=0;
        return helper(no,steps);
    }
    static int helper(int no,int steps){
        if(no==0)
            return steps;

        if(no%2==0)
            return helper(no/2,steps+1);

        return helper(no-1,steps+1);
    }
}
