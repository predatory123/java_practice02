package book.xuexiaoxiao.study.fourth;

/**
 * 	�ַ�������
 */
import java.util.Arrays;

public class StringCase {

	public static void main(String[] args) {
		// �����ַ�����4�ַ�ʽ
		String case1 = new String("java");
		String case2 = "java";
		char[] case3 = {'j','a','v','a'};
		String case30 = new String(case3);
		String case4 = "ja" + "va";
		System.out.println(case1 + case2 + case30 + case4);
		
		//ʹ�� charAt() �����ַ����е��ַ�
		String case5 = "hello world";
		System.out.println(case5.charAt(6));	
		
		/** 
		 * ��ȡ�ַ����ĳ��ȣ���Ҫע���ַ�����Խ������
		 */
//		System.out.println(case5.charAt(case5.length()));  // ����д��
		System.out.println(case5.charAt(case5.length()-1)); // ��ȡ���һ����ĸ
		System.out.println(case5.length());
		
		/**
		 * �ַ������
		 */
		String genger = "efsefsdfsgtfhherytyqwwr ioqwcmsngnoqiwrhov";
		System.out.println(genger.substring(15));	// ��ָ��λ�ò�֣�substring()�����ַ���
		System.out.println(genger.substring(15, 20));	// ��ָ�����Ȳ��
		
		String[] frucht = genger.split("e");	// ָ���ַ����,�����ַ�������
		System.out.println(Arrays.toString(frucht));	
		
		/**
		 * 	�ַ����ַ���������
		 */
		System.out.println(12 + "12");	// ���ֺ��ַ�������ֱ����ӣ������ƴ��
		System.out.println("12" + 12);
		System.out.println("test".concat("hahaha"));
		
		int falsc = 15;
		int flasssss = 20;
//		System.out.println(falsc +"-" + flasssss + "ist" + flasssss - falsc);	// ����д��
		System.out.println(falsc +"-" + flasssss + "ist" + (flasssss - falsc));
		
		// ����ָ�����ַ���
		System.out.println("hello world".contains("hello"));
		
		// �ַ����滻
		System.out.println("hello world".replace("world", "java"));
		
	}

} 
