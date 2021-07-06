package book.xuexiaoxiao.study.fifth;

import book.xuexiaoxiao.study.fifth.TestCase2;
//import static book.xuexiaoxiao.study.fifth.TestCase2.eatFood   // 引入静态方法

public class TestCase1 {
	public static void main(String[] args) {
		sayHello("Tom");
		sayHello("Boss_Jake");
		
		// 引入静态方法	
		TestCase2.eatFood("milk");
//		eatFood("wahaha");
	}
	
	// 方法的基本使用
	public static void sayHello(String name) {
//		System.out.println("Hello " + name);
		if (name != null && name.startsWith("Boss")) {
			System.out.println("morning sir " + name);
			
		}else {
			System.out.println("Hello " + name);
		}
	}
}
