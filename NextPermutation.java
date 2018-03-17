package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Implement next permutation, which rearranges numbers 
 * into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, 
it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column 
and its corresponding outputs are in the right-hand column.
1,2,3 ¡ú 1,3,2
3,2,1 ¡ú 1,2,3
1,1,5 ¡ú 1,5,1
 * @author LIAOTING
 *
 */
public class NextPermutation {
  public void nextPermutation(int[] nums) {
        boolean irreversible=true;
        if(nums.length>1) {
        	//Map<Integer,Integer> numsindex=new HashMap<Integer,Integer>();
            int index=nums.length-2;
            while(index>=0) {
        	    if(nums[index]<nums[index+1]) {
        	    	irreversible=false;
        	    	break;
        	    }
        	    else{
        	    //	numsindex.put(nums[index], index);
        	    	index--;
        	    }
            }
            if(irreversible) {
        	  int start=0;
        	  int end=nums.length-1;
        		  while(start<=end) {
        		  int temp=nums[start];
        		  nums[start]=nums[end];
        		  nums[end]=temp;
        		  start++;
        		  end--;
        		  }
        	}
            else {
            	int bestmatch=index+1;
            	for(int i=index+1;i<nums.length;i++) {
            		if(nums[index]<nums[i] && nums[i]<=nums[bestmatch])
            			bestmatch=i;
            	}
            	int temp=nums[bestmatch];
            	nums[bestmatch]=nums[index];
            	nums[index]=temp;
            	Arrays.sort(nums, index+1, nums.length);
            }
       }
 }
  public static void main(String[]args) {
	  NextPermutation n1=new NextPermutation();
	  int[] nums= {9,8,5};
	  n1.nextPermutation(nums);
	  for(int i:nums)
		  System.out.print(i);
  }
  
}
