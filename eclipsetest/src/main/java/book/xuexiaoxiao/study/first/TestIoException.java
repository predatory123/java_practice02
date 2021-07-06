package book.xuexiaoxiao.study.first;

import java.io.IOException;

public class TestIoException {

	public static void main(String[] args ) throws IOException {
		// 使用前需要赋值
		System.out.println("Hello " + args[0]);
		
		// 输入流(键盘事件)
		System.out.println("Wie alt bist du ?");
		int alter = System.in.read();
		System.out.println(alter);
		
	}

}
