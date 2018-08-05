package LinkedLists;

public class PalindromeCheck {
	static class Node{
		char data;
		Node next;
		Node(char d){
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node('I');
		Node first = new Node('s');
		Node second = new Node('a');
		Node third = new Node('w');
		Node fourth = new Node('a');
		Node fifth = new Node('w');
		Node sixth = new Node('a');
		Node seventh = new Node('q');
		Node eighth = new Node('I');
		
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		
		int size = 0,i; Node temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		temp = head;
		for(i=0;i<size/2 - 1;i++) {
			temp = temp.next;
		}
		
		if (size%2 == 0) {
			temp = temp.next;
		}else {
			temp = temp.next.next;
		}
		first = temp;
		second = temp.next;
		third = temp.next.next;
		first.next = null;
		
		while(third!= null) {
			second.next = first;
			first = second;
			second = third;
			third = third.next;
		}
		second.next = first;
		
		while(second != null) {
			if(second.data == head.data) {
				second = second.next;
				head = head.next;
				
			}else {
				break;
			}
		}
		if(second == null) {
			System.out.println("Given linked list is a palindrome");
		}else {
			System.out.println("Given linked list is not a palindrome");
		}
		
	}

}
