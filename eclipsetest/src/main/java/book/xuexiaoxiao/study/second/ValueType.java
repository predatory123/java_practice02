package book.xuexiaoxiao.study.second;

public class ValueType {
	// 8大数据基本类型
	public static void main(String[] args) {
		byte v1 = 12;
		System.out.println("Byte: " + v1);
		
		short v2 = 23456;
		System.out.println("Short: " + v2);
		
		int v3 = 134434;
		System.out.println("Int: " + v3);
		
		long v4 = 423543543l;
		System.out.println("Long: " + v4);

		double v5 = 23.34;
		System.out.println("Double: " + v5);

		float v6 = 324.23f;
		System.out.println("Float: " + v6);

		boolean v7 = true;
		System.out.println("Boolean: " + v7);
		
		char v8 = 888; 		// 打印字节码
		System.out.println("Char: " + v8);
		System.out.println("------分割线------");
		
		/* 
		 * 将365 转换为2进制、8进制、10进制、16进制
		 */
		int va1 = 0555;
		System.out.println("365 8进制 -- > " + Integer.toOctalString(365));
		
		int va2 = 0B101101101;
		System.out.println("365 2进制 -- > " + Integer.toBinaryString(365));

		int va3 = 365;
		System.out.println("365 10进制 -- > " + 365);

		int va4 = 0X16D;
		System.out.println("365 16进制 -- > " + Integer.toHexString(365));
		
		System.out.println("------分割线------");
		// 将735535进行进制转换
		System.out.println("735535 2进制 "  + Integer.toBinaryString(735535));
		System.out.println("735535 8进制 " +  Integer.toOctalString(735535));
		System.out.println("735535 10进制 "  + 735535);
		System.out.println("735535 16进制 " + Integer.toHexString(735535));
		
		// 布尔值计算
		boolean a1 = true;
		boolean b1 = false;
		boolean c1 = !b1;	// 取反
		System.out.println(c1);

		c1 = a1 & b1;	// 逻辑与（位与），两个都为真，结果为真
		System.out.println(c1);
		
		c1 = a1 && b1;	// 逻辑与，一个为假，运算结束，结果为假
		System.out.println(c1);
		
		c1 = a1 || b1;	// 逻辑或，一个为真，运算结束，结果为真
		System.out.println(c1);

		c1 = a1 ^ b1;	// 异或，两个结果不同即为真
		System.out.println(c1);
		
		int alter = 18;
		boolean vollage = alter > 18;
		System.out.println(vollage);
		
		/**
		 * 	包装类
		 * 	注意：1.基本数据类型，可以通过.valueOf()方法转换数据类型
		 * 		  2.不能把string类型直接转换成char类型
		 * 		  3.最大值：MAX_VALUE		最小值：MIN_VALU
		 */
		Integer zah1 = new Integer(20);		// 方式一
		Integer zah2 = Integer.valueOf(20);		// 方式二
		Integer zah3 = 20;	// 方式三，（自动打包）
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(zah1*zah1);
		System.out.println(zah1*zah2);

	}

}
