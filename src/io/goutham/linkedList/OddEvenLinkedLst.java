package io.goutham.linkedList;

public class OddEvenLinkedLst {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		new OddEvenLinkedLst().oddEvenListSol(l1);

	}
	
	public ListNode oddEvenListSol(ListNode head) {
		  if(head==null)return head;
	       ListNode evenLst=null,evenLstPointer=null;//evenlinked list and a pointer for the same
	       ListNode oddLst=null,oddLstPointer=null;//oddLinked list and a pointer for the same
	       ListNode tmp=head; //Pointer to input
	        
	        int i=1; //Temporory variable used to determine the odd even place
	        while(tmp!=null){
	         if(i%2==0){ //i%2==0 means its even position
	            if(evenLst==null){
	            	evenLst=new ListNode(tmp.val); //add first element into the evenLst
	            	evenLstPointer=evenLst; //point the pointer and use pointer in next iteration
	            } else{
	                evenLstPointer.next=new ListNode(tmp.val);
	                evenLstPointer=evenLstPointer.next;
	            }
	            
	         } else{//i%2==1 means its odd position
	              if(oddLst==null){
	            	  oddLst=new ListNode(tmp.val);
	            	  oddLstPointer=oddLst;
	            } else{
	                oddLstPointer.next=new ListNode(tmp.val);
	                oddLstPointer=oddLstPointer.next;
	            }
	            
	         }  
	            tmp=tmp.next;
	            ++i;
	        }
	       oddLstPointer.next=evenLst; //point oddlist pointer to even list
	        return oddLst; //return oddlist now
	        
	    }

}
