package book.xuexiaoxiao.study.fifth;

import book.xuexiaoxiao.study.fifth.Buch;
public class BuchMesse {
	public static void main(String[] args) {
		Buch buch = new Buch();
		buch.setTitel("西游记");
		buch.setAutor("吴承恩");
		buch.setSeitenanzhl(9527);
		buch.setGebunden(true);
		buch.readBook();
		System.out.println("这本书一共：" + buch.getSeitenanzhl() + "页，精装不：" + buch.isGebunden());
	}
}

