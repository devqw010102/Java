package chap08.sec01.exam05;

import chap08.sec01.exam03.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		
		Searchable searchable = tv;
		searchable.search("Test");
		
	}

}
