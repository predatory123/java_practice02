package book.xuexiaoxiao.study.fourth;

/**
 * 	1.编写一个程序，在所有的元音字母的位置上输出“-”，其他字母上输出“.”
 * 	2.编写一个程序，判读两个字符串是否有共用的相同后缀
 * 	3.字符串循环操作
 *
 */
public class TestCase {
	public static void main(String[] args) {
		testLength();
		System.out.println("------分割线--------");
		testTwo();
		System.out.println("------分割线--------");
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
