package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note: The solution set must not contain duplicate triplets.
 */

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
	  List<List<Integer>> l1=new ArrayList<List<Integer>>();
	  Arrays.sort(nums);
      if(nums.length<3)
    	  return l1;
//      else {
//    	  for(int i=0;i<nums.length-2;i++) {
//    		  if(nums[i]>0) break;
//    		  for(int j=i+1;j<nums.length-1;j++) {
//    			  if(nums[i]+nums[j]>0) break;
//    			  for(int k=j+1;k<nums.length;k++) {
//    				  if(nums[i]+nums[j]+nums[k]==0) {
//    					  List<Integer> temp=new ArrayList<Integer>();
//    					  temp.add(nums[i]);
//    					  temp.add(nums[j]);
//    					  temp.add(nums[k]);
//    					  boolean flag=false;
//    					  for(int w=0;w<l1.size();w++) {
//    						  if(temp.containsAll(l1.get(w)) && l1.get(w).containsAll(temp)) {
//    						     flag=true;
//    						     break;
//    						  }
//    						  
//    					  }
//    					  if(!flag)
//    					  l1.add(temp);
//    					  break;
//    				  }
//    			  }
//    		  }
//    	  }				  
//    	   return l1;
//    	 
//      }
      /**
       * time complexity is reduced from O(n3) to O(n2)
       */
	   for(int i=0;i<nums.length-2;i++) {
		   if(i>0 && nums[i]==nums[i-1]) continue;//avoid duplicates;
		   for(int j=i+1,k=nums.length-1;j<k;) {
			   if(nums[i]+nums[j]+nums[k]==0) {
//				   List<Integer> temp=new ArrayList<Integer>();
//				   temp.add(nums[i]);
//				   temp.add(nums[j]);
//				   temp.add(nums[k]);
				   l1.add(Arrays.asList(nums[i],nums[j],nums[k]));
				   j++;
				   k--;
				   while(nums[j]==nums[j-1] && j<k) j++;//avoid duplicate
				   while(nums[k]==nums[k+1] && j<k) k--;//avoid duplicate
			   }
			   else if(nums[i]+nums[j]+nums[k]>0) k--;
			   else j++;
		   }
	   }
	   return l1;
  }
  public static void main(String[]args) {
	  ThreeSum ts=new ThreeSum();
	  int [] nums= {1,1,-2};
//	  Arrays.sort(nums);
//	  for(int i=0;i<nums.length;i++)
//		  System.out.print(nums[i]);
	  System.out.println();
	  List<List<Integer>> l1=ts.threeSum(nums);
	  if(l1.isEmpty()) System.out.println("{}");
	  else {
	   List<Integer> r2=new ArrayList<Integer>();
	   Iterator<List<Integer>> i1=l1.iterator();
	   Iterator<Integer> i2;
	   while(i1.hasNext()) {
		  i2=i1.next().iterator();
		  while(i2.hasNext())
			  System.out.print(i2.next()+" ");
		  System.out.println();
	  }
	 }
	  
	  
	  
  }
}
