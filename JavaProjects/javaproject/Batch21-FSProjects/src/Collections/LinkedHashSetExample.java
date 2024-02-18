package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<Integer> hashset = new LinkedHashSet<Integer>();
		System.out.println("Program using LinkedHashSet");
		hashset.add(51);
		hashset.add(43);
		hashset.add(26);
		hashset.add(41);
		hashset.add(48);
		
		System.out.println(hashset);
		
		System.out.println("Printing LinkedHashSet using enhanced for loop: ");
		for (Integer integer : hashset) {
			System.out.print(integer + " ");
		}
	}

}
