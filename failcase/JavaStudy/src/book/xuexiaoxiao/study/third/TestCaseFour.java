package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	写一个程序：找出100以内的所有质数（质数：大于1的自然数，切只能被1和它本身整除）
 *	延伸：
 *		埃拉托斯特尼筛法
 *		质数查询法
 */
public class TestCaseFour {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			// 假设i是一个质数
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
		
		// 优化计算效率后
		for (int i = 1; i <= 100; i++) {	
			boolean primeNumber = true;
			
			// 1.j的取值范围小于i的平方根 j <= Math.sqrt(i)，
//			for (int j = 2; j <= Math.sqrt(i); j++) {
//				if(i % j == 0) {
//					primeNumber = false;
//					break;
//				}
//			}
//			
			// 2.j的循环条件为j*j<i
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
		aussen:	// 循环便签，慎用！！！
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if(i == 5) {
					continue;
				}else {
					// 加上标签的continue跳过本次循环后，将从外层循环开始
					continue aussen;	
				}
			}
		}
	}

}
