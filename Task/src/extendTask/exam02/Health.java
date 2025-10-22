package extendTask.exam02;

import java.util.Scanner;

public class Health {
	char gender;
	double tall;
	double weight;
	
	Scanner scanner = new Scanner(System.in);
	
	
	Health() {
		
	}
	
	public void input() {
		System.out.print("성별(M/F) : ");
		this.gender = scanner.nextLine().charAt(0);
		System.out.print("신장(Cm) : ");
		this.tall = scanner.nextDouble();
		System.out.print("체중(Kg) : ");
		this.weight = scanner.nextDouble();
	}
	
	public void output1() {
		System.out.println();
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall + "Cm");
		System.out.println("체중 - " + weight + "Kg");
	}
}
