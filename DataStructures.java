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
		Operations myLinkedList1 = new Operations();
		Operations myLinkedList2 = new Operations();
		Operations myLinkedList3 = new Operations();
		Operations myLinkedList4 = new Operations();
		
		System.out.println("<------------Add node in start----------->");
		myLinkedList.addNode(70);
		myLinkedList.addNode(30);
		myLinkedList.addNode(56);
		myLinkedList.PrintList();

		System.out.println("<------------Add node in last----------->");
		myLinkedList1.append(56);
		myLinkedList1.append(30);
		myLinkedList1.append(70);
		myLinkedList1.PrintList();
		
		System.out.println("<------------Insert between two nodes----------->");
		myLinkedList2.insert(56);
		myLinkedList2.insert(70);
		myLinkedList2.insertBetweenNode(56, 70, 30);
		myLinkedList2.PrintList();
		
		System.out.println("<------------Delete first node----------->");
		myLinkedList3.insert(56);
		myLinkedList3.insert(30);
		myLinkedList3.insert(70);
		myLinkedList3.PrintList();
		System.out.println("After removing first node: ");
		myLinkedList3.pop();
		myLinkedList3.PrintList();
		
		System.out.println("<------------Delete last node----------->");
		myLinkedList4.insert(56);
		myLinkedList4.insert(30);
		myLinkedList4.insert(70);
		myLinkedList4.PrintList();
		System.out.println("After removing last node: ");
		myLinkedList4.popLastNode();
		myLinkedList4.PrintList();
	}
}
