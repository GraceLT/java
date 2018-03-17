package practice;

import java.awt.Window.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class QuickSort {

    public void quicksort(int low,int high,int[]a) {
    	 int start = low;
         int end = high;
         int key = a[low];
         
         
         while(end>start){
             //从后往前比较
             while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                 end--;
             if(a[end]<=key){
                 int temp = a[end];
                 a[end] = a[start];
                 a[start] = temp;
             }
             //从前往后比较
             while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
             if(a[start]>=key){
                 int temp = a[start];   
                 a[start] = a[end];
                 a[end] = temp;
             }
         //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
         }
         //递归
         if(start>low) quicksort(low,start-1,a);//左边序列。第一个索引位置到关键值索引-1
         if(end<high) quicksort(end+1,high,a);//右边序列。从关键值索引+1到最后一个
     
    	
    }
    public static void main(String[]args) {
    	 
    	int[]a= {9,8,7,6,5,4};
    	QuickSort q1=new QuickSort();
    	q1.quicksort(0, a.length-1, a);
    	for(int i:a)
    		System.out.print(i);
    	Map<Integer,Double> m1=new HashMap<Integer,Double>();
    	m1.put(0, 1.2);
    	m1.put(1,2.4);
    	m1.put(2, 1.1);
    	Integer[]array=new Integer[m1.size()];
        m1.keySet().toArray(array);
        for(int i=array.length-1;i>0;i--)
        	for(int j=0;j<i;j++) {
        		if(m1.get(array[j])>m1.get(array[j+1])) {
        			double bigger=m1.get(array[j]);
        			double smaller=m1.get(array[j+1]);
        			m1.put(j,smaller);
        			m1.put(j+1,bigger);
        		}
        	}
       System.out.print(m1);
       Set s1=new HashSet<String>();
       s1.add("apple");
       s1.add("orange");
       s1.add("pear");
       System.out.print(s1);
       Set s2=new TreeSet<String>();
       s2.add("apple");
       s2.add("orange");
       s2.add("pear");
      
       System.out.print(s2);
    }
}
