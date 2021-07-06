package testdemon;

public class Test04Demon {

	public static void main(String[] args) {
		//打印100以内的质数，只能被1和本身整除的数
		for(int i = 1;i<=100;i++) {
			boolean isVe = true;
			for(int j = 2;j< i; j++) {
				if(i % j == 0 ) {
					isVe = false;
					break;
				}
			}
			if(isVe) {
				System.out.println(i);
			}
		}
	}

}
