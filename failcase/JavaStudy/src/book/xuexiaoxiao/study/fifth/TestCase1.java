package book.xuexiaoxiao.study.fifth;

import book.xuexiaoxiao.study.fifth.TestCase2;
//import static book.xuexiaoxiao.study.fifth.TestCase2.eatFood   // ���뾲̬����

public class TestCase1 {
	public static void main(String[] args) {
		sayHello("Tom");
		sayHello("Boss_Jake");
		
		// ���뾲̬����	
		TestCase2.eatFood("milk");
//		eatFood("wahaha");
	}
	
	// �����Ļ���ʹ��
	public static void sayHello(String name) {
//		System.out.println("Hello " + name);
		if (name != null && name.startsWith("Boss")) {
			System.out.println("morning sir " + name);
			
		}else {
			System.out.println("Hello " + name);
		}
	}
}
