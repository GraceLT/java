package practice;

public class ContainerWithMostWater {
  public int  maxArea(int[]height) {
	     int maxarea=0;
	     int i=0,j=height.length-1;
	     while(i<j) {
	    	  maxarea=Math.max(maxarea,(j-i)*Math.min(height[i], height[j]));
	    	 if(height[i]>height[j]) {
	              int t;
	              for(t=j-1;t>i && height[t]<=height[j];t--);
	              j=t;
	    	 }
	    	 else {
	    		  int t;
	    		  for(t=i+1;t<j && height[t]<=height[i];t++);
	    		  i=t;
	    	 }
	     }
	     return maxarea;
	  }
  public static void main(String[]args) {
	  ContainerWithMostWater c1=new ContainerWithMostWater();
	  int[] height= {1,2,1};
	  System.out.println(c1.maxArea(height));
  }
}
