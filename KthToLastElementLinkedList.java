package LinkedLists;
import java.util.Scanner;

public class KthToLastElementLinkedList {
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
		
		Node Kth = head;
		Node last  = head;
		
		int k,i = 0;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		while(i<k) {
			last = last.next;
			i++;
		}
		while(last.next != null) {
			Kth = Kth.next;
			last = last.next;
		}
		System.out.print("Kth node is" + Kth.data);
		sc.close();
	}

}
