class Linkedlist{
	static Node h;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node reverse(Node head){
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	void display(Node head){
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public static void main(String[] args){
		
		Linkedlist l1 = new Linkedlist();
		l1.h = new Node(1);
		l1.h.next = new Node(2);
		l1.h.next.next = new Node(3);
		
		System.out.println("Given linked list ");
		l1.display(h);
		h = l1.reverse(h);
		System.out.println(" ");
		System.out.println("Reversed linked list");
		l1.display(h);
	}
}