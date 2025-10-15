package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopQ: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break loopQ;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
