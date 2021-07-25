package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

/**
 * @author: wenyongjie
 * @date: 2021/7/20 20:54
 */
public class EqualsMethod {
    static Test monitor = new Test();
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2));
        monitor.expect(new String[] {
                "true"
        });
    }
}
