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
	
	public Operations() {
		head = null;
	}
	
	public void addNode(int newVal) {
		Node newNode = new Node();
		newNode.data = newVal;
		newNode.nextNode = null;
		
		if(head == null) {
			head = newNode;
		}else {
			Node temp = new Node();
			temp = head;
			while (temp.nextNode != null)
				temp = temp.nextNode;
			temp.nextNode = newNode;
		}
	}
	
	public void PrintList() {
		Node temp = new Node();
		temp = this.head;
		if (temp != null) {
			System.out.print("Linked List have: ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
			System.out.println();
		} else {
			System.out.println("The list is empty.");
		}
	}
}
