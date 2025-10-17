package sec01.exam01;

public class Board {
	public static void main(String args[]) {
		Reply reply = new Reply();	// 게시판(Board) 객체와 댓글(Reply) 객체 집합관계
		reply.replyWrite();			// 메소드 호출, 사용관계
	}
}

class Reply {
	// Make reply method
	void replyWrite() {
		System.out.println("Make reply.");
	}
}

class Notice extends Board {		// 게시판(Board) 객체와 공지사항(Notice) 객체간 상속관계
	
}

class Free extends Board {			// 게시판(Board) 객체와 자유(Free) 객체간 상속관계
	
}

class Qna extends Board {			// 게시판(Board) 객체와 Q&A(Qna) 객체간 상속관계
	
}