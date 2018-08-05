package LinkedLists;

public class LoopDetection {
	static class Node{
		char data;
		Node next;
		Node(char d){
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node('A');
		Node second = new Node('B');
		Node third = new Node('C');
		Node fourth = new Node('D');
		Node fifth = new Node('E');
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		
		Node single = head.next, twice = head.next.next;
		
		while(single != twice) {
			single = single.next;
			twice = twice.next.next;
		}
		while(single.next != twice) {
			single = single.next;
			twice = twice.next.next;
		}
		if(single.next == twice) {
			System.out.println(twice.data);
		}
	}

}
