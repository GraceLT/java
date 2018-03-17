package practice;

import java.util.Arrays;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
	    int minlenINDEX=Integer.MAX_VALUE;
	    if (strs.length==0) return "";
	    if (strs.length==1) return strs[0];
	    //Arrays.sort(strs);
	    String commonPrefix="";
	    boolean flag=true;
        for(int i=0;i<strs.length;i++)
        	 minlenINDEX=Math.min(minlenINDEX, strs[i].length());
        int index=0;
        while(index<minlenINDEX) {
        	char temp=strs[0].charAt(index);
        	for(int i=1;i<strs.length;i++) {
        		if(strs[i].charAt(index)!=temp) {
        			flag=false;
        			break;
        		}
        	}
            if(flag) {
            	index++;
            	commonPrefix=commonPrefix+temp;
            }
            else
              break;
        }
        return commonPrefix;
    }
  public static void main(String[]args) {
	    String[] a= {"aaa","abacd","abcsdf"};
	    LongestCommonPrefix l1=new LongestCommonPrefix();
	    System.out.print(l1.longestCommonPrefix(a));
  }
}
