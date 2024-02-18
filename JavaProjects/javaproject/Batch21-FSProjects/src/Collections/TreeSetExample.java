package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> hashset = new TreeSet<Integer>();
		System.out.println("Program using TreeSet");
		hashset.add(51);
		hashset.add(43);
		hashset.add(26);
		hashset.add(41);
		hashset.add(48);
		
		System.out.println(hashset);
		
		System.out.println("Printing TreeSet using enhanced for loop: ");
		for (Integer integer : hashset) {
			System.out.print(integer + " ");
		}
	}

}
