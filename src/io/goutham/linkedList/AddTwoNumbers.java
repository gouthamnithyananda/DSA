package io.goutham.linkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);

		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);

		new AddTwoNumbers().addTwoNumbersSol(l1, l2);
	}

	public ListNode addTwoNumbersSol(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode(0);
		ListNode p = l1; // pointer to l1 for travering purpose
		ListNode q = l2; // pointer to l2
		ListNode curr = ans; // pointer to answer linkedlist
		int carry = 0; // carry initialized to 0

		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0; // get first node value if null assume 0
			int y = (q != null) ? q.val : 0; // get first node value if null assume 0
			int sum = (carry + x + y); // calculate sum using x and y and carry
			carry = sum / 10; // calculate carry
			curr.next = new ListNode(sum % 10); // add a new listnode to ans pointer curr
			curr = curr.next; // move curr to next node
			if (p != null)
				p = p.next; // move pointer of l1 to next node
			if (q != null)
				q = q.next; // move pointer of l2 to next node

		}
		if (carry > 0) { // if carry>0 means there is an addtional listnode
			curr.next = new ListNode(carry);
		}
		return ans.next;
	}
}
