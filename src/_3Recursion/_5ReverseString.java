package _3Recursion;

public class _5ReverseString {
    public static void main(String[] args) {
        String str="abcd";
        int index=str.length()-1;
        rev(str,index);
    }
    public static void rev(String str,int index){
        if(index==0) {
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        rev(str,index-1);
    }
}
