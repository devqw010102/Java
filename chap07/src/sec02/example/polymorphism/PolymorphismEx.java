package sec02.example.polymorphism;


class Coffee {
	int price;
	
	public Coffee(int price) {
		this.price = price;
	}
}

class Americano extends Coffee {
	public Americano() {
		super(4000);
	}
	
	@Override
	public String toString() {
		return "아메리카노";
	}
}

class CaffeLatte extends Coffee {
	public CaffeLatte() {
		super(5000);
	}
	
	@Override
	public String toString() {
		return "카페라떼";
	}
}

class Customer {
	int money = 50000;
	
	void buyCoffee(Coffee coffee) {
		if(money < coffee.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= coffee.price;
		System.out.println(coffee + "를 구매하였습니다.");
	}
}

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer me = new Customer();
		me.buyCoffee(new Americano());
		me.buyCoffee(new CaffeLatte());
		
		System.out.println("현재 잔액 : " + me.money);
	}

}
