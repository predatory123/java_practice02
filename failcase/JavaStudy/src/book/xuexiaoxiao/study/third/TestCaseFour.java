package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	дһ�������ҳ�100���ڵ���������������������1����Ȼ������ֻ�ܱ�1��������������
 *	���죺
 *		������˹����ɸ��
 *		������ѯ��
 */
public class TestCaseFour {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			// ����i��һ������
//			boolean primeNumber = true;
//			for (int j = 2; j < i; j++) {
//				if(i % j == 0) {
//					primeNumber = false;
//					break;
//				}
//			}
//			if(primeNumber) {
//				System.out.println(i);
//			}
//		}
		
		// �Ż�����Ч�ʺ�
		for (int i = 1; i <= 100; i++) {	
			boolean primeNumber = true;
			
			// 1.j��ȡֵ��ΧС��i��ƽ���� j <= Math.sqrt(i)��
//			for (int j = 2; j <= Math.sqrt(i); j++) {
//				if(i % j == 0) {
//					primeNumber = false;
//					break;
//				}
//			}
//			
			// 2.j��ѭ������Ϊj*j<i
			for (int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					primeNumber = false;
					break;
				}
			}
//			
//			if(primeNumber) {
//				System.out.println(i);
//			}
		}
		
		mmm();
		

	}
	
	public static void mmm() {
		aussen:	// ѭ����ǩ�����ã�����
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if(i == 5) {
					continue;
				}else {
					// ���ϱ�ǩ��continue��������ѭ���󣬽������ѭ����ʼ
					continue aussen;	
				}
			}
		}
	}

}
