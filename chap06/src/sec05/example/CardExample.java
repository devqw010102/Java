package sec05.example;

public class CardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Static Member 는 new 키워드 없이 접근 가능
		// 클래스명.정적멤버
		Card.width = 63;
		Card.height = 89;
		
		Card card1 = new Card();
		
//		card1.width = 63; 
//		card1.height = 89;
		
		card1.color = "black";
		card1.shape = "clover";
		card1.number = "A";
		
		Card card2 = new Card();
		
//		card2.width = 63;
//		card2.height = 89;
		
		card2.color = "red";
		card2.shape = "heart";
		card2.number = "A";
		
		System.out.println("카드1의 크기는 : " + card1.width + " X " + card1.height + " 입니다.");
		System.out.println("카드1의 색상은 " + card1.color + "이고, 모양은 " + card1.shape + "이며, 숫자는 " + card1.number + " 입니다.");
		System.out.println("카드2의 크기는 : " + card2.width + " X " + card2.height + " 입니다.");
		System.out.println("카드2의 색상은 " + card2.color + "이고, 모양은 " + card2.shape + "이며, 숫자는 " + card2.number + " 입니다.");
		
		
//		card2.width = 100;			// width, height 가 static => card1 도 같이 수정됨
//		card2.height = 200;
		
		System.out.println("카드1의 크기는 : " + card1.width + " X " + card1.height + " 입니다.");
		System.out.println("카드1의 색상은 " + card1.color + "이고, 모양은 " + card1.shape + "이며, 숫자는 " + card1.number + " 입니다.");
		System.out.println("카드2의 크기는 : " + card2.width + " X " + card2.height + " 입니다.");
		System.out.println("카드2의 색상은 " + card2.color + "이고, 모양은 " + card2.shape + "이며, 숫자는 " + card2.number + " 입니다.");
	}	

}
