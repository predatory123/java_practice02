package thinking.in.java.chapter03;

/**
 * 数值计算结果溢出
 * @author: wenyongjie
 * @date: 2021/7/21 21:42
 */
public class Overflow {
    public static void main(String[] args) {
        int big = 0x7fffffff;
        System.out.println("big: " + big);
        int bigger = big * 4;
        System.out.println("bigger: " + bigger);
    }
}
