package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountAndSay {
	 public String countAndSay(int n) {
	       if(n==1) return "1";
	       String result;
	       result=countAndSay1(n);
	       return result;
	       
     }
	 public String countAndSay1(int n) {
		 if(n==1) return "1";
		 else {
		 String temp;
		 temp=countAndSay1(n-1);
			 Map<String,Integer> m1=new LinkedHashMap<String,Integer>();
		     String front=""; 
		     String result="";
			 for(int i=0;i<temp.length();i++) {
				 if(String.valueOf(temp.charAt(i)).equals(front)){
					 int count=m1.get(front)+1;
					 m1.remove(front);
					 m1.put(String.valueOf(front),count);
				 }
				 else {
					 front=String.valueOf(temp.charAt(i));
					 if(m1.containsKey(front)){
						 Set<String> b=m1.keySet();
						 for(String k:b) {
					    	 result=result+m1.get(k)+k;
						 }
						 m1.clear();
					 }
					 m1.put(front, 1);
				 }
		    }
	     Set<String> a=m1.keySet();
	     for(String i:a)
	    	 result=result+m1.get(i)+i;
		 return result;
	    }
	 }
	 public static void main(String[]args) {
		 CountAndSay c1=new CountAndSay();
		 System.out.println(c1.countAndSay(8));
	 }
}
