package practice;

public class MergeTwoSortedList {
	/**
	 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

     Example:

     Input: 1->2->4, 1->3->4
     Output: 1->1->2->3->4->4

	 * @param l1
	 * @param l2
	 * @return
	 */
 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode next1;
        ListNode next2;
        if(l1==null && l2!=null) return l2;
        if(l1!=null && l2==null) return l1;
        if(l1==null && l2==null) return null;
        if(l1.val<=l2.val) {
           head=l1;
           next1=l1.next;
           next2=l2;
           
        }
        else{
           head=l2;
           next1=l1;
           next2=l2.next;
        }
        if(next1==null) head.next=l2;
        else if(next2==null) head.next=l1;
        else {
        ListNode next=new ListNode(0);
        head.next=next;
        while(next1!=null && next2!=null) {
        	 if(next1.val<=next2.val) {
        		 next.val=next1.val;
        		 next1=next1.next;
        		 
        	 }
        	 else {
        		 next.val=next2.val;
        		 next2=next2.next;
        	 }
        	
        	 if(next1!=null && next2!=null) {
        	  next.next=new ListNode(0);
    		  next=next.next;
        	 }
        }
        
        if(next1!=null) {
        	next.next=new ListNode(0);
        	next=next.next;
        	while(next1!=null) {
        		next.val=next1.val;
        		next1=next1.next;
        		if(next1!=null){
        		next.next=new ListNode(0);
       		    next=next.next;
        		}
        	}
        }
        if(next2!=null) {
        	next.next=new ListNode(0);
        	next=next.next;
        	while(next2!=null) {
        		next.val=next2.val;
        		next2=next2.next;
        		if(next2!=null) {
        		next.next=new ListNode(0);
       		    next=next.next;
        		}
        	}
        }
      }
        return head;
    }
   public static void main(String[]args) {
	   ListNode l1=new ListNode(1);
	   l1.next=new ListNode(2);
	   l1.next.next=new ListNode(4);
	   ListNode l2=new ListNode(1);
	   l2.next=new ListNode(3);
	   l2.next.next=new ListNode(4);
	   MergeTwoSortedList m1=new MergeTwoSortedList();
	   ListNode result=m1.mergeTwoLists(l1, l2);
	   while(result!=null) {
		   System.out.println(result.val);
		   result=result.next;
	   }
   }
}
