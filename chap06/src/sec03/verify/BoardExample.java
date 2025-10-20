package sec03.verify;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board1 = new Board("타이틀", "컨텐츠");
		Board board2 = new Board("타이틀", "컨텐츠", "작성자");
		Board board3 = new Board("타이틀", "컨텐츠", "작성자", "날짜");
		Board board4 = new Board("타이틀", "컨텐츠", "작성자", "날짜", 10);
		
		System.out.println(board1.title);
		System.out.println(board2.writer);
		System.out.println(board3.date);
		System.out.println(board4.hitcount);
	}

}
