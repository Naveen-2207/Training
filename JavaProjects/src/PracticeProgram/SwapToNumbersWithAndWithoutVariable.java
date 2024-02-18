package PracticeProgram;

import java.util.Scanner;

public class SwapToNumbersWithAndWithoutVariable {

	public static void main(String[] args) {
		System.out.println("SWAPING TWO NUMBERS WITH AND WITHOUT VARIABLES");
		 System.out.print("\nEnter two numbers: ");
		 Scanner nav=new Scanner(System.in);
		 int a = nav.nextInt();
		 int b = nav.nextInt();
		 System.out.println("The before swaping number are: "+a+" "+b);
		 int c=a;
		 a=b;
		 b=c;
		 System.out.println("The Using with variable after swaping number are: "+a+" "+b);
		 a+=b;
		 b=a-b;
		 a-=b;
		 System.out.println("The after swaping number are: "+a+" "+b);
		 a*=b;
		 b=a/b;
		 a/=b;
		 System.out.println("The after swaping number are: "+a+" "+b);
		 a^=b;
		 b=a^b;
		 a^=b;
		 System.out.println("The after swaping number are: "+a+" "+b);
		 b=a+b-(a=b);
		 System.out.println("The after swaping number are: "+a+" "+b);
		 int[]res=new int[] {a,b};
		 a=res[1];
		 b=res[0];
		 System.out.println("The after swaping number are: "+a+" "+b);
		 nav.close();
	}

}
