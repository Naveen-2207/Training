package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(51);
		treeSet.add(41);
		treeSet.add(75);
		treeSet.add(35);
		treeSet.add(25);
		System.out.println(treeSet);
		System.out.println("Printing hash set using enhanced for loop: ");
		for (Integer integer : treeSet) {
			System.out.println(integer+ " ");
		}
		

	}

}
