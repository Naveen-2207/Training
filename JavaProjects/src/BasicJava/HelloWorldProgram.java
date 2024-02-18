package BasicJava;

import java.util.Scanner;

public class HelloWorldProgram {
	public static void def(int a){
		if (a <=100 && a >= 90) {
			System.out.println("Grade:A");
		}
		else if (a <90 && a >= 80) {
			System.out.println("Grade:B");
		}
		else if (a < 80 && a >= 70) {
			System.out.println("Grade:C");
		}
		else if (a < 70 && a >= 60) {
			System.out.println("Grade:E");
		}
		else if(a<60&& a>=0) {
			System.out.println("Fail");
		}
		else {
			System.err.println("enter a correct mark");
		}
	} 

	public static void main(String[] args) {
		Scanner nav = new Scanner(System.in);
		int a=nav.nextInt();
		def(a);
		nav.close();

//		int min, a = 10, b = 11, c = 5, d=10;
//		System.out.println(a < b && a < c);
//		System.out.println(a < b || a < c);
//		System.out.println(a < b & a < c);
//		System.out.println(40 | 25);
//		min =((a < c)? ((a<c)?a:c):((a<b)?a:b));
//		System.out.println(min);
//		System.out.println(5^6);
//		System.out.println(~-5);//-(val+1)

	}

}
