package practice;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
 public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l1=new ArrayList<List<Integer>>();
        List<Integer> tempList=new ArrayList<Integer>();
        backtrack(l1,tempList,nums);
        return l1;
    }
 public void backtrack(List<List<Integer>> l1,List<Integer> tempList,int []nums) {
	   if(tempList.size()==nums.length)
		   l1.add(new ArrayList<>(tempList));
	   else {
		   for(int i=0;i<nums.length;i++) {
			   if(tempList.contains(nums[i])) continue;
			   else {
				   tempList.add(nums[i]);
				   backtrack(l1,tempList,nums);
				   tempList.remove(tempList.size()-1);
			   }
		   }
	   }
 }
 public static void main(String[]args) {
	 Permutations p1=new Permutations();
	 int[] nums= {1,2,3,4};
	 System.out.print(p1.permute(nums));
 }
}
