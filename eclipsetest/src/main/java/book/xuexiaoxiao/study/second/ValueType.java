package book.xuexiaoxiao.study.second;

public class ValueType {
	// 8�����ݻ�������
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
		
		char v8 = 888; 		// ��ӡ�ֽ���
		System.out.println("Char: " + v8);
		System.out.println("------�ָ���------");
		
		/* 
		 * ��365 ת��Ϊ2���ơ�8���ơ�10���ơ�16����
		 */
		int va1 = 0555;
		System.out.println("365 8���� -- > " + Integer.toOctalString(365));
		
		int va2 = 0B101101101;
		System.out.println("365 2���� -- > " + Integer.toBinaryString(365));

		int va3 = 365;
		System.out.println("365 10���� -- > " + 365);

		int va4 = 0X16D;
		System.out.println("365 16���� -- > " + Integer.toHexString(365));
		
		System.out.println("------�ָ���------");
		// ��735535���н���ת��
		System.out.println("735535 2���� "  + Integer.toBinaryString(735535));
		System.out.println("735535 8���� " +  Integer.toOctalString(735535));
		System.out.println("735535 10���� "  + 735535);
		System.out.println("735535 16���� " + Integer.toHexString(735535));
		
		// ����ֵ����
		boolean a1 = true;
		boolean b1 = false;
		boolean c1 = !b1;	// ȡ��
		System.out.println(c1);

		c1 = a1 & b1;	// �߼��루λ�룩��������Ϊ�棬���Ϊ��
		System.out.println(c1);
		
		c1 = a1 && b1;	// �߼��룬һ��Ϊ�٣�������������Ϊ��
		System.out.println(c1);
		
		c1 = a1 || b1;	// �߼���һ��Ϊ�棬������������Ϊ��
		System.out.println(c1);

		c1 = a1 ^ b1;	// ������������ͬ��Ϊ��
		System.out.println(c1);
		
		int alter = 18;
		boolean vollage = alter > 18;
		System.out.println(vollage);
		
		/**
		 * 	��װ��
		 * 	ע�⣺1.�����������ͣ�����ͨ��.valueOf()����ת����������
		 * 		  2.���ܰ�string����ֱ��ת����char����
		 * 		  3.���ֵ��MAX_VALUE		��Сֵ��MIN_VALU
		 */
		Integer zah1 = new Integer(20);		// ��ʽһ
		Integer zah2 = Integer.valueOf(20);		// ��ʽ��
		Integer zah3 = 20;	// ��ʽ�������Զ������
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(zah1*zah1);
		System.out.println(zah1*zah2);

	}

}
