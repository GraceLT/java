package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	 Arrays.sort(candidates);
     List<List<Integer>> result=new ArrayList<List<Integer>>();
     List<Integer> tempList=new ArrayList<Integer>();
     backtrack(result,tempList,candidates,target,0);
     return result;
  }
public void backtrack(List<List<Integer>> list, List<Integer> tempList,int[] nums,int remain,int start) {
    if(remain<0) return;
    else if(remain==0) list.add(new ArrayList<>(tempList));
    else {
    	for(int i=start;i<nums.length;i++) {
    		if(i>start && nums[i]==nums[i-1]) continue;
    		tempList.add(nums[i]);
    		backtrack(list,tempList,nums,remain-nums[i],i+1);
    		tempList.remove(tempList.size()-1);
    	}
    }
 }
}
