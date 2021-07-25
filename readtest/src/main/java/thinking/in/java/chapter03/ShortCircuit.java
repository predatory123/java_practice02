package thinking.in.java.chapter03;

/**
 * 短路示例：
 *  一旦能够明确表示整个表达式的值，就不在计算剩余部分的值了。
 *  因此，整个逻辑表达式靠后的部分就有可能不被运算了
 * @author: wenyongjie
 * @date: 2021/7/20 21:18
 */
public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        if (test1(0) && test2(2) && test3(2)) {
            System.out.println("expression is true");
        }else {
            System.out.println("expression is false");
        }
    }
}
