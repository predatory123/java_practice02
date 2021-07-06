package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	写一个程序，输出你对敌人的攻击效果
 *	0 代表没有攻击到敌人
 *	1-3 代表轻微攻击
 *	4-7 代表一般攻击
 *	8-10 代表致命攻击
 */
public class TestCaseThree {

	public static void main(String[] args) {
		int fende = 5;
		if(fende == 0) {
			System.out.println("没有攻击到敌人");
		}else if (fende >=1 && fende <= 3) {
			System.out.println("轻微攻击");
		}else if (fende >=4 && fende <= 7) {
			System.out.println("一般攻击");
		}else if (fende >=8 && fende <= 10) {
			System.out.println("致命一击");
		}else {
			System.out.println("攻击无效");
		}
//		switch (fende) {
//		case 0:
//			System.out.println("没有攻击到敌人");
//			break;
//		// 可以把不同的case组合在一起，使用一个break作为中断条件
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("轻微攻击");
//			break;
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//			System.out.println("一般攻击");
//			break;
//		case 8:
//		case 9:
//		case 10:
//			System.out.println("致命一击");
//			break;
//		default:
//			System.out.println("输入错误");
//		}

	}

}
