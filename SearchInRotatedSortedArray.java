package practice;
/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
You are given a target value to search. If found in the array return its index, otherwise return -1.
You may assume no duplicate exists in the array 8124567 80123 38012 901238 80123 38012 23801
 */
/**
 * Let¡¯s say nums looks like this: [12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Because it¡¯s not fully sorted, we can¡¯t do normal binary search. But here comes the trick:
 * @author LIAOTING
 *
 */
public class SearchInRotatedSortedArray {
 public int search(int[] nums, int target) {
        if(nums.length<1) return -1;
        else {
        	int start=0,end=nums.length-1;
        	while(start<end){
        	  int mid=(start+end)/2;
        	  if(nums[mid]>nums[end]) {
        		if(target>nums[mid] || target<=nums[end])
        			start=mid+1;
        		else
        			end=mid;
        	   }
        	  else {
        		if(target>nums[mid]&&target<=nums[end]) {
        			start=mid+1;
        		}
        		else
        			end=mid;
        	  }
         }
        	if (start == end && target != nums[start]) return -1;
            return start;
      }
 }
}
