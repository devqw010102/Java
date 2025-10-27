package sec01.verify.exam05;

public class CheckBox {
	OnSelectListener listener;	// 인스턴스 타입 필드
	
	///                      구현 객체를 받기 위한 인스턴스 타입 매개변수 
	void setOnSelectListener(OnSelectListener listener) {		// setter
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	
	static interface OnSelectListener {
		void onSelect();
	}
}
