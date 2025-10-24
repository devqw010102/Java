package sec02.verify.exam04;

public class Controller {
	public MemberService service;
	
	public void setSerivce(MemberService service) {
		this.service = service;
	}
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
		/// 1
//		c.setService(new Service());
		/// 2
		c.setSerivce(new MemberService());
		/// 3
		c.setSerivce(new AService());
		/// 4
		c.setSerivce(new BService());
		/// 5
//		c.setSerivce(new BoardService());
		/// 6
//		c.setSerivce(new DService());
		
		/// 1-2
		Service s = new MemberService();		// 자동 변환			
		c.setSerivce((MemberService) s);		// 강제 변환
		
	}
}
