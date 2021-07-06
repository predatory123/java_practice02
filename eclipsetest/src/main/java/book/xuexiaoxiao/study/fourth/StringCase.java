package book.xuexiaoxiao.study.fourth;

/**
 * 	字符串介绍
 */
import java.util.Arrays;

public class StringCase {

	public static void main(String[] args) {
		// 创建字符串的4种方式
		String case1 = new String("java");
		String case2 = "java";
		char[] case3 = {'j','a','v','a'};
		String case30 = new String(case3);
		String case4 = "ja" + "va";
		System.out.println(case1 + case2 + case30 + case4);
		
		//使用 charAt() 访问字符串中的字符
		String case5 = "hello world";
		System.out.println(case5.charAt(6));	
		
		/** 
		 * 获取字符串的长度，需要注意字符长度越界问题
		 */
//		System.out.println(case5.charAt(case5.length()));  // 错误写法
		System.out.println(case5.charAt(case5.length()-1)); // 获取最后一个字母
		System.out.println(case5.length());
		
		/**
		 * 字符串拆分
		 */
		String genger = "efsefsdfsgtfhherytyqwwr ioqwcmsngnoqiwrhov";
		System.out.println(genger.substring(15));	// 从指定位置拆分，substring()返回字符串
		System.out.println(genger.substring(15, 20));	// 从指定长度拆分
		
		String[] frucht = genger.split("e");	// 指定字符拆分,返回字符串数组
		System.out.println(Arrays.toString(frucht));	
		
		/**
		 * 	字符和字符串的运算
		 */
		System.out.println(12 + "12");	// 数字和字符串不能直接相加，结果是拼接
		System.out.println("12" + 12);
		System.out.println("test".concat("hahaha"));
		
		int falsc = 15;
		int flasssss = 20;
//		System.out.println(falsc +"-" + flasssss + "ist" + flasssss - falsc);	// 错误写法
		System.out.println(falsc +"-" + flasssss + "ist" + (flasssss - falsc));
		
		// 查找指定的字符串
		System.out.println("hello world".contains("hello"));
		
		// 字符串替换
		System.out.println("hello world".replace("world", "java"));
		
	}

} 
