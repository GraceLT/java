package practice;

public class SwapNodesInPairs {
	/**
	 * Given a linked list, swap every two adjacent nodes and return its head.
       For example,
       Given 1->2->3->4, you should return the list as 2->1->4->3.
       Your algorithm should use only constant space. 
       You may not modify the values in the list, only nodes itself can be changed.


	 * @param head
	 * @return
	 */
 public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        else {
        	  ListNode temp=head.next;
        	  head.next=temp.next;
        	  temp.next=head;
        	  head=temp;
        	  ListNode Next=head.next.next;
        	 // System.out.print(Next.val);
        	  ListNode front=head.next;
        	 // System.out.print(front.val);
        	  while(Next!=null) {
        		  if(Next.next==null) break;
        		  else {
        			  temp=Next.next;
        			//  System.out.print(temp.val);
        			  front.next=temp;
        		//	  System.out.print(front.next.val);
        			  Next.next=temp.next;
        //			  System.out.print(Next.next.val);
        			  temp.next=Next;
        	//		  System.out.print(temp.next.val);
        		  }
        		      Next=Next.next;
        		   //   System.out.print(Next.val);
        		      front=temp.next;
        		   //   System.out.print(front.val);
        		      
        	  }
        	  return head;
        }
    }
 /**
  * public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    while (current.next != null && current.next.next != null) {
        ListNode first = current.next;
        ListNode second = current.next.next;
        first.next = second.next;
        current.next = second;
        current.next.next = first;
        current = current.next.next;
    }
    return dummy.next;
}
  * @param args
  */
  public static void main(String[]args) {
	  ListNode head=new ListNode(1);
	  int[] a={1,2,3,4};
//	  ListNode temp=head.addNode(a);
	  ListNode resultha=head.addNode(a);
//	  while(temp!=null) {
//		  System.out.print(temp.val);
//		  temp=temp.next;
//	  }
	  SwapNodesInPairs s1=new SwapNodesInPairs();
	  ListNode result=s1.swapPairs(resultha);
	  while(result!=null) {
		  System.out.print(result.val);
		  result=result.next;
	  }
  }
}
