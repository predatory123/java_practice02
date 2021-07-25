package thinking.in.java.chapter03;

/**
 * 逗号操作符，适应于for循环
 * @author: wenyongjie
 * @date: 2021/7/21 21:56
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 10; i++, j = i * 2) {
            System.out.println("i= " + i + ", j= " + j);
        }
    }
}
