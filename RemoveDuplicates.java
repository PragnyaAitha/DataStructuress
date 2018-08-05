package LinkedLists;

public class RemoveDuplicates {

	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(10);
		Node second = new Node(8);
		Node third = new Node(8);
		Node fourth = new Node(6);
		Node fifth = new Node(8);
		Node sixth = new Node(7);
		Node seventh = new Node(6);
		Node eighth = new Node(10);
		Node ninth = new Node(7);
		Node tenth = new Node(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		
		Node main = head, loop, temploop;
		while(main.next != null) {
			loop = main.next; temploop = main;
			while(loop != null) {
				if ( loop.data == main.data) {
					loop = loop.next;
					temploop.next = loop;
				}
				else {
					temploop = temploop.next;
					loop = loop.next;
				}
			}
			main = main.next;
		}
		
		
		Node h = head;
		while(h != null) {
			System.out.print(h.data+ " -> ");
			h = h.next;
		}

	}

}