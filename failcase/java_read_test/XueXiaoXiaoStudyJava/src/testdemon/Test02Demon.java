package testdemon;
/*编写一个程序，对于26个字母中的任何一个都给出该字母后面第六个字母，
 * 如果超出26，则从A开始重新计算，以此类推（如字母V对应字母B）*/
public class Test02Demon {
	public static void main(String[] args) {
		char bush = 'V';
		int baseNumber = 13;
		int alphe = 'A';
		bush -= alphe;
		bush += baseNumber;
		bush %= 26;
		bush += alphe;
		System.out.println(bush);
	}
}
