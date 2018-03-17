package practice;

import java.util.Arrays;

public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {
	    int ClosestTarget=0;
	    int DiffTarget=Integer.MAX_VALUE;
	    int sum=0;
	    boolean flag=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        	for(int j=i+1,k=nums.length-1;j<k;) {
        		sum=nums[i]+nums[j]+nums[k];
        		if(sum-target==0) {
        			return target;       		
        		}
        		else {
        			if(sum>target) 
        				k--;
        			else
        				j++;
        			if(Math.abs(sum-target)<DiffTarget) {
        			    ClosestTarget=sum;
        			    DiffTarget=Math.abs(sum-target);
        			}
        		}
        	}
        return ClosestTarget;
    }
  public static void main(String[]args) {
	  int [] array= {1,2,5,10,11};
	  ThreeSumClosest th=new ThreeSumClosest();
	  System.out.print(th.threeSumClosest(array,12));
	  
  }
}
