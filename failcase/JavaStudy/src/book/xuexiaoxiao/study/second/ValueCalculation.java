package book.xuexiaoxiao.study.second;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValueCalculation {

	public static void main(String[] args) {
		// ���ݼ���
		int a = 10;
		int b = 20;
		int c = a + b;
		int e = 10,f = 10;
		System.out.println(c+e+f);
		
		String  tom = "ac", bob = "HAHAH";
		String alice = tom + bob;
		System.out.println(alice);
		
		// С����ȷ����
		BigDecimal zehe = new BigDecimal("10");	// ����Ϊ�ַ�������
		BigDecimal zeh = new BigDecimal("3"); 
		BigDecimal ze = zehe.divide(zeh, 16, RoundingMode.HALF_UP); // �ڶ������� ��16�� ���ñ���С��λ��
		System.out.println(ze);
		
		// �������Լ����
		int wow = 10;
		System.out.println(wow++);	// 10  ��ֵ��Ϊ11
		System.out.println(++wow); // 12 ʵ��Ϊ11+1 
		System.out.println(wow--); // 12  �����Ϊ11
		System.out.println(--wow);	// 10 
		
		System.out.println(" ----------�ָ��� ------------");
		valueSort();
		 
	}
	
	public static void valueSort() {
		int zal1 = 7;
		
//		// ʹ����Ľ��Ϊ49,7,9,81,80,80,8,8
//			System.out.println(zal1*zal1);
//			System.out.println(zal1++);
//			System.out.println(++zal1);
//			System.out.println(zal1 = zal1*zal1);
//			System.out.println(--zal1);
//			System.out.println(zal1--);
//			System.out.println(zal1 = (zal1-9)/8);
//			System.out.println(zal1);
		
		// ��������˳��ʹ����Ľ��Ϊ8,8,81,81,9,9,7,7
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
