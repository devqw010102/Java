package ArrayResult;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		int selectNo;
		
		while(run) {
			try {
				System.out.println("---------------------------------------------");
				System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금  | 4. 출금 | 5. 종료");
				System.out.println("---------------------------------------------");
				
				System.out.print("선택 > ");
				selectNo = Integer.parseInt(scanner.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("1 ~ 5 사이의 숫자만 입력할 수 있음.");
				continue;
			}
			
			if(selectNo == 1) {				// 계좌 생성
				createAccount();
			}
			else if(selectNo == 2) {		// 계좌 목록
				accountList();
			}
			else if(selectNo == 3) {		// 예금
				deposit();
			}
			else if(selectNo == 4) {		// 출금
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
			else {
				System.out.println("1 ~ 5 사이의 숫자만 입력할 수 있음.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	/// 계좌 생성
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();

		/// 중복 처리
		Account act = findAccount(ano);
		if(act != null) {
			System.out.println("결과 : 계좌 생성에 실패했습니다.(계좌번호 중복)");
			return;
		}
		
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		
		int balance = 0;
		
		try {
			System.out.print("초기 입금액 : ");
			balance = Integer.parseInt(scanner.nextLine());	
		}
		catch(NumberFormatException e) {
			System.out.println("결과 : 계좌 생성에 실패했습니다.(숫자만 입력할 수 있음)");
			return;
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("결과 : 계좌 생성에 실패했습니다.(계좌 목록 초과)");
			return;
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	/// 계좌 목록
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(Account act : accountArray) {
			if(act == null) {
				break;
			}
			System.out.println(act.getAno() + " " + act.getOwner() + " " + act.getBalance());
		}
	}
	
	/// 입금
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		Account act = findAccount(ano);
		
		if(act == null) {
			System.out.println("결과 : 예금이 실패되었습니다.(계좌 없음)");
			return;
		}
		
		int amount = 0;
		
		try {
			System.out.print("예금액 : ");
			amount = Integer.parseInt(scanner.nextLine());	
		}
		catch(NumberFormatException e) {
			System.out.println("결과 : 예금이 실패되었습니다.(숫자만 입력할 수 있음)");
			return;
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		if(amount <= 0) {
			System.out.println("결과 : 예금이 실패되었습니다.(예금액은 1원 이상)");
			return;
		}
		else {
			act.setBalance(act.getBalance() + amount);
			System.out.println("결과 : 예금이 성공되었습니다.");	
		}
	}
	
	/// 출금
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		Account act = findAccount(ano);
		
		if(act == null) {
			System.out.println("결과 : 출금이 실패되었습니다.(계좌 없음)");
			return;
		}
		
		int amount = 0;
		
		try {
			System.out.print("출금액 : ");
			amount = Integer.parseInt(scanner.nextLine());	
		}
		catch(NumberFormatException e) {
			System.out.println("결과 : 예금이 실패되었습니다.(숫자만 입력할 수 있음)");
			return;
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		if(act.getBalance() - amount < 0) {
			System.out.println("결과 : 출금이 실패되었습니다.(잔액 부족)");
			return;
		}
		else {
			act.setBalance(act.getBalance() - amount);
			System.out.println("결과 : 출금이 성공되었습니다.");	
		}
	}
	
	/// accountArray 배열에서 ano 가 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(Account act : accountArray) {
			if(act != null && act.getAno().equals(ano)) {
				return act;
			}
		}
		return null;
	}
}
