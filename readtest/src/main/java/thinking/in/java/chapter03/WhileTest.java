package thinking.in.java.chapter03;

/**
 * while...  符合条件就执行
 * do...while 至少执行一次
 * @author: wenyongjie
 * @date: 2021/7/21 21:50
 */
public class WhileTest {
    public static void main(String[] args) {
        double r = 0;
        while (r < 0.99d) {
            r = Math.random();
            System.out.println(r);
        }

        int i = 10;
        do {
            System.out.println(i);
        }while (i > 1);
    }
}
