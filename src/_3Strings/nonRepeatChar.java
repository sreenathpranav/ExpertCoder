package _3Strings;
//Qn. Print the first non repeating character in a string in lowercase

import java.util.Scanner;

public class nonRepeatChar {
    public static void main(String[] args){
//        String s="bcdbcae"; //'d' is the first non repeating character here
//        int i,j;
//        char ch;
//        for(i=0;i<s.length()-1;i++){  //(first character)
//            ch=s.charAt(i); // 'b' is stored in ch
//            int flag=0;
//            for(j=i+1;j<s.length()-1;j++) { //(second character) -c,d,b,c,a,e is looped
//                if (s.charAt(j) == ch) {   // check b=c not true so next check l
//                    flag = 1;
//                    break;
//                }
//            }
//                if(flag!=1) {
//                    System.out.print(ch);
//                    break;
//                }
//        }
        Optimized();
    }

    static void Optimized(){
        Scanner sn= new Scanner(System.in);
        int t=sn.nextInt();
        while(t-->0){
            String str=sn.next(); //hello --> h
            int freq[]=new int[26]; //initialize all value to 0
            int flag=0;
            for(int i=0;i<str.length();i++)
                freq[str.charAt(i)-97]++;   //h ---> here we create a table for each character values and then count their repetition(l- 2 times)
            for(int i=0;i<str.length();i++){
                if(freq[str.charAt(i)-97]==1){
                    System.out.println(str.charAt(i));
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(-1);
        }
    }
}
