/**
 * 
 */
package java_generics;

/**
 * @author MD_AFROZ
 *
 */
public class Operations {
Node head;
Node tail;
	
	// Push as first node will be the last node
	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			head = node;
			node.next = temp;
		}
	}

	// Push as last node will be the first node
	public void append(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
	
	// Insert node
		public void insert(int data) {
			Node node = new Node(data);
			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = tail.next;
			}
		}

		// Method to insert between two nodes
		public void insertBetweenNode(int a, int b, int c) {
			Node newNode = new Node(c);
			Node temp = head;
			while (temp.next != null) {
				if ((temp.data == a && temp.next.data == b) || (temp.data == a && temp.next.data == b)) {
					Node afterc = temp.next;
					temp.next = newNode;
					temp.next.next = afterc;
					break;
				}
				temp = temp.next;
			}
		}
		
		// Delete the first node in linkedList using pop
		public void pop() {
			Node temp = head;
			if (head == null) {
				System.out.println("List is empty");
			} else {
				head = temp.next;
			}
		}
		
		// Delete the last node in linkedList using pop
		public void popLastNode() {
			Node temp = head;
			if (head == null) {
				System.out.println("Linked list is empty");
			} else {
				while (temp.next != tail) {
					temp = temp.next;
				}
				temp.next = null;
				tail = temp;
			}
		}

	// Show method to display the linked list data
	public void PrintList() {
		Node temp = this.head;
		if (temp != null) {
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		} else {
			System.out.println("The list is empty.");
		}
	}
}
