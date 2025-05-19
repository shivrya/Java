package CollectionsPractice;

import java.util.*;

public class HashmapPractice {

    public static void main(String args[]){

                int[] nums = {10,5,2,7,1,9};
                int k=15;

                int longestSubarray = 0;
                int n = nums.length;
        
                for(int i=0;i<n;i++){
                     for(int j=i;j<n;j++){
        
                        int tmpLongestSubarray = 0;
                        int sum = 0;
        
                        for(int z=i;z<=j;z++){
                            sum+= nums[z]; 
                        }
                        
                        if(sum==k){
                            tmpLongestSubarray = (j-i)+1;
                            longestSubarray = Math.max(longestSubarray,tmpLongestSubarray);
                           
                        }
                     }
                }
                System.out.println(longestSubarray);

    }
}
