package Collections;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Integer> linkedHashset = new LinkedHashSet<Integer>();
		linkedHashset.add(51);
		linkedHashset.add(41);
		linkedHashset.add(75);
		linkedHashset.add(35);
		linkedHashset.add(25);
		System.out.println(linkedHashset);
		System.out.println("Printing hash set using enhanced for loop: ");
		for (Integer integer : linkedHashset) {
			System.out.println(integer+ " ");
		}

	}

}
