package book.xuexiaoxiao.study.second;

import java.awt.Window.Type;

public class ValueConversion {

	public static void main(String[] args) {
		// ��������ת��
		byte kle1= 5;
		short kle2 = kle1;
		int kle3 = kle2;
		long kle4 = kle3;
		
//		kle3 = kle4; // ����д��
		kle3 = (int)kle4;
		kle2 = (short)kle3;
		kle1 = (byte)kle2;
		
		// ��תС������ȱʧ����
		short va1 = 128;
		byte va2 =  (byte)va1;
		System.out.println(va2);	// -128
		
		// �鿴��ǰ�ļ�JVM������Ϣ
		String name = System.getProperty("file.encoding");
		System.out.println(name);

	}

}
	