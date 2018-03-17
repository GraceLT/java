package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Given a collection of numbers that might contain duplicates, 
 * return all possible unique permutations.
For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 * @author LIAOTING
 *
 */
public class PermutationsII {
public List<List<Integer>> permuteUnique(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> l1=new ArrayList<List<Integer>>();
	        List<Integer> tempList=new ArrayList<Integer>();
	        backtrack(l1,tempList,nums,new boolean[nums.length]);
	        return l1;
	    }
	 public void backtrack(List<List<Integer>> l1,List<Integer> tempList,int []nums,boolean[] used) {
		   if(tempList.size()==nums.length){
			   l1.add(new ArrayList<>(tempList));
		   }
		   else {
			   for(int i=0;i<nums.length;i++) {
				   if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1] ) continue;
				   else{
					   tempList.add(nums[i]);
					   used[i]=true;
					   backtrack(l1,tempList,nums,used);
					   used[i]=false;
					   tempList.remove(tempList.size()-1);
				   }
			   }
		   }
	 }
	 public static void main(String[]args) {
		  PermutationsII p1=new PermutationsII();
		  int [] nums= {1,1,2};
		  System.out.print(p1.permuteUnique(nums));
	 }
 }

