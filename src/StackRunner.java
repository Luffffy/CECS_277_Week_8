import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class StackRunner
{
	public static void main(String[] args)
	{
		
		LinkedList<String> myLinkedList1 = new LinkedList<String>();
		myLinkedList1.add("aaa");
		myLinkedList1.add("bbb");
		myLinkedList1.add("ccc");
		myLinkedList1.add("ddd");
		myLinkedList1.add("eee");
		// print the first linked list
		System.out.println("My Linked List 1:");
		System.out.println(myLinkedList1);

		Stack<String> myStack = new Stack<String>();
		//Iterate through elements in the linked list (don't remove them), but
		// push all the elements onto the stack
		ListIterator<String> iter = myLinkedList1.listIterator();
		while (iter.hasNext()){
			myStack.push(iter.next());
		}


		//Pop all the stack elements off the stack and add them to
		// a new linked list
		LinkedList<String> myLinkedList2 = new LinkedList<String>();
		while(!myStack.empty()) {
			String word = myStack.pop();
			myLinkedList2.add(word);
		}

		//print the second linked list

		System.out.println("My LinkedList 2:");
		System.out.print(myLinkedList2);
		
	}

}
