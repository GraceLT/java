package practice;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
	/**
	 * 
	 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
      For example, given n = 3, a solution set is:
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
	 * @param n
	 * @return
	 */
	 public List<String> generateParenthesis(int n) {
		 int currentnumber=0;
		 int remainnumber=n;
		 LinkedList<String> result=new LinkedList<String>();
		 result.add("(");
	     for(int i=1;i<2*n;i++) {
	    	 while(result.peek().length()==i) {
	    		 String temp=result.remove();
	    		 int index=0;
	    		 while(index<temp.length()) {
	    		    	if(temp.charAt(index)=='(') {
	    		    		currentnumber++;
	    		    	    remainnumber--;
	    		    	}
	    		    	else{
	    		        	currentnumber--;
	    		        }
	    		     index++;
	    		 }
	    		 if(remainnumber>0)
	    			 result.add(temp+"("); 
	    		 if(currentnumber>0)
	    			 result.add(temp+")");
	    		currentnumber=0;
	    		remainnumber=n;
	    	 }
	     }
	     List<String> l1=result;
	     return l1;
	 }
	 public static void main(String[]args) {
		 GenerateParentheses g1=new GenerateParentheses();
		 List<String> result=g1.generateParenthesis(4);
		 for(String temp:result)
			 System.out.println(temp);
	 }
}
