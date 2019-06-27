package intro_to_array_lists;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("Guest 1");
		array.add("Guest 2");
		array.add("Guest 3");
		array.add("Guest 4");
		array.add("Guest 5");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String m : array) {
			System.out.println(m);
		}
		//5. Print only the even numbered elements in the list.
		for (int o = 0; o < args.length; o+=2) {
			String l = array.get(o);
			System.out.println(l);
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
