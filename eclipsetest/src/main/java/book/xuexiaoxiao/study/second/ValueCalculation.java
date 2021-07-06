package book.xuexiaoxiao.study.second;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValueCalculation {

	public static void main(String[] args) {
		// 数据计算
		int a = 10;
		int b = 20;
		int c = a + b;
		int e = 10,f = 10;
		System.out.println(c+e+f);
		
		String  tom = "ac", bob = "HAHAH";
		String alice = tom + bob;
		System.out.println(alice);
		
		// 小数精确计算
		BigDecimal zehe = new BigDecimal("10");	// 参数为字符串类型
		BigDecimal zeh = new BigDecimal("3"); 
		BigDecimal ze = zehe.divide(zeh, 16, RoundingMode.HALF_UP); // 第二个参数 “16” 设置保留小数位数
		System.out.println(ze);
		
		// 自增和自减语句
		int wow = 10;
		System.out.println(wow++);	// 10  赋值后为11
		System.out.println(++wow); // 12 实际为11+1 
		System.out.println(wow--); // 12  计算后为11
		System.out.println(--wow);	// 10 
		
		System.out.println(" ----------分割线 ------------");
		valueSort();
		 
	}
	
	public static void valueSort() {
		int zal1 = 7;
		
//		// 使输出的结果为49,7,9,81,80,80,8,8
//			System.out.println(zal1*zal1);
//			System.out.println(zal1++);
//			System.out.println(++zal1);
//			System.out.println(zal1 = zal1*zal1);
//			System.out.println(--zal1);
//			System.out.println(zal1--);
//			System.out.println(zal1 = (zal1-9)/8);
//			System.out.println(zal1);
		
		// 调整语句的顺序，使输出的结果为8,8,81,81,9,9,7,7
		System.out.println(++zal1);
		System.out.println(zal1++);
		System.out.println(zal1*zal1);
		System.out.println(zal1 = zal1*zal1);
		System.out.println(zal1 = (zal1-9)/8);
		System.out.println(zal1--);
		System.out.println(--zal1) ;
		System.out.println(zal1);
		
	}

}
