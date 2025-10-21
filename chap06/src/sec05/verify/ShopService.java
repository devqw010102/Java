package sec05.verify;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
	
	/*
	 * SingleTon 
	 * 1. Private Construct
	 * 2. Create Object with [new] keyword (Private Static)
	 * 3. Create getInstance (return Object) (Static)
	 * 
	 * JSP 환경설정 개인 저장(보안)
	 * 메모리 절약
	 */
}
