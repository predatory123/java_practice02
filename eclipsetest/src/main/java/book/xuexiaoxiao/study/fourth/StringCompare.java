package book.xuexiaoxiao.study.fourth;

/**
 * @author predatory
 *	�ַ����Ƚ�
 *		equalsIgnoreCase() ���Դ�Сд
 *		regionMatches()	�Ƚ��ַ������Ƿ���ָ�����ַ���
 * 			��һ��������Ŀ���ַ����п�ʼ�Ƚ��ַ����½Ǳ�
 * 			�ڶ�������������Ƚϵ��ַ���
 * 			������������ָ������Ƚϵ��ַ�������ʼ�½Ǳ�
 * 			���ĸ�����������Ƚϵ��ַ�����
 *		�����ַ����ıȽϣ�startsWith   endsWith
 */
public class StringCompare {

	public static void main(String[] args) {
		String name = "tom";
		String fullNameString = "tom" + "alice";
		boolean testCompare = name.equals(fullNameString);
		System.out.println(testCompare);
		System.out.println(name.startsWith(fullNameString));
		System.out.println(name.endsWith(fullNameString));
		System.out.println(name.regionMatches(2, "tom", 3, 1));

	}

}
