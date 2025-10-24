package sec02.verify.exam05;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		
		c.setService(new MemberService());
		c.service.login();					// MemberSerivce.login()
		
		c.setService(new AService());		// AService.login()
		c.service.login();
	}

}
