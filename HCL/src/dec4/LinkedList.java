package dec4;

public class LinkedList {

	Node head,tail;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + "\n");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedList lld = new LinkedList();
		lld.head = new Node(101);
		lld.tail = new Node(104);
		Node second = new Node(102);
		Node third = new Node(103);

		lld.head.next = second;
		second.next = third;
		third.next = lld.tail;
		lld.tail.next = lld.head;

		lld.display();
	}

}
