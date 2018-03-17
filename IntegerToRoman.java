package practice;

import java.util.StringTokenizer;

public class IntegerToRoman {
  /*
   * Symbol	I	V	X	L	C	D	M
     Value	1	5	10	50	100	500	1,000
     Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.
   */
//  public String intToRoman(int num) {
//          
//    }
  public static void main(String[] args) {
	  String [] info=new String[2];
	  String temp="hello world";
	  StringTokenizer s1=new StringTokenizer(temp);
	  int index=0;
	  while(s1.hasMoreTokens()) {
		  info[index]=s1.nextToken();
		  index++;
	  }
	  for(String i:info)
	  System.out.println(i);
	  boolean isMove=false;
	  if(isMove!=true)
		  System.out.print(isMove);
  }
}
