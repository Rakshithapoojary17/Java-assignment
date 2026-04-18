//Linked list
//3. Write a Java program to insert the specified element at the end of a linked list.( usingl_listobj.offerLast("Pink"))

package program1;
import java.util.*;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

				LinkedList<String> ls = new LinkedList<>();
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				ls.add("Blue");
				System.out.println("Before insertion:"+ls);
				ls.addLast("pink");
				System.out.println("After insertion:"+ls);
			
			}

		}
	 