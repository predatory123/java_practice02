package book.xuexiaoxiao.study.fifth;

import book.xuexiaoxiao.study.fifth.Buch;
public class BuchMesse {
	public static void main(String[] args) {
		Buch buch = new Buch();
		buch.setTitel("���μ�");
		buch.setAutor("��ж�");
		buch.setSeitenanzhl(9527);
		buch.setGebunden(true);
		buch.readBook();
		System.out.println("�Ȿ��һ����" + buch.getSeitenanzhl() + "ҳ����װ����" + buch.isGebunden());
	}
}

