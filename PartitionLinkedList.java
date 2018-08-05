package LinkedLists;
import java.util.Scanner;

public class PartitionLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(3);
		Node second = new Node(5);
		Node third = new Node(8);
		Node fourth = new Node(5);
		Node fifth = new Node(10);
		Node sixth = new Node(2);
		Node seventh = new Node(1);
		Node eighth = new Node(2);
		Node ninth = new Node(1);
		Node tenth = new Node(4);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		
		Scanner sc = new Scanner(System.in);
		int pivot = sc.nextInt();
		Node loop = head, temp, left = null, right = null, equal = null, templeft = null, tempright = null, tempequal = null;
		while(loop != null) {
			if(loop.data < pivot) {
				temp = new Node(loop.data);
				if (templeft != null) {
					templeft.next = temp;
					templeft = temp;
				}else {
					templeft = temp;
					left = templeft;
				}
			}
			if(loop.data > pivot){
				temp = new Node(loop.data);
				if (tempright != null) {
					tempright.next = temp;
					tempright = temp;
				}else {
					tempright = temp;
					right = tempright;
				}
			}
			if(loop.data == pivot) {
				temp = new Node(loop.data);
				if (tempequal != null) {
					tempequal.next = temp;
					tempequal = temp;
				}else {
					tempequal = temp;
					equal = tempequal;
				}
			}
			loop = loop.next;
		}
		templeft.next = right;
		tempright.next = equal;
		
		Node h = left;
		while(h != null) {
			System.out.print(h.data+ " -> ");
			h = h.next;
		}
		sc.close();
	}
}
