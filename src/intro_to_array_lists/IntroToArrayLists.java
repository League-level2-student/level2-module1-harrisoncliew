package intro_to_array_lists;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		// 2. Add five Strings to your list
		array.add("Bob");
		array.add("Sue");
		array.add("Jan");
		array.add("Guest 3");
		array.add("Mr. Mo");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		// 4. Print all the Strings using a for-each loop
		for (String m : array) {
			System.out.println(m);
		}
		// 5. Print only the even numbered elements in the list.
		for (int o = 0; o < array.size(); o += 2) {
			String l = array.get(o);
			System.out.println(l);
		}
		// 6. Print all the Strings in reverse order.
		for (int j = array.size() - 1; j >= 0; j--) {
			String l = array.get(j);
			System.out.println(l);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int m = 0; m < array.size(); m++) {
			String o = array.get(m);
			if (o.contains("e")) {
				System.out.println(o);
			}

		}
	}
}
