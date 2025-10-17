package ArrayTask;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	private static int accountNum = 0;	// 계좌생성시 Index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;		// loop flag
		
		while(run) {
		   System.out.println("---------------------------------------------");
		   System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금  | 4. 출금 | 5. 종료");
		   System.out.println("---------------------------------------------");
		   
		   System.out.print("선택> ");
		   
		   int selectNo = Integer.parseInt(scanner.nextLine());
		   
		   if(selectNo == 1) {
			   createAccount();
		   }
		   else if(selectNo == 2) {
			   accountList();
		   }
		   else if(selectNo == 3) {
			   deposit();
		   }
		   else if(selectNo == 4) {
			   withdraw();
		   }
		   else if(selectNo == 5) {
			   run = false;
		   }
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
	
		Account act = new Account(ano, owner, balance);
		
		accountArray[accountNum] = act;
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		accountNum++;
	}
	
	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(int i = 0; i < accountNum; i++) {
			System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
		}
		
		System.out.println();
		
	}
	
	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("예금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < accountNum; i++) {
			if(ano.equals(accountArray[i].getAno())) {
				accountArray[i].setBalance(accountArray[i].getBalance() + money);
				System.out.println("결과 : 예금이 성공되었습니다.");
				break;
			}
		}
		
		System.out.println();
	}
	
	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("출금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < accountNum; i++) {
			if(ano.equals(accountArray[i].getAno())) {
				accountArray[i].setBalance(accountArray[i].getBalance() - money);
				System.out.println("결과 : 출금이 성공되었습니다.");
				break;
			}
		}
	}
}
