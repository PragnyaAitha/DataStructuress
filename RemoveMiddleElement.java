package LinkedLists;


public class RemoveMiddleElement {
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
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eighth = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		
		Node Middle = head;
		Node last  = head;
		
		Node tempMiddle, tempLast;
		while(last.next != null && last.next.next != null) {
			tempMiddle = Middle.next;
			tempLast = last.next.next;
			if(tempLast.next == null || tempLast.next.next == null) {
				Middle.next = tempMiddle.next;
				break;
			}
			Middle = tempMiddle;
			last = tempLast;
		}
		
		Node h = head;
		while(h != null) {
			System.out.print(h.data+ " -> ");
			h = h.next;
		}
		
		 
	}

}

