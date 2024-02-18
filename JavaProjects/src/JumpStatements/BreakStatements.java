package JumpStatements;

import java.util.Scanner;

public class BreakStatements {

	public static void main(String[] args) {
		System.out.println("Enter a num: ");
		Scanner nav = new Scanner(System.in);
		int a = nav.nextInt();
		int i=1;
//		while(a<=10) {
//			System.out.println(a);
//			a++;
//			if(a==5) {
//				break;}
//		}
//		System.out.println(a);
		while(true) {
			System.out.println(i);
			if(i==a/2) {
				break;
			}
			i++;
		}
		System.out.println(i);
		nav.close();

	}

}
