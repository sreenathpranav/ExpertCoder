// searching in 2D array

package _5Searching;

import java.util.Arrays;

public class _1LinearSearch {
    public static void main(String[] args) {
        int[][] arr={
                {50,25,96},
                {62,97,53,45},
                {19,22,55,79}
        };

        int ans[]=search(arr,62);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target)
                    return new int[]{i,j};
            }
        }

        return new int[]{-1,-1};
    }
}
