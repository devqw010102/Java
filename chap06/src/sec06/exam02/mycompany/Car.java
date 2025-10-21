package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {

	/* --- 필드 --- */
	// 기본형 필드
	
	// 참조형 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
}
