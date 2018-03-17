package practice;

public class RemoveElement {
	/**
	 * Given an array and a value, remove all instances of that value in-place and return the new length.
       Do not allocate extra space for another array, 
       you must do this by modifying the input array in-place with O(1) extra memory.
       The order of elements can be changed. It doesn't matter what you leave beyond the new length.
Example:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.
	 * @param nums
	 * @param val
	 * @return
	 */
  public int removeElement(int[] nums, int val) {
        int index=0;
        int length=0;
        while(index<nums.length) {
        	if(nums[index]!=val) nums[length++]=nums[index];
        	index++;
        }
        return length;
    }
  public static void main(String[]args) {
	    int[]nums= {2,2,3};
	    int length=new RemoveElement().removeElement(nums, 3);
	    System.out.print(length);
	    for(int i=0;i<length;i++)
	    	System.out.print(nums[i]);
  }
}
