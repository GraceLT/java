package practice;

public class MedianOfSortedArray {
//	public static int findKthSmallest(int[]a,int m,int begin1,int[]b,int n,int begin2,int k) {
//		if(m>n)
//			return findKthSmallest(b,n,begin2,a,m,begin1,k);
//		if(m==0)
//			return b[begin2+k-1];
//		if(k==1)
//			return Integer.min(a[begin1],b[begin2]);		
//		int partA=Integer.min(k/2,m),partB=k-partA;
	
//		if(a[begin1+partA-1]==b[begin2+partB-1])
//			return a[begin1+partA-1];
//		else if (a[begin1 + partA - 1] > b[begin2 + partB - 1])
//			return findKthSmallest(a, m, begin1, b, n - partB, begin2 + partB, k - partB);
//		else
//			return findKthSmallest(a, m - partA, begin1 + partA, b, n, begin2, k - partA);
//	}
//	public static double findMedianSortedArrays(int[]nums1,int[]nums2) {
//		int len1=nums1.length,len2=nums2.length,sumLen=len1+len2;
//		if(sumLen%2 !=0) {
//			return findKthSmallest(nums1,len1,0,nums2,len2,0,sumLen/2+1);
//		}
//		else {
//			return (findKthSmallest(nums1,len1,0,nums2,len2,0,sumLen/2)+findKthSmallest(nums1,len1,0,nums2,len2,0,sumLen/2+1))/2;
//		}
//	}
	public static double findMedianSortedArrays(int[]nums1,int[]nums2) {
      int nums1length=nums1.length;
      int nums2length=nums2.length;
      int nums1begin=0;
      int nums1end=0;
      int nums2begin=0;
      int nums2end=0;
      double median;
      if(nums1.length!=0 && nums2.length!=0) {
    	if(nums1[nums1.length-1]<=nums2[0]) {
    		int temp=nums1.length+nums2.length;
    		int[] a=new int[temp];
    		for(int i=0;i<nums1.length;i++)
    			a[i]=nums1[i];
            int j=nums1.length;
    		for(int index=0;index<nums2.length;index++) {
    			a[j]=nums2[index];
    			j++;
    		}
    		if(a.length%2!=0) {
    		    return (double)a[(a.length-1)/2];
    		}
    		else
    			return (double)(a[(a.length-1)/2]+a[(a.length-1)/2+1])/2;
    	}
        median=findMedianSortedArrays2(nums1,0,nums1.length-1,nums2,0,nums2.length-1);
        return median;
      }
      else if(nums1.length==0) {
    	  int index2=(nums2.length-1)/2;
    	  if((nums2.length-1)%2==0)
      		  median=nums2[index2];
      	  else {
      		    median=(double)(nums2[index2]+nums2[index2+1])/2;
      		  
      	  }
    	  return median;
      }
      else if(nums2.length==0) {
    	  int index1=(nums1.length-1)/2;
    	  if((nums1.length-1)%2==0)
      		  median=nums1[index1];
      	  else {
      		 median=(double)(nums1[index1]+nums1[index1+1])/2;
      		  
      	  }
    	  return median;
      }
      else 
    	  return 0.0;
	}
	public static double findMedianSortedArrays2(int[] nums1,int nums1begin,int nums1end,int[] nums2,int nums2begin,int nums2end) {
	
	  for(int i=nums1begin;i<=nums1end;i++)
		  System.out.print(nums1[i]);
	  System.out.println("");
	  for(int i=nums2begin;i<=nums2end;i++)
		  System.out.print(nums2[i]);
	  System.out.println("");
	  
	  int index1=(nums1begin+nums1end)/2;
  	  int index2=(nums2begin+nums2end)/2;
  	  double median1=0;
      double median2=0;
      boolean flag1=true;
      boolean flag2=true;
  	  if((nums1begin+nums1end)%2==0)
  		  median1=nums1[index1];
  	  else {
  		  median1=(double)(nums1[index1]+nums1[index1+1])/2;
  		  flag1=false;
  	  }
  	  if((nums2begin+nums2end)%2==0)
  		  median2=nums2[index2];
  	  else {
  		  median2=(double)(nums2[index2]+nums2[index2+1])/2;
  		  flag2=false;
  	  }
  	  if(nums1.length%2==0 && nums2.length%2==0) {
		  if(nums1begin<=nums2begin && nums2end<=nums1end)
			  return median2;
		  else if(nums2begin>=nums1begin && nums1end<=nums2end)
			  return median1;
	  }
  	  if(nums1begin==nums1end && nums2begin==nums2end){
  		  return (median1+median2)/2.0;
  	  }
  	  
  	  else {
  	   if(median1<median2) {
  		  if(!flag1)
  		   return findMedianSortedArrays2(nums1,index1+1,nums1end,nums2,nums2begin,index2);
  		  else
  		   return findMedianSortedArrays2(nums1,index1,nums1end,nums2,nums2begin,index2);
  	   }
  	   else if(median1>median2) {
  		  if(!flag2)
    		return  findMedianSortedArrays2(nums1,nums1begin,index1,nums2,index2+1,nums2end);
          else 
    		return findMedianSortedArrays2(nums1,nums1begin,index1,nums2,index2,nums2end);
  	   }
  	   else {
  		    return median1;
  	   }
  	  }  
	}
    public static void main(String[]args) {
       int[] nums1= {1,2,3,4};
	   int[] nums2= {5,6,7,8};
	   MedianOfSortedArray m1=new MedianOfSortedArray();
	   System.out.print(m1.findMedianSortedArrays(nums1, nums2));
   }
}
