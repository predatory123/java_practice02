package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	дһ�����������Ե��˵Ĺ���Ч��
 *	0 ����û�й���������
 *	1-3 ������΢����
 *	4-7 ����һ�㹥��
 *	8-10 ������������
 */
public class TestCaseThree {

	public static void main(String[] args) {
		int fende = 5;
		if(fende == 0) {
			System.out.println("û�й���������");
		}else if (fende >=1 && fende <= 3) {
			System.out.println("��΢����");
		}else if (fende >=4 && fende <= 7) {
			System.out.println("һ�㹥��");
		}else if (fende >=8 && fende <= 10) {
			System.out.println("����һ��");
		}else {
			System.out.println("������Ч");
		}
//		switch (fende) {
//		case 0:
//			System.out.println("û�й���������");
//			break;
//		// ���԰Ѳ�ͬ��case�����һ��ʹ��һ��break��Ϊ�ж�����
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("��΢����");
//			break;
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//			System.out.println("һ�㹥��");
//			break;
//		case 8:
//		case 9:
//		case 10:
//			System.out.println("����һ��");
//			break;
//		default:
//			System.out.println("�������");
//		}

	}

}
