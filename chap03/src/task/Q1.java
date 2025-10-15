package task;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A';	// 'A' 의 문자코드는 65
		
		System.out.println(1 + x << 33);
		/*
		 * 1 byte = 8 bit
		 * 2진법 11 에서 비트연산 << 1번하면 = 110 = 10진법  6
		 * << 연산 : 2진법상 지수가 하나 증가 == 곱하기 2
		 * >> 연산 : 2진법상 지수가 하나 감소 == 나누기 2
		 */
		System.out.println(y >= 5 || x < 0 && x > 2);
		/*
		 * (true || false && false) => and 가 연산 순위 더 높음
		 * (true || false) => true
		 */
		System.out.println(y += 10 - x++);
		/*
		 * 연산 순서 : 단항 -> 이항 -> 다항
		 */
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
	}

}
