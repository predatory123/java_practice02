package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

/**
 * @author: wenyongjie
 * @date: 2021/7/20 20:54
 */
class Value {
    int i;
}

public class EqualsMethod2 {
    static Test monitor = new Test();
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        monitor.expect(new String[] {
                "false"
        });
    }
}
