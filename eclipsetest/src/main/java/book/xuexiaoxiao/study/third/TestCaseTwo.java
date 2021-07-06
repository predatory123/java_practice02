package book.xuexiaoxiao.study.third;

/**
 * 
 * @author predatory
 *	请写一个程序，把学分转换成评语。1分为优秀，2分为良好，等等。
 *	1.判断使用if..else 和  swich...case那种更好
 *	2.完善程序，如果输入的成绩不在1到6分之间，则输入“无效的分数”
 */
public class TestCaseTwo {

	public static void main(String[] args) {
		// 获取开始参数
		int garde = Integer.parseInt(args[0]);
		
//		// 使用 if...else方式
//		if(garde <= 6 || garde >= 1) {
//			switch (garde) {
//				case 1:
//					System.out.println("优秀");
//					break;
//				case 2:
//					System.out.println("中等");
//					break;
//				case 3:
//					System.out.println("良好");
//					break;
//				case 4:
//					System.out.println("及格");
//					break;
//				case 5:
//					System.out.println("差");
//					break;
//				case 6:
//					System.out.println("很差");
//					break;
//			}
//			
//		}else {
//			System.out.println("无效的分数");
//		}
		
		// 使用 switch...case 方式
		switch (garde) {
		case 1:
			System.out.println("优秀");
			break;
		case 2:
			System.out.println("中等");
			break;
		case 3:
			System.out.println("良好");
			break;
		case 4:
			System.out.println("及格");
			break;
		case 5:
			System.out.println("差");
			break;
		case 6:
			System.out.println("很差");
			break;
		default:
			System.out.println("无效的分数");
		}
		
		
	}

}
	
