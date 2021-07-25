package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

/**
 * 关系操作符
 * @author: wenyongjie
 * @date: 2021/7/20 20:49
 */
public class Equivalence {
    static Test monitor = new Test();
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        monitor.expect(new String[] {
                "false",
                "true"
        });
    }
}
