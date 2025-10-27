package sec01.verify.exam05;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		///                           구현 객체
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}
