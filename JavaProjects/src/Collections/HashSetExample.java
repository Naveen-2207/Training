package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashset = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		hashSet.add(51);
		hashSet.add(41);
		hashSet.add(75);
		hashSet.add(35);
		hashSet.add(25);
		System.out.println(hashSet);
		System.out.println("Printing hash set using enhanced for loop: ");
		for (Integer integer : hashSet) {
			System.out.println(integer+ " ");
		}
		
	}

}
