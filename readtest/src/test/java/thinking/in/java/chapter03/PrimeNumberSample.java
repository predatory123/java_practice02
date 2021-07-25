package thinking.in.java.chapter03;

/**
 * 一个双层for循环，用取模 % 来检测质数，并打印出来
 * @author: wenyongjie
 * @date: 2021/7/22 22:06
 */
public class PrimeNumberSample {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 1){
                System.out.println(1);
            }
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && j != 1) {
                    a = 0;
                    break;
                }else {
                    a = i;
                }
            }
            if (a != 0){
                System.out.println(i);
            }
        }
    }
}
