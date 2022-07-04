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
int size;

	
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
		
		// Search node in linked list
		public void search(int data) {
			Node temp = head;
			int index = 0;
			if (head == null) {
				System.out.println("Linked List is empty");
			} else {
				while (temp != null) {
					index++;
					if (temp.data == data) {
						System.out.println("Node is present at " + index + " position");
						break;
					} else {
						temp = temp.next;
					}
				}
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
		
		// Method is used to insert after the node in linked list
		public void insertAfter(int insertAfter, int insertData) {
			Node temp = head;
			Node insertNode = new Node(insertData);
			if (head == null) {
				System.out.println("Linked List is empty");
			} else {
				while (temp != null) {
					if (temp.data == insertAfter) {
						Node node = temp.next;
						temp.next = insertNode;
						insertNode.next = node;
						temp = node;
					} else {
						temp = temp.next;
					}
				}
			}
		}
		
		// Delete the node in linked list
		public void deleteNode(int key) {
			if (head == null) {
				System.out.println("Linked List is empty");
			} else {
				Node temp = head;
				if (head.data == key) {
					head = head.next;
					size--;
				}
				while (temp != null && temp.next != null) {
					if (temp.next.data == key) {
						temp.next = temp.next.next;
						size--;
					}
					temp = temp.next;
				}
			}
		}

		// Check length of node
		public void size() {
			int size = 0;
			Node current = head;
			if (head == null) {
				System.out.println("Size is 0");
			}
			current = head;
			size = 1;
			while (current.next != null) {
				current = current.next;
				size++;
			}
			System.out.println("Size of the linkedList: "+size);
		}
		
		// Node sorting
		public void sort() {
			Node current = head, index = null;
			int temp;

			if (head == null) {
				return;
			} else {
				while (current != null) {
					index = current.next; // Node index will point to node next to current
					while (index != null) {
						// If current node data is greater than index node data, swap the data between
						// them
						if (current.data > index.data) {
							temp = current.data;
							current.data = index.data;
							index.data = temp;
						}
						index = index.next;
					}
					current = current.next;
				}
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
