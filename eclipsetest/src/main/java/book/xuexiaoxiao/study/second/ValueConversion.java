package book.xuexiaoxiao.study.second;

import java.awt.Window.Type;

public class ValueConversion {

	public static void main(String[] args) {
		// 数据类型转换
		byte kle1= 5;
		short kle2 = kle1;
		int kle3 = kle2;
		long kle4 = kle3;
		
//		kle3 = kle4; // 错误写法
		kle3 = (int)kle4;
		kle2 = (short)kle3;
		kle1 = (byte)kle2;
		
		// 大转小，容易缺失精度
		short va1 = 128;
		byte va2 =  (byte)va1;
		System.out.println(va2);	// -128
		
		// 查看当前文件JVM编码信息
		String name = System.getProperty("file.encoding");
		System.out.println(name);

	}

}
	