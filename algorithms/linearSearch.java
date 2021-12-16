import java.util.*;
public class linearSearch {
    public static void main(String args[]){
        int[] nums={23,6,5,8,9,123,67};
        int target=8;
        int ans=linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
