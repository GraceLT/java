package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
//   public String longestPalindrome(String s) {
//	   String result="";
//	   if(s.length()<=1) return s;
//	   else { 
//		   int i=0;
//		   int j=s.length()-1;
//		   Set<Integer> location=new HashSet<Integer>();
//		   location=longestPalindrome2(i,j,s,location);
//		   int [] Substring=new int[location.size()];
//		   int k=0;
//		   for(int q:location) {
//			   Substring[k]=q;
//			   k++;	 
//		   }
//		   for(int w=Substring.length-1;w>0;w--)
//			   for(int r=0;r<w;r++) {
//				   if(Substring[r]>Substring[r+1]) {
//					   int temp=Substring[r];
//					   Substring[r]=Substring[r+1];
//					   Substring[r+1]=temp;
//				   }
//			   }
//		   for(int h=0;h<Substring.length;h++)
//			   result=result+s.charAt(Substring[h]);
//	   }
//	   return result;
//   }
//   public Set<Integer> longestPalindrome2(int i,int j,String s,Set<Integer> location) {
//	   if(i==j) { 
//		   location.add(i); 
//		   return location;
//		   }
//	   if(i>j)  return location;
//	   if(s.charAt(i)==s.charAt(j)) {
//			   location.add(i);
//			   location.add(j);
//			   location=longestPalindrome2(i+1,j-1,s,location);
//		}
//	   else {
//			   
//			   Set<Integer> location1=longestPalindrome2(i+1,j,s,location);
//			   Set<Integer> location2=longestPalindrome2(i,j-1,s,location);
//			   if(location1.size()>=location2.size())
//			   location=location1;
//			   else
//				   
//			   location=location2;
//	   }
//	   
//	   return location;
//   }
    private int lo,maxLen;
    public String longestPalindrome(String s) {
    	int len=s.length();
    	if(len<2)
    		return s;
    	for(int i=0;i<len-1;i++) {
    		extendPalindrome(s,i,i); //assume odd length, try to extend Palindrome as possible center i
    		extendPalindrome(s,i,i+1);//assume even length. center i,i+1
    	}
    	return s.substring(lo, lo+maxLen);
    }
    private void extendPalindrome(String s,int j,int k) {
    	while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)) {
    		j--;
    		k++;
    	}
    	/*
    	 * 有两种情况while循环会终止
    	 * 1.j 或者k 越界了 k-1-(j+1)+1=k-j-1
    	 * 2.j 和 k 没有越界 但是不相等
    	 */
    	if(maxLen<k-j-1) {
    		lo=j+1;
    		maxLen=k-j-1;
    	}
    }
    public static void main(String[]args) {
    	String a="a";
    	LongestPalindrome l1=new LongestPalindrome();
    	System.out.print(l1.longestPalindrome(a));
    }
}
