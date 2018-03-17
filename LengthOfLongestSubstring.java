package practice;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author LIAOTING
 *
 *  should consider more carefully
 *  this case uses HashSet to check whether a character has shown up before
 *  there are outer loop because this
 *   abcdae  the longest substring is 5
 *   if without the outer loop the longest substring is 4
 */

public class LengthOfLongestSubstring {
   public int lengthOfLongestSubstring(String s) {
//	    s=s.trim();
//	    int longestlength=0;
//	    char currentchar;
//	    int  lastlength=0;
//	    int  currentlength=0;
//	    int index;
//	    if(s.length()==0) return 0;
//	    for (int count=0;count<=s.length()-1;count++ ) {
//	      index=count;
//	    Set<Character> charset=new HashSet<Character>();
//	    while(index<=s.length()-1) {
//	    	currentchar=s.charAt(index);
//	    	if(charset.contains(currentchar)) {
//	    		lastlength=currentlength;
//	    		currentlength=1;
//	    		if(lastlength>longestlength) {
//	    			longestlength=lastlength;
//	    			
//	    		}
//	    	}
//	    	else {
//	    		currentlength++;
//	    	}
//	    	charset.add(currentchar);
//	    	index++;
//	    }
//	        if(currentlength>=longestlength) longestlength=currentlength;
//	        currentlength=0;
//	   } 
//	        return longestlength;
/**
 *  time complexity O(n)
 *  The idea is use a hash set to track the longest substring without repeating characters so far, 
 *  use a fast pointer j to see if character j is in the hash set or not, if not, great, 
 *  
 *  
 *  add it to the hash set, 
 *  move j forward and update the max length, otherwise,
 *   delete from the head by using a slow pointer i until we can put character j to the hash set.
 */
	   
	   int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
    }
    public static void main(String[]args) {
    	String s= "abbcceed";
//    	System.out.println(s.length());
//    	System.out.println(s.charAt(0));
    	LengthOfLongestSubstring s1=new LengthOfLongestSubstring();
    	System.out.println(s1.lengthOfLongestSubstring(s));
    	
    }
}
