package book.xuexiaoxiao.study.fourth;

/**
 * 	1.��дһ�����������е�Ԫ����ĸ��λ���������-����������ĸ�������.��
 * 	2.��дһ�������ж������ַ����Ƿ��й��õ���ͬ��׺
 * 	3.�ַ���ѭ������
 *
 */
public class TestCase {
	public static void main(String[] args) {
		testLength();
		System.out.println("------�ָ���--------");
		testTwo();
		System.out.println("------�ָ���--------");
		testThree();
		
	}
	
	public static void testLength() {
		String testName = "Taumatawhakatangihangakuauauotamateaturipukakapikimaungahoronukupo"
				+ "kaiwhenuakitanatahu";
		System.out.println(testName);
		testName = testName.toLowerCase();
		for (int i = 0; i < testName.length(); i++) {
			char zeichen = testName.charAt(i);
			switch (zeichen) {
			case 'a': case 'e': case 'i': case 'o': case 'u':  
				System.out.println("-");
				break;
			default:
				System.out.println(".");
			}
		}
	}
	
	public static void testTwo() {
		String s1 = "Tischlerei";
		String s2 = "Fischerei";
		String gameString = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			String teilString = s1.substring(i);
			if (s2.endsWith(teilString)) {
				gameString = teilString;
			}else {
				break;
			}
		}
		System.out.println(gameString);
	}
	
	public static void testThree() {
		StringBuilder textMitBuilder = new StringBuilder(1377);
		for (int i = 0; i < 99; i++) {
			textMitBuilder.append("abc" + i + "\n");
		}
		System.out.println(textMitBuilder.toString());
	}

}
