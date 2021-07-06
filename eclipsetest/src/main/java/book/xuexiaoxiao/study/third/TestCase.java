package book.xuexiaoxiao.study.third;

import org.omg.CORBA.portable.ValueBase;

/**
 * 	编写一个程序，等待用户提交一个开始参数，
 * 		1.并检测输入的参数是否可以被7整除，
 * 		2.加入，可以被13整除
 * 		3.被7整除，不能被13整除，加入  布尔运算符  && || 
 * 	如果没有开始参数，则输出一个错误信息。
 */

public class TestCase {
	
	public static void main(String[] args) {	
		if(args.length > 0) {
			// 判断是否有提交参数，需要在 run configurations 中设置参数
			String parmameter = args[0];	
			int result = Integer.valueOf(parmameter);
			if (result % 7 == 0 || result % 13 == 0) {
				System.out.println(result + " 可以被整除");
			}
//			else if (result % 13 == 0) {
//				System.out.println(result + " 可以被13整除");
//			}
			else {
				System.out.println(result + " 不能被整除");
			}
		}else {
			System.out.println("没有提交参数");
		}
		
		testOne();
	}
	
	public static void testOne() {
		// 使用 switch...case ,不能超出取值范围
		int eingable = 256;
		final byte eingableByte = 2;
		final char eingableChar = 'c';
		final short eingableShort = 500;
		switch (eingable) {
			case eingableByte:
				System.out.println("1");
			case eingableChar:
				System.out.println("2");
			case eingableShort:
				System.out.println("3");
			break;

		default:
			break;
		}
	}

}
