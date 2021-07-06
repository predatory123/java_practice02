package book.xuexiaoxiao.study.second;

import java.util.Scanner;

/**
 * 	第二章练习
 * @author predatory
 *
 */
public class ValueTestOne {


	public static void main(String[] args) {
		TestOne();
		System.out.println("-----分割线------");
		TestTwo();
		System.out.println("-----分割线------");
		TestThree();
		
	}
	
	public static void TestOne() {
		/**
		 * @author predatory
		 *	 凯撒字母加密法
		 * 	编写一段程序，对于任何一个字母（A-Z）,给出该字母后面的第六个位置上的字母，如果超出26个字母，
		 * 	则从第一个字母（A）重新计算，以此类推，循环下去。例如：对于字母V，对应的字母为B
		 */
		
		char str = 'A';
		int value = 6;
		int key = 'A';
		str -= key;
		str += value;
		str %= 26;
		str += key;
		System.out.println(str);
		
	}
	
	public static void TestTwo() {
		/**
		 * 	写一个程序，并判断任意一个没有小数点的数，是否在byte、short、int或者long的取值范围内
		 * 	要求使用到包装内
		 * 	例如：5534这个数的检测结果：
		 * 			5534在byte的取值范围内，false
		 * 			5534在short的取值范围内，true
		 * 			5534在int的取值范围内，true
		 * 			5534在long的取值范围内，true
		 */
		
		System.out.println("请输入一个整数：");
		Scanner keys = new Scanner(System.in);
		try {
			Long wula1 = keys.nextLong();
			if(wula1 < Long.valueOf(Byte.MAX_VALUE) && wula1 > Long.valueOf(Byte.MIN_VALUE)) {
				System.out.println(wula1 + " 在Byte的取值范围内，true");
			}else {
				System.out.println(wula1 + " 在Byte的取值范围内，false");
			}
			
			if(wula1 < Long.valueOf(Short.MAX_VALUE) && wula1 > Long.valueOf(Short.MIN_VALUE)) {
				System.out.println(wula1 + " 在Short的取值范围内，true");
			}else {
				System.out.println(wula1 + " 在Short的取值范围内，false");
			}
			
			if(wula1 < Long.valueOf(Integer.MAX_VALUE) && wula1 > Long.valueOf(Integer.MIN_VALUE)) {
				System.out.println(wula1 + " 在Integer的取值范围内，true");
			}else {
				System.out.println(wula1 + " 在Integer的取值范围内，false");
			}
			
			if(wula1 < Long.MAX_VALUE && wula1 > Long.MIN_VALUE) {
				System.out.println(wula1 + " 在Long的取值范围内，true");
			}else {
				System.out.println(wula1 + " 在Long的取值范围内，false");
			}		
			
		}catch (Exception e) {
			System.out.println("输入类型错误，请输入一个整数！");
			TestTwo();
			
		}
		
	}
	
	public static void TestThree() {
		/**
		 * 	写一个程序，判断一个char变量，是否输入的是字母，大写还是小写
		 */
		char rac = 'N';
		System.out.println("判断是否字母：" + Character.isLetter(rac));
		System.out.println("判断大写：" + Character.isUpperCase(rac));	// isLowerCase()判断是否小写
		
	}
	

}
