package practice;

public class DivideTwoIntegers {
/*
 * Divide two integers without using multiplication, division and mod operator.
If it is overflow, return MAX_INT.
 */
	public int divide(int dividend, int divisor){  
	       int result=0;  
	       if(divisor == 0) //����Ϊ0���������ֵ  
	           return Integer.MAX_VALUE;  
	       if(dividend == Integer.MIN_VALUE && divisor == -1){  
	           return ~dividend;  
	       }  
	       long dividend1 = Math.abs((long)dividend);  
	       long divisor1 = Math.abs((long)divisor);  
	  
	       while(dividend1 >= divisor1)//�����������ڳ���ʱ������λ�Ʋ���  
	       {  
	           int shiftnum = 0;  
	           while(dividend1 >= divisor1<<shiftnum){  
	               shiftnum++;//��¼���ƴ�������ʵ�ʴ�����1��  
	           }  
	           result += 1<<(shiftnum-1);  
	           dividend1 -= divisor1<<(shiftnum-1);//���±�������ֵ  
	       }  
	       if((dividend>0 && divisor>0)||(dividend<0 && divisor<0))//����������  
	           return result;  
	       else  
	           return -result;  
	   }  

	// It's easy to handle edge cases when
	// operate with long numbers rather than int
	
  public static void main(String[]args) {
	  DivideTwoIntegers d1=new DivideTwoIntegers();
	  System.out.print(d1.divide(28, 3));
  }
}
