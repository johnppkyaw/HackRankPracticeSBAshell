package studyguide1;
import java.util.Collections;
import java.util.LinkedList;

//The ArrayToLinkedList class should implement the interface MyLinkList.
public class ArrayToLinkedList implements MyLinkList{
	// It should have one class variable of type LinkedList<String>, arrayToList.
	LinkedList<String> arrayToList;

	// ArrayToLinkedList( ): initializes the empty list arrayToList
	ArrayToLinkedList() {
		arrayToList = new LinkedList<>();
	}

	@Override
	public void convert(String[] a) {
		// TODO Auto-generated method stub
		// void convert(String[] a):  adds the strings in the array a, to the
        // linkedlist arrayToList. Also prints "I have added the string: {string} at
		//the node: {index}". For example if the string "abcd" is added at the node 0,
		//it should print "I have added the string: abcd at node: 0".
		for(int i = 0; i < a.length; i++) {
			String currString = a[i];
			arrayToList.add(currString);
			System.out.println("I have added the string: " + currString +
					" at the node: " + i);
		}
	}

	@Override
	public void replace(int idx) {
		// TODO Auto-generated method stub
		//     replaces the string at the node idx of arrayToList,
		//     with an empty string. Also prints "I have replaced the string:
		//     {string} with a null string". For example if the string "abcd" is replaced
		//     with the empty string, it should print
		//     "I have replaced the string: abcd with a null string".
		String prevString = arrayToList.get(idx);
		arrayToList.set(idx, null);
		System.out.println("I have replaced the string: " + prevString + " with a null string");

	}

	@Override
	public LinkedList<String> compact() {
		// TODO Auto-generated method stub
		// It should remove all the empty string from
		// the linked list and return the resulting list.
		arrayToList.remove(null);
		return arrayToList;
	}

	@Override
	public void displayList() {
		//Original Linked List Order
		//0 element=abcd
		//1 element=1234
		// TODO Auto-generated method stub
		System.out.println("Original Linked List Order");
		for(int i = 0; i < arrayToList.size(); i++) {
			System.out.println(i + " element=" + arrayToList.get(i));
		}
	}

	@Override
	public void reverseLinkedList() {
		// TODO Auto-generated method stub
		//     public void reverseLinkedList():  will create a new linked list with contents
		//     of the original linked list reversed.
        //	Reversed Linked List Order
		//  0 element=1234
		//  1 element=abcd
		LinkedList<String> reversedList = new LinkedList<>(arrayToList);
		Collections.reverse(reversedList);
		System.out.println("Reversed Linked List Order");
		for(int i = 0; i < reversedList.size(); i++) {
			System.out.println(i + " element=" + reversedList.get(i));
		}
	}
	
  


}