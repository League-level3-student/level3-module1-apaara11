package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		
ArrayList<String> names = new ArrayList<>();
		//   Don't forget to import the ArrayList class

		//2. Add five Strings to your list
		names.add("Mink");
		names.add("Vandana");
		names.add("Par Par");
		names.add("Bani");
		names.add("Armaanu");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<names.size(); i++) {
			String s = names.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String n: names) {
			System.out.println(n);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i<names.size(); i+=2) {
			System.out.println(names.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i=names.size()-1;i>=0; i--) {
			System.out.println(names.get(i));
		}
		//7. Print only the Strings that have the letter 'n' in them.
		for(int i = 0; i<names.size(); i++) {
			
				
			}
		}
	}

