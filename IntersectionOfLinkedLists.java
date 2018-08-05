package LinkedLists;

public class IntersectionOfLinkedLists {
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node eleven = new Node(11);
		Node twelve = new Node(12);
		Node thirteen = new Node(13);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = eleven;
		eleven.next = twelve;
		twelve.next = thirteen;
		
		Node firstlist = head;
		
		Node head2 = new Node(2);
		second = new Node(3);
		third = new Node(1);
		eleven = new Node(11);
		twelve = new Node(12);
		thirteen = new Node(13);
		
		head2.next = second;
		second.next = third;
		third.next = eleven;
		eleven.next = twelve;
		twelve.next = thirteen;

		Node secondlist = head2;
		int firstlength = 0, secondlength = 0, i, intersection = -1, counter = 0;
		
		while(firstlist != null) {
			firstlength++;
			firstlist = firstlist.next;
		}
		while(secondlist != null) {
			secondlength++;
			secondlist = secondlist.next;
		}
		firstlist = head;secondlist = head2;
		if(firstlength > secondlength) {
			for(i=0; i< firstlength-secondlength; i++) {
				firstlist = firstlist.next;
			}
		}
		if(firstlength < secondlength) {
			for(i=0; i< secondlength-firstlength; i++) {
				secondlist = secondlist.next;
			}
		}
		
		while(firstlist !=null && secondlist != null) {
			if(firstlist.data == secondlist.data) {
				 counter++;
				 if(counter == 1) {
					 intersection = firstlist.data;
				 }
			}else {
				counter = 0;
			}
			firstlist = firstlist.next;
			secondlist = secondlist.next;
		}
		
		if(counter > 1) {
			System.out.println("Intersection of the two linked lists is " + intersection);
		}else {
			System.out.println("Intersection of the two linked lists is null");
		}
		

	}

}
