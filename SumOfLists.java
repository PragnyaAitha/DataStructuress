package LinkedLists;

public class SumOfLists {
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(9);
		Node second = new Node(7);
		Node third = new Node(8);
		head.next = second;
		second.next = third;
		
		Node firstlist = head;
		
		Node head2 = new Node(6);
		second = new Node(8);
//		third = new Node(5);
		head2.next = second;
//		second.next = third;
		
		Node secondlist = head2;
		
		Node thirdlist = new Node(1);
		Node finalthirdlist = thirdlist;
		int carry = 0, sum;
		
		while (firstlist != null && secondlist != null) {
			sum = firstlist.data + secondlist.data + carry;
			Node temp = new Node(sum%10);
			thirdlist.next = temp;
			carry = sum/10;
			firstlist = firstlist.next;
			secondlist = secondlist.next;
			thirdlist = thirdlist.next;
		}
		if(firstlist == null) {
			while(secondlist != null) {
				sum = secondlist.data + carry;
				Node temp = new Node(sum%10);
				thirdlist.next = temp;
				carry = sum/10;
				secondlist = secondlist.next;
				thirdlist = thirdlist.next;
			}
			if (carry != 0) {
				Node temp = new Node(1);
				thirdlist.next = temp;
				carry = 0;
			}
		}
		if(secondlist == null) {
			while(firstlist != null) {
				sum = firstlist.data + carry;
				Node temp = new Node(sum%10);
				thirdlist.next = temp;
				carry = sum/10;
				firstlist = firstlist.next;
				thirdlist = thirdlist.next;
			}
			if (carry != 0) {
				Node temp = new Node(1);
				thirdlist.next = temp;
			}
		}
		sum = 0; int counter = 1;finalthirdlist = finalthirdlist.next;
		while(finalthirdlist != null) {
			sum = sum + finalthirdlist.data*counter;
			finalthirdlist = finalthirdlist.next;
			counter = counter*10;
		}
		System.out.println(sum);
		

	}

}
