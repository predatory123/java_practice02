package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	��дһ�����򣬰�ѧ��ת�������1��Ϊ���㣬2��Ϊ���ã��ȵȡ�
 *	1.�ж�ʹ��if..else ��  swich...case���ָ���
 *	2.���Ƴ����������ĳɼ�����1��6��֮�䣬�����롰��Ч�ķ�����
 */
public class TestCaseTwo {

	public static void main(String[] args) {
		// ��ȡ��ʼ����
		int garde = Integer.parseInt(args[0]);
		
//		// ʹ�� if...else��ʽ
//		if(garde <= 6 || garde >= 1) {
//			switch (garde) {
//				case 1:
//					System.out.println("����");
//					break;
//				case 2:
//					System.out.println("�е�");
//					break;
//				case 3:
//					System.out.println("����");
//					break;
//				case 4:
//					System.out.println("����");
//					break;
//				case 5:
//					System.out.println("��");
//					break;
//				case 6:
//					System.out.println("�ܲ�");
//					break;
//			}
//			
//		}else {
//			System.out.println("��Ч�ķ���");
//		}
		
		// ʹ�� switch...case ��ʽ
		switch (garde) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("�е�");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("�ܲ�");
			break;
		default:
			System.out.println("��Ч�ķ���");
		}
		
		
	}

}
	
