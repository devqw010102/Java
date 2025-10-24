package sec02.verify.exam03;

public class OracleDAO implements DataAccessObject {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}

}
