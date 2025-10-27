package sec01.exam02;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);	// ArrayIndexOutOfBoundsException
		System.out.println("args[0] : " + data2);	// ArrayIndexOutOfBoundsException
		/*
		 * P470
		 * [Run] - [Run Configurations] 
		 * [Arguments] - [Program arguments] : `배열 인덱스` 입력
		 */
	}
}
