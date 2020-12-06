package dec4;

import dec4.LinkedList.Node;

public class ScopeTest {
/*
 * So when node is static inside lld,
 * i can use it fine, i just need to
 * import it dec4.lld.node;
 * 
 * when it is nonstatic inside lld,
 * i cant inst nodes anywhere
 * 
 * nonstatic outside is fine. 
 * 
 */
	
	public static void main(String[] args) {
		
		LinkedList lld = new LinkedList();
		
		lld.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);

		lld.head.next = second;
		second.next = third;

		lld.display();

		
	}
}
