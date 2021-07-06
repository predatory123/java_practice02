package book.xuexiaoxiao.study.fifth;

// ¥˙¬Î÷ÿππ
public class TestCase2 {
	public static void main(String[] args) {
		eatFood("bred");
		
		int za11 = Integer.parseInt(args[0]);
		int za12 = Integer.parseInt(args[1]);
		int za13 = Integer.parseInt(args[2]);
		int za14 = Integer.parseInt(args[3]);
		int za15 = Integer.parseInt(args[4]);
		int za16 = Integer.parseInt(args[5]);
		eachPrintValue(za11, za12, za13, za14, za15, za16);
	}

	private static void eachPrintValue(int za11, int za12, int za13, int za14, int za15, int za16) {
		for (int i = 1; i < 49; i++) {
			if (i == za11 || i == za12 || i ==za13 || i == za14 || i == za15 || i == za16) {
				System.out.println("|x|");
			}else {
				System.out.println("|_|");
			}
			testValueCase(i);
		}
	}

	private static void testValueCase(int i) {
		if (i % 7 == 0) {
			System.out.println("");
		}
	}
	
	public static void eatFood(String food) {
		System.out.println("Today is eat " + food);
	}
	

	
}
