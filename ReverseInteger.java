package practice;

public class ReverseInteger {
  public int reverse(int x) {
	  
	  
	  String result="";
	  String temp=String.valueOf(x);
	  int end;
	  if(x<0){
		result="-";
		end=1;
	  }
	  else end=0;
	  int index=temp.length()-1;
	  while(temp.charAt(index)==0) 
		  index--;
	  for(int i=index;i>=end;i--) {
		  result=result+temp.charAt(i);
	  }
	  long finalresult=Long.parseLong(result);
	  if(finalresult>Integer.MAX_VALUE || finalresult<Integer.MIN_VALUE)
		   return 0;
	  else
	     return (int)(finalresult);
	 
  }
  public static void main(String[]args) {
	  ReverseInteger r1=new ReverseInteger();
	  System.out.print(r1.reverse(1534236469));
  }
}
