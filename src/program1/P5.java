//Array List
//5. Write a java program for getting different colors through ArrayList interface and deletenth element from the ArrayList object by using remove by index
package program1;
import java.util.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
				List<String> ls = new ArrayList<>();
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				ls.add("Blue");
			 
				String Str="green";
				System.out.println("Original list is :"+ls);
				System.out.println("Removing the nth Element:"+ls.remove(Str));
				System.out.println(ls);
			}

		}
 