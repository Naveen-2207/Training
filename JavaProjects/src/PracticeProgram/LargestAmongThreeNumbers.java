package PracticeProgram;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		System.out.println("Largest Among Three Numbers");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter three integers: ");
		int a = nav.nextInt();
		int b = nav.nextInt();
		int c = nav.nextInt();
		if (a == b && b == c && c == a)
			System.out.println("All The num is Same: " + a + " " + b + " " + c);
		else if (a >= b && a >= c)
			System.out.println("The Largest num is: " + a);
		else if (b >= a && b >= c)
			System.out.println("The Largest num is: " + b);
		else
			System.out.println("The Largest num is: " + c);

		nav.close();
	}

}
