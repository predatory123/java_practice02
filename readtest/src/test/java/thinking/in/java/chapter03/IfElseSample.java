package thinking.in.java.chapter03;

/**
 * 将ternary和alternative放到一个程序里面
 * @author: wenyongjie
 * @date: 2021/7/22 20:59
 */
public class IfElseSample {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int alternative(int i) {
        if (i < 10) {
            return i * 100;
        }else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        if (ternary(10) > alternative(10)) {
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
}
