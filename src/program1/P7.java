//Linked list
//2. Write a Java program to iterate a linked list in reverse order (usingobjlist.descendingIterator())
package program1;
import java.util.Iterator;
import java.util.LinkedList;
 
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				LinkedList<String>	ls = new LinkedList<>();
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				ls.add("Blue");
//				ListIterator<String> listIterator = ls.listIterator(ls.size());
//		        while (listIterator.hasPrevious()) {
//		            System.out.println(listIterator.previous());
//		        }
				Iterator iterator =  ls.descendingIterator();
				System.out.println("linkedlist elements in the reverse order");
				while (iterator.hasNext()) {
					 
					System.out.println(iterator.next());
					}
			}

		}
	 
 