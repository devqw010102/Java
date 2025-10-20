package sec04.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("Gas가 없습니다.");
			return false;
		}
		System.out.println("Gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(Gas잔량 : " + gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다..(Gas잔량 : " + gas + ")");
				return;
			}
		}
	}
}
