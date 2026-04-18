//Array list
//1.Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not 

package program1;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 
	//Creating an ArrayList to store colors			 
				List<String> ls = new ArrayList<>();
			//Adding elements (colors) to the ArrayList	
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				System.out.println(ls);
				if(ls.contains("red")) {
					System.out.println("available");
				}else {
					System.out.println("available not");
				}
			}

		}

 