package ArrayProgram;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner nav = new Scanner(System.in);
		int size = nav.nextInt();
		System.out.println("Enter the matrix value: ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
					System.out.print("*");
			}
			System.out.println();
			nav.close();
		}

	}

}
