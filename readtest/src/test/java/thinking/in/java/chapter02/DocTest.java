package thinking.in.java.chapter02;

/**
 * <P>
 *    这是一个练习
 * </P>
 * @author: wenyongjie
 * @date: 2021/7/11 21:15
 */
public class DocTest {

    public int i;

    public void f(int i) {
        this.i = i;
        System.out.println(i);
    }

    public static void main(String[] args) {
        new DocTest().f(11);
    }
}
