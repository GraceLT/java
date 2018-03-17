package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
	 * determine if the input string is valid.
       The brackets must close in the correct order, "()" and "()[]{}" are all valid 
       but "(]" and "([)]" are not.
	 * @param s
	 * @return
	 */
 public boolean isValid(String s) {
	    Map<Character,Character> parenthese=new HashMap<Character,Character>();
	    parenthese.put('(', ')');
	    parenthese.put('{', '}');
	    parenthese.put('[', ']');
	    List<Character> constantchar=new ArrayList<Character>();
	    constantchar.add('(');
	    constantchar.add('{');
	    constantchar.add('[');
	    if(s.length()<=1) return false;
	    else {
	      if(!constantchar.contains(s.charAt(0))) return false;
	      else {
	       int[] temp=new int[s.length()];
	       boolean flag=true;
	       int frontindex=-1;
		  
		   for(int i=0;i<s.length();i++) {
			   if(constantchar.contains(s.charAt(i))) temp[++frontindex]=i;
			   else {
				   if(frontindex>=0 && s.charAt(i)==parenthese.get(s.charAt(temp[frontindex])))
						 frontindex--;
				   else
					   return false;
			   }
			   
		   }
		      if(frontindex>=0) return false;
	          return flag;
	      }
	      
	    }
    }
  public static void main(String[]args) {
	  ValidParentheses v1=new ValidParentheses();
	  System.out.println(v1.isValid("[["));
  }
}
