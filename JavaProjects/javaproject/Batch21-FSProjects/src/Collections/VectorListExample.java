package Collections;

import java.util.Scanner;
import java.util.Vector;

public class VectorListExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Vector<Character> newVectorList = new Vector<>();

        System.out.println("Enter no of elements: ");
        int n = input.nextInt();

        System.out.println("Enter Vector elements");
        for (int i = 0; i < n; i++) {
            newVectorList.add(input.next().charAt(0));
        }

        System.out.println(newVectorList);
        System.out.println(newVectorList.capacity());
        
        input.close();
	}

}
