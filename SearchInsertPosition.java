package practice;

public class SearchInsertPosition {
	/**
	 * Given a sorted array and a target value, return the index if the target is found. 
	 * If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
	 * @param nums
	 * @param target
	 * @return
	 */
	 public int searchInsert(int[] nums, int target) {
	       if(nums.length<1) return 0;
	       else {
	    	   int start=0;
	    	   int end=nums.length-1;
	    	   int mid;
	    	   while(start<end) {
	    		   mid=(start+end)/2;
	    		   if(nums[mid]==target) return mid;
	    		   else if(nums[mid]<target) {
	    			      start=mid+1;
	    		   }
	    		   else 
	    			      end=mid-1;
	    	   }
	    	   if(nums[start]==target) return start;
	    	   else {
	    	      if(nums[start]>target) {
	    	    	  if(start==0) return 0;
	    	    	  else return start;
	    	      }
	    	      else return start+1;
	    	   }
	       }
	 }
	 public static void main(String[]args) {
		 int[] a= {1,3,5,6};
		 SearchInsertPosition s1=new SearchInsertPosition();
		 System.out.print(s1.searchInsert(a, 2));
	 }
}
