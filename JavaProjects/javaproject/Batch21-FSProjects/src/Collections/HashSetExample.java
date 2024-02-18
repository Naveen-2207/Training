package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Integer> hashset = new HashSet<Integer>();
//		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
//		Set<Integer> treeSet = new TreeSet<Integer>();
		System.out.println("Program using HashSet");
		hashset.add(51);
		hashset.add(43);
		hashset.add(26);
		hashset.add(41);
		hashset.add(48);
		hashset.add(51);  // added duplicate value
		hashset.add(43);  // added duplicate value
		System.out.println(hashset);
		
		System.out.println("Printing hashset using enhanced for loop: ");
		for (Integer integer : hashset) {
			System.out.print(integer + " ");
		}

	}

}
