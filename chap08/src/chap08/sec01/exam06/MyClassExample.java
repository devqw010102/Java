package chap08.sec01.exam06;

import chap08.sec01.exam04.Audio;
import chap08.sec01.exam04.Television;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)====================");
		
		MyClass myClass1 = new MyClass();		// MyClass.class 의 기본 생성자
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)====================");
		
		MyClass myClass2 = new MyClass(new Audio());		// MyClass.class 의 매개변수 1개인 생성자
		System.out.println(myClass2.getClass());
		
		System.out.println("3)====================");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)====================");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
