/**
 * 
 */
package java_generics;

import java.util.LinkedList;

/**
 * @author MD_AFROZ
 *
 */
public class DataStructures {
	public static void main(String[] args) {
		System.out.println("**************Data STructures*************");
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(30);
		list.add(76);
		
		System.out.println("LinkedList is : " + list);

	}
}
