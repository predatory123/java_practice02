package book.xuexiaoxiao.study.first;

import java.io.IOException;

public class TestIoException {

	public static void main(String[] args ) throws IOException {
		// ʹ��ǰ��Ҫ��ֵ
		System.out.println("Hello " + args[0]);
		
		// ������(�����¼�)
		System.out.println("Wie alt bist du ?");
		int alter = System.in.read();
		System.out.println(alter);
		
	}

}
