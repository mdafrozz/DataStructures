/**
 * 
 */
package java_generics;

/**
 * @author MD_AFROZ
 *
 */
//create a simple Linked List of 56, 30 and 70
public class DataStructures {
	public static void main(String[] args) {
		System.out.println("**************Data STructures*************");
		
		Operations myLinkedList = new Operations();
		myLinkedList.addNode(56);
		myLinkedList.addNode(30);
		myLinkedList.addNode(70);
		myLinkedList.PrintList();

	}
}
