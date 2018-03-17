package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
 public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        	if(i!=0 && nums[i]==nums[i-1]) continue;
        	for(int j=nums.length-1;j>=i+3;j--){
        		if(j!=nums.length-1 && nums[j]==nums[j+1]) continue;
        		for(int k=i+1,w=j-1;k<w;) {
        			if(nums[i]+nums[j]+nums[k]+nums[w]==target) {
        				List<Integer> temp=new ArrayList<Integer>();
        				temp.add(nums[i]);
        				temp.add(nums[j]);
        				temp.add(nums[k]);
        				temp.add(nums[w]);
        				result.add(temp);
        				k++;
        				w--;
        				while(nums[k]==nums[k-1] && k<w) k++;
        				while(nums[w]==nums[w+1] && w>k) w--;
        				
        			}
        			else if(nums[i]+nums[j]+nums[k]+nums[w]<target) 
        				k++;
        			else
        				w--;
        			
        		}
        	  }	
        	}
        return result;
    }
    public static void main(String[]args) {
    	FourSum s1=new FourSum();
    	int[] nums={5, 5, 3, 5, 1, -5,1,-2};
    	List<List<Integer>> l1=s1.fourSum(nums, 0);
    	for(List<Integer> temp:l1) {
    		for(int i:temp)
    			System.out.print(i);
    		System.out.println();
    	}
    	
    }
}
