package practice;

public class StringtoInteger {
  public static int myAtoi(String str) {
	 if(str==null || str.length()==0) {
		 return 0;
	 }
	 str=str.trim();
	 char firstChar=str.charAt(0);
	 int sign=1,start=0,len=str.length();
	 int sum=0;
	 if(firstChar=='+') {
		 sign=1;
		 start++;
	 }else if(firstChar=='-') {
		 sign=-1;
		 start++;
	 }
	 for(int i=start;i<len;i++) {
		 int digit=str.charAt(i)-'0';
		 if(digit<0||digit>9)
			 break;
		 if(Integer.MAX_VALUE/10 <sum || Integer.MAX_VALUE/10 == sum && Integer.MAX_VALUE %10 < digit) //判断乘以10次 10 后 是否overflow
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

	        sum = 10 * sum + digit;
	 }
	 
	 int temp=(int)sum*sign;
	 
	 return temp;
  }
  public static void main(String[]args) {
	  StringtoInteger s1=new StringtoInteger();
	  System.out.print(s1.myAtoi("02147489"));
  }
}
