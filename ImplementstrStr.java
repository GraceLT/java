package practice;

public class ImplementstrStr {
	/**
	 * Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
	 * @param haystack
	 * @param needle
	 * @return
	 */
  public int strStr(String haystack, String needle) {
          if(haystack.contains(needle)) {
        	  return haystack.indexOf(needle);
          }
          else
        	  return -1;
    }
  public static void main(String[]args) {
	  ImplementstrStr s1=new ImplementstrStr();
	  System.out.print(s1.strStr("hello", "h"));
  }
}
