package IterativeStatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		 System.out.println("enter a num:");
		 int m =obj.nextInt();
		 int fnum=1,total=0;
		 do{
			 total+=fnum;
			 System.out.println(fnum++);
		 }
		 while(fnum<=m); 
		 System.out.println(total);

	}

}
