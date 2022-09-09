package _5Searching;

public class _2BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,25,28,36,45,52,53,55,60,75};
        int target=29;
        int index=BinaryRecursive(arr,target,0,arr.length);
        System.out.println(index);
    }
    static int BinaryRecursive(int[] arr,int target,int start,int end){
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(target==arr[mid])
            return mid;

        else if(target<=arr[mid])
            return BinaryRecursive(arr,target,start,mid-1);

        else return BinaryRecursive(arr,target,mid+1,end);
    }
}
