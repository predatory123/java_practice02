package book.xuexiaoxiao.study.second;

import java.util.Scanner;

/**
 * 	�ڶ�����ϰ
 * @author predatory
 *
 */
public class ValueTestOne {


	public static void main(String[] args) {
		TestOne();
		System.out.println("-----�ָ���------");
		TestTwo();
		System.out.println("-----�ָ���------");
		TestThree();
		
	}
	
	public static void TestOne() {
		/**
		 * @author predatory
		 *	 ������ĸ���ܷ�
		 * 	��дһ�γ��򣬶����κ�һ����ĸ��A-Z��,��������ĸ����ĵ�����λ���ϵ���ĸ���������26����ĸ��
		 * 	��ӵ�һ����ĸ��A�����¼��㣬�Դ����ƣ�ѭ����ȥ�����磺������ĸV����Ӧ����ĸΪB
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
		 * 	дһ�����򣬲��ж�����һ��û��С����������Ƿ���byte��short��int����long��ȡֵ��Χ��
		 * 	Ҫ��ʹ�õ���װ��
		 * 	���磺5534������ļ������
		 * 			5534��byte��ȡֵ��Χ�ڣ�false
		 * 			5534��short��ȡֵ��Χ�ڣ�true
		 * 			5534��int��ȡֵ��Χ�ڣ�true
		 * 			5534��long��ȡֵ��Χ�ڣ�true
		 */
		
		System.out.println("������һ��������");
		Scanner keys = new Scanner(System.in);
		try {
			Long wula1 = keys.nextLong();
			if(wula1 < Long.valueOf(Byte.MAX_VALUE) && wula1 > Long.valueOf(Byte.MIN_VALUE)) {
				System.out.println(wula1 + " ��Byte��ȡֵ��Χ�ڣ�true");
			}else {
				System.out.println(wula1 + " ��Byte��ȡֵ��Χ�ڣ�false");
			}
			
			if(wula1 < Long.valueOf(Short.MAX_VALUE) && wula1 > Long.valueOf(Short.MIN_VALUE)) {
				System.out.println(wula1 + " ��Short��ȡֵ��Χ�ڣ�true");
			}else {
				System.out.println(wula1 + " ��Short��ȡֵ��Χ�ڣ�false");
			}
			
			if(wula1 < Long.valueOf(Integer.MAX_VALUE) && wula1 > Long.valueOf(Integer.MIN_VALUE)) {
				System.out.println(wula1 + " ��Integer��ȡֵ��Χ�ڣ�true");
			}else {
				System.out.println(wula1 + " ��Integer��ȡֵ��Χ�ڣ�false");
			}
			
			if(wula1 < Long.MAX_VALUE && wula1 > Long.MIN_VALUE) {
				System.out.println(wula1 + " ��Long��ȡֵ��Χ�ڣ�true");
			}else {
				System.out.println(wula1 + " ��Long��ȡֵ��Χ�ڣ�false");
			}		
			
		}catch (Exception e) {
			System.out.println("�������ʹ���������һ��������");
			TestTwo();
			
		}
		
	}
	
	public static void TestThree() {
		/**
		 * 	дһ�������ж�һ��char�������Ƿ����������ĸ����д����Сд
		 */
		char rac = 'N';
		System.out.println("�ж��Ƿ���ĸ��" + Character.isLetter(rac));
		System.out.println("�жϴ�д��" + Character.isUpperCase(rac));	// isLowerCase()�ж��Ƿ�Сд
		
	}
	

}
