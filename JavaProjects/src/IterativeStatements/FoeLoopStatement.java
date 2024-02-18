package IterativeStatements;

import java.util.Scanner;

public class FoeLoopStatement {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print("enter the number[positive num only]:");
		int n = obj.nextInt();
		int sum=0;
		for(int fnum=0;fnum<=n;fnum++) {
			System.out.println(fnum);
			sum+=fnum;
		}
		System.out.println("total:" + sum);
		obj.close();
	}

}
