package practice;

public class DivideTwoIntegers {
/*
 * Divide two integers without using multiplication, division and mod operator.
If it is overflow, return MAX_INT.
 */
	public int divide(int dividend, int divisor){  
	       int result=0;  
	       if(divisor == 0) //除数为0，返回最大值  
	           return Integer.MAX_VALUE;  
	       if(dividend == Integer.MIN_VALUE && divisor == -1){  
	           return ~dividend;  
	       }  
	       long dividend1 = Math.abs((long)dividend);  
	       long divisor1 = Math.abs((long)divisor);  
	  
	       while(dividend1 >= divisor1)//当被除数大于除数时，进行位移操作  
	       {  
	           int shiftnum = 0;  
	           while(dividend1 >= divisor1<<shiftnum){  
	               shiftnum++;//记录左移次数（比实际次数多1）  
	           }  
	           result += 1<<(shiftnum-1);  
	           dividend1 -= divisor1<<(shiftnum-1);//更新被除数的值  
	       }  
	       if((dividend>0 && divisor>0)||(dividend<0 && divisor<0))//计算正负数  
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
