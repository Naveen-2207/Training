package PatternPrograms;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}


// Input: 5
// Output:
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 