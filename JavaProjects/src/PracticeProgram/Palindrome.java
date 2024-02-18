package PracticeProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("\nEnter the num: ");
		System.out.print("\nEnter a string: ");
		Scanner nav=new Scanner(System.in);
		 int n,r,temp,sum=0;
		 n=nav.nextInt();
		 String ch=nav.next();
		 String rev="";
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
		 if(temp==sum) 
			 System.out.println("\n" +temp+ " is palindrome");
		 else
		 System.out.println("\n" +temp+ " is not palindrome");
		 for(int i=ch.length()-1;i>=0;i--) {
			 rev=rev+ch.charAt(i);
		 }
		 System.out.println("\nReverse string is: "+rev);
		 if(ch.equals(rev)) 
			System.out.println("\n" +ch+ " is palindrome");
		 else
		 	System.out.println("\n" +ch+ " is not palindrome");
		 nav.close();

	}

}
