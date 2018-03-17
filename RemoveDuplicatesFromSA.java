package practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSA {
  /**
   * Given a sorted array, remove the duplicates in-place 
   * such that each element appear only once and return the new length.
     Do not allocate extra space for another array, 
     you must do this by modifying the input array in-place with O(1) extra memory.
   * Given nums = [1,1,2],
    Your function should return length = 2,
    with the first two elements of nums being 1 and 2 respectively.
    It doesn't matter what you leave beyond the new length.
   */
	public int removeDuplicates(int[] nums) {
	    if(nums.length==0) return 0;
	    if(nums.length==1) return 1;
        int index=1;
        Set<Integer> s1=new HashSet<Integer>();
        s1.add(nums[0]);
        int length=1;
        while(index<nums.length) {
//        	if(s1.contains(nums[index])){
//        		if(index+1==length) {
//        			length--;
//        			break;
//        		}
//        		int temp=index;
//        		while(temp<length-1){
//        		  nums[temp]=nums[temp+1];
//        		  temp++;
//        		}
//        		length--;
//        	}
//        	else {
//        		s1.add(nums[index]);
//        		index++;
//        	}
        	if(!s1.contains(nums[index])) {
        		nums[length++]=nums[index];
        		s1.add(nums[index]);
        	}
        	index++;
        }
        return length;
   }
  public static void main(String[]args) {
	  int[] nums= {1,1,1,2,2,3,2};
	  RemoveDuplicatesFromSA r1=new RemoveDuplicatesFromSA();
	  int length=r1.removeDuplicates(nums);
	  for(int i=0;i<length;i++)
		  System.out.print(nums[i]);
  }
}
