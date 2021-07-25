package thinking.in.java.chapter03;

/**
 * break和continue  循环中断
 * @author: wenyongjie
 * @date: 2021/7/21 21:59
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("for循环的值：");
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("while循环的值：");
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
