package book.xuexiaoxiao.study.third;

import org.omg.CORBA.portable.ValueBase;

/**
 * 	��дһ�����򣬵ȴ��û��ύһ����ʼ������
 * 		1.���������Ĳ����Ƿ���Ա�7������
 * 		2.���룬���Ա�13����
 * 		3.��7���������ܱ�13����������  ���������  && || 
 * 	���û�п�ʼ�����������һ��������Ϣ��
 */

public class TestCase {
	
	public static void main(String[] args) {	
		if(args.length > 0) {
			// �ж��Ƿ����ύ��������Ҫ�� run configurations �����ò���
			String parmameter = args[0];	
			int result = Integer.valueOf(parmameter);
			if (result % 7 == 0 || result % 13 == 0) {
				System.out.println(result + " ���Ա�����");
			}
//			else if (result % 13 == 0) {
//				System.out.println(result + " ���Ա�13����");
//			}
			else {
				System.out.println(result + " ���ܱ�����");
			}
		}else {
			System.out.println("û���ύ����");
		}
		
		testOne();
	}
	
	public static void testOne() {
		// ʹ�� switch...case ,���ܳ���ȡֵ��Χ
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
