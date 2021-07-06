package book.xuexiaoxiao.study.fourth;

/**
 * @author predatory
 *	字符串比较
 *		equalsIgnoreCase() 忽略大小写
 *		regionMatches()	比较字符串中是否有指定的字符串
 * 			第一个参数：目标字符串中开始比较字符的下角标
 * 			第二个参数：参与比较的字符串
 * 			第三个参数：指定参与比较的字符串的起始下角标
 * 			第四个参数：参与比较的字符个数
 *		部分字符串的比较：startsWith   endsWith
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
