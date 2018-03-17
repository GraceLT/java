package practice;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; next=null; }
	public ListNode addNode(int[] a) {
		ListNode head=new ListNode(a[0]);
		ListNode Next=new ListNode(0);
		head.next=Next;
		int index=1;
		while(index<a.length) {
			Next.val=a[index];
			if(index<a.length-1) {
			Next.next=new ListNode(0);
			Next=Next.next;
			}
			index++;
		}
		return head;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     ListNode first=l1;
	     ListNode second=l2;
	     ListNode x=new ListNode(-1);;
	     ListNode temp;
	     int count=1;
	     ListNode head=new ListNode(-1);
	     int add=0;
	     while(first!=null && second!=null) {
	
	    	 // temp=new ListNode(-1);
	    	  int sum=first.val+second.val+add;
	    	  if(sum>9) {
	    		  x.val=sum-10;
	    		  add=1;
	    	  }
	    	  else {
	    		  add=0;
	    		  x.val=sum;
	    	  }
	    	  if(count==1) head=x;
	    	  first=first.next;
	    	  second=second.next;
	    	  if(first!=null || second !=null) {
	    		  x.next=new ListNode(-1);
	    		  x=x.next;
	    	  }
	    	  count++;
	     }
	     ListNode leftNode=null;
	     if(first!=null) leftNode=first;
	     if(second!=null) leftNode=second;
	     while(leftNode!=null) {
	    	 int sum=leftNode.val+add;
	    	 if(sum>9) {
	    		  x.val=sum-10;
	    		  add=1;
	    	  }
	    	  else {
	    		  add=0;
	    		  x.val=sum;
	    	  }
	    	 leftNode=leftNode.next;
	    	 if(leftNode!=null) {
	    		 x.next=new ListNode(-1);
	    		  x=x.next;
	    	 }
	    		 
	     }
	     if(add==1) {
	    	 ListNode finalnode = new ListNode(add);
	    	 x.next=finalnode;
	     }
	     return head;
    }
   public static void main(String[]args) {
	   ListNode x1=new ListNode(3);
	   //ListNode x2=new ListNode(8);
	   //ListNode x3=new ListNode(5);
//	   x1.next=x2;
//	   x2.next=x3;
	   ListNode x4=new ListNode(7);
//	   ListNode x5=new ListNode(5);
//	   ListNode x6=new ListNode(9);
//	   x4.next=x5;
//	   x5.next=x6;
	   ListNode instance=new ListNode(-1);
	   ListNode head=instance.addTwoNumbers(x1, x4);
	   while(head!=null) {
		   
		   System.out.print(head.val);
		   
		   if(head.next==null) return;
		   else 
			   System.out.print("->");
		   head=head.next;
	   }
   }
}
