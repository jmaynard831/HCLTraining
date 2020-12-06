package dec4;

public class DoubleLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) {
			data = d;
		}
	}

	Node head, tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}

		tail.next = head;
		head.prev = tail;
	}

	public void displayForward() {
		Node n = head;
		while (n.next != head) {
			System.out.println(n.data + "\n");
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void displayBackward() {
		Node n = tail;

		while (n.prev != null) {
			System.out.println(n.data);
			n = n.prev;
		}
		System.out.println(n.data);
	}

	public static void main(String[] args) {
		DoubleLinkedList lld = new DoubleLinkedList();
		lld.addNode(100);
		lld.addNode(400);
		lld.addNode(500);

		lld.displayForward();
	}

}
