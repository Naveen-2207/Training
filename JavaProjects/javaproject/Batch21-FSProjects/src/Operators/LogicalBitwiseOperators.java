package Operators;

public class LogicalBitwiseOperators {

	public static void main(String[] args) {

		int a = 10, b = 11, c = 5;
		
		//logical && bitwise &
		System.out.println(b<a && a++<c); // false
		System.out.println(a); // 10
		System.out.println(b<a & a++<c); // false 
		System.out.println(a); // 11
		
		a = 10;
		b = 11;
		c = 5;
		//logical || bitwise |
		System.out.println(a<b || a++<c); // true
		System.out.println(a); // 10
		System.out.println(a<b | a++<c); // true  
		System.out.println(a); // 11
		
		System.out.println(5|4);
		// 5 | 4 = 
		// 101 
		// 100
		// 101 = 5
		System.out.println(5&4);
		// 5 & 4 = 
		// 101 
		// 100
		// 100 = 4
		
		int val = 5 | 4;
		System.out.println(val); // 5
		
		val = 5 & 4;
		System.out.println(val); // 4
		
		val = 6^4;
		// 00 0
		// 10 1
		// 01 1
		// 11 0
		// 6  -> 110
		// 4  -> 100
		// 6^4 -> 010 = 2
		System.out.println(val);
		
		// -(n+1);
		System.out.println(~5); // -6
		System.out.println(~-5); // 4

	}

}
