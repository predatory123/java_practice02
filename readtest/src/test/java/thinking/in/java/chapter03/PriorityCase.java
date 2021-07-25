package thinking.in.java.chapter03;

/**
 * 优先级测试
 * @author: wenyongjie
 * @date: 2021/7/22 20:54
 */
public class PriorityCase {
    public static void main(String[] args) {
        int a,x = 1, y = 2, z = 3;
        a = x + y - 2/2 + z;
        System.out.println(a);
        a = x + (y - 2) / (2 + z);
        System.out.println(a);
    }
}
