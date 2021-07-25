package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

/**
 * 自增和自减运算
 * @author: wenyongjie
 * @date: 2021/7/18 18:36
 */
public class AutoInc {
    static Test monitor = new Test();
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i : " + i);
        System.out.println("++i : " + ++i);
        System.out.println("i++ : " + i++);
        System.out.println("i : " + i);
        System.out.println("--i : " + --i);
        System.out.println("i-- : " + i--);
        System.out.println("i : " + i);
        monitor.expect(new String[] {
                "i : 1",
                "++i : 2",
                "i++ : 2",
                "i : 3",
                "--i : 2",
                "i-- : 2",
                "i : 1",
        });
    }
}
