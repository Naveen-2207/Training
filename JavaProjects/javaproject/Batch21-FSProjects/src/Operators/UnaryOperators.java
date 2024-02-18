package Operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int a = 15;
		System.out.println(a++); // 15 memory - 16
		System.out.println(++a); // 17 memory - 17
		System.out.println(a--); // 17 memory - 16
		System.out.println(--a); // 15 memory - 15
		
		// a= 15 memory - 16, 15, 14, 15

		System.out.println(a++ + --a - a-- + ++a); // 15 + 15 - 15 + 15 = 30-0=30

		// a=15 memory -16 , 15, 14, 13, 12, 13 , 14, 15
		System.out.println(a++ - --a + a-- + a + --a - a-- + ++a - a++ + a++); 
		// 15 - 15 + 15 + 14 + 13 - 13 + 13 - 13 + 14 = 43
		
		int b = -13;
		System.out.println(-b);
		
		boolean flag = true;
		
		System.out.println(!flag);
		
		int c = 5;
		
		System.out.println(!(c==3));

	}
}
