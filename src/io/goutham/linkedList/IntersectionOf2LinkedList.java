package io.goutham.linkedList;

public class IntersectionOf2LinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(8);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(1);
		l2.next.next.next = new ListNode(8);
		l1.next.next.next.next = new ListNode(4);
		l1.next.next.next.next.next = new ListNode(5);

		ListNode result = new IntersectionOf2LinkedList().getIntersectionNode(l1, l2);
		System.out.println(result.val);

	}
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 ListNode ptr1=headA;
		 ListNode ptr2=headB;
		 if(ptr1==null|| ptr2==null)return null;
		 
		 while(ptr1!=ptr2) {
			 ptr1=ptr1.next;
			 ptr2=ptr2.next;
			 
			 if(ptr1==ptr2)
				 {
				 return ptr1;
				 
				 }
			 
			 if(ptr1==null)ptr1=headB;
			 if(ptr2==null)ptr2=headA;
		 }
		 return ptr1;
	 }

}
