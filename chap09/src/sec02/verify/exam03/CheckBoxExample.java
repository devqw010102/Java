package sec02.verify.exam03;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			@Override
			public void onSelect() {
				// TODO Auto-generated method stub
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBox.select();
	}
}
