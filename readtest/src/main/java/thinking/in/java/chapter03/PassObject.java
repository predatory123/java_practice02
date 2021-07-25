package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

/**
 * 方法调用中的别名问题
 * @author: wenyongjie
 * @date: 2021/7/17 19:11
 */

class Letter {
    char c;
}
public class PassObject {
    static Test monitor = new Test();
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
        monitor.expect(new String[]{
                "1: x.c: a",
                "2: x.c: z"
        });
    }
}
