package practice;

public class MultiplyString {
  /**
   * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
Note:
The length of both num1 and num2 is < 110.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
   */
  public String multiply(String num1, String num2) {
	    int[] result=new int[num1.length()+num2.length()];
	    int[] temp1=new int[num1.length()];
	    int[] temp2=new int[num2.length()];
	    for(int i=0;i<temp1.length;i++) {
	    	temp1[i]=num1.charAt(i)-'0';
	    }
	    for(int i=0;i<temp2.length;i++){
	    	temp2[i]=num2.charAt(i)-'0';
	    }
	    
	    for(int j=temp1.length-1;j>=0;j--) {
	    	for(int k=temp2.length-1;k>=0;k--) {
	    		  result[j+k+1]+=temp1[j]*temp2[k];
	    	}
	    }
	    int carry=0;
	    for(int i=result.length-1;i>=0;i--) {
	    	  int temp=(result[i]+carry)%10;
	    	  carry=(result[i]+carry)/10;
	    	  result[i]=temp;
	    }
	    StringBuilder b1=new StringBuilder();
	    for(int num:result) b1.append(num);
	    while (b1.length() != 0 && b1.charAt(0) == '0') b1.deleteCharAt(0);
        return b1.length() == 0 ? "0" : b1.toString();
	      
  }
  public static void main(String[]args) {
	    MultiplyString ms=new MultiplyString();
	    String num1="123456789";
	    String num2="987654321";
	    System.out.print(ms.multiply(num1, num2));
  }
}
