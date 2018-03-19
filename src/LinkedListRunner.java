//LinkedListRunner main class 
import java.util.*;
public class LinkedListRunner {
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<>();
		//addition of strings to list
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		list.add("hhh");
		list.add("iii");
		//iterator declared
		ListIterator<String> iter = list.listIterator();
	
		System.out.println("First pass through(hasNext)");
		//while loop to print out initial list of strings
		while (iter.hasNext()){
			String name = (String) iter.next();
			System.out.println(name);
		}
		System.out.println("Second pass through(hasPrevious)");
		//while loop to print out list backwards, while removing vowels
		while (iter.hasPrevious()){
			String name = (String) iter.previous();
			System.out.println(name);
			if(name.substring(0,1).equals("a") || name.substring(0,1).equals("e") || name.substring(0,1).equals("i") 
					|| name.substring(0,1).equals("o") || name.substring(0,1).equals("u")){
				iter.remove();
			}
		}
		System.out.println("Final pass through(hasNext)");
		//while loop to print out list forwards again
		while (iter.hasNext()){
			String name = (String) iter.next();
			System.out.println(name);
		}
	}
}
