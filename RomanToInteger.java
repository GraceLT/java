package practice;

public class RomanToInteger {
  public int romanToInt(String s) {
	  /*
	   * Symbol	I	V	X	L	C	D	M
	     Value	1	5	10	50	100	500	1,000
	   */
	   String sequence="IVXLCDM";
	   int[] value= {1,5,10,50,100,500,1000};
	   int sum=0;
	   int index=s.length()-1;
	   while(index>=0) {
		   char temp=s.charAt(index);
		   int  tempindex=sequence.indexOf(temp);
		   if(index>0) {
			   int beforecharindex=sequence.indexOf(s.charAt(index-1));
			   if(tempindex>beforecharindex){
				     sum=sum+value[tempindex]-value[beforecharindex];
				     index=index-2;
				     continue;
			   }
			   			   
		   }
			     sum=sum+value[tempindex];
			     index--; 
	   }
	   return sum;
	 
  }
  public static void main(String[]args) {
	  RomanToInteger r1=new RomanToInteger();
	  System.out.print(r1.romanToInt("XXXVIII"));
  }
}
