package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndofList {
	/**
	 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
	 * @param head
	 * @param n
	 * @return
	 */
// public ListNode removeNthFromEnd(ListNode head, int n) {
//	   ListNode result;
//	   List<Integer> temp=new ArrayList<Integer>();
//	   temp.add(head.val);
//	   ListNode NodeNext=head.next;
//	   while(NodeNext!=null) {
//		   temp.add(NodeNext.val);
//		   NodeNext=NodeNext.next;
//	   }
//	   int size=temp.size();
//	   if(size==1 && n==1) return null;
//	   else {
//	     int removeindex=size-n;
//	     ListNode Next=new ListNode(0);
//	     if(removeindex==0) {
//		   result=new ListNode(temp.get(1));
//		   result.next=Next;
//		   for(int index=1;index<size;index++){
//			   Next.val=temp.get(index);
//			   if(index+1<size) {
//			   Next.next=new ListNode(0);
//			   Next=Next.next;
//			   }
//		   }
//	     }
//	     else {
//		     result=new ListNode(temp.get(0));
//		     result.next=Next;
//		     for(int index=1;index<size;index++) {
//			   if(index==removeindex) {
//				   if(index==size-1) Next=null;
//				   else
//				   continue;
//			   }
//			   else {
//				   Next.val=temp.get(index);
//				   if(index+1<size) {
//					   Next.next=new ListNode(0);
//					   Next=Next.next;
//				   }
//			   }
//		   }
//	     }
//	 }
//	   return result;
// }
	public ListNode removeNthFromEnd(ListNode head, int n) {	    
	    ListNode start = new ListNode(0);
	    ListNode slow = start, fast = start;
	    slow.next = head;
	    
	    //Move fast in front so that the gap between slow and fast becomes n
	    for(int i=1; i<=n+1; i++)   {
	        fast = fast.next;
	    }
	    //Move fast to the end, maintaining the gap
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    //Skip the desired node
	    slow.next = slow.next.next;
	    return start.next;
	  }
  public static void main(String[]args){
	 ListNode head=new ListNode(1);
	 ListNode Next=new ListNode(0);
	 head.next=Next;
	 for(int i=1;i<5;i++) {
		 Next.val=i+1;
		 System.out.println(Next.val);
		 if(i<4) {
		 Next.next=new ListNode(0);
		 Next=Next.next;
		 }
	 }
	 ListNode result=new RemoveNthNodeFromEndofList().removeNthFromEnd(head, 1);
	 while(result!=null){
		 System.out.println(result.val);
		 result=result.next;
	 }
 }
}
