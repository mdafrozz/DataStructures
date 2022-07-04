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
