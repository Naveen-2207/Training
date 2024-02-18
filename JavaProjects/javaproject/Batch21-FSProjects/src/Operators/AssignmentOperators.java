package Operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		// = += -= *= /= %=    ^=
		
		int sum = 10 + 5; // sum = 15
		sum += 5; // sum = sum + 5 = 15 + 5 = 20
		System.out.println(sum);
		
		int diff = 10 - 5; // diff = 5;
		diff-= 3; // diff = diff - 3 = 5 - 3 = 2
		System.out.println(diff);

		
		int mul = 10 * 5; // mul = 50
		mul *= 3; // mul = mul * 3 = 50 * 3 = 150
		System.out.println(mul);

		
		int div = 15 / 3; // div = 15 / 3 = 5
		div /= 2; // div = 5 / 2 = 2 
		System.out.println(div);

		
		int mod = 14 % 3; // mod = 14 % 3 = 2
		mod %= 2; // mod = mod % 2 = 2 % 2 = 0;
		System.out.println(mod);

		
	}
}
