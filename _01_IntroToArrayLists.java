package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> s = new ArrayList<String>();
		//2. Add five Strings to your list
		s.add("hi");
		s.add("bye");
		s.add("sup");
		s.add("up");
		s.add("down");

		//3. Print all the Strings using a standard for-loop
		for (int i = 0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		for(String g : s){
			System.out.println(g);
		}
		System.out.println("\n");
	System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
	
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
