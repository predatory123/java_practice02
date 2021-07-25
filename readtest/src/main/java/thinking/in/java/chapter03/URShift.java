package thinking.in.java.chapter03;

/**
 * 移位操作符
 *      <<   >>  <<<   >>>
 * @author: wenyongjie
 * @date: 2021/7/20 21:29
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(i >>>= 10);
        long l = -1;
        System.out.println(l >>>= 10);
        short s = -1;
        System.out.println(s >>>= 10);
        byte b = -1;
        System.out.println(b >>>= 10);
        b = -1;
        System.out.println(b>>>10);
    }
}
