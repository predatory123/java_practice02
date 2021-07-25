package thinking.in.java.chapter04;

/**
 * 重载区分参数顺序
 * @author: wenyongjie
 * @date: 2021/7/22 22:48
 */
public class OverloadingOrder {
    static void print(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void print(int i, String s) {
        System.out.println("int: " + i + " ,String: " + s);
    }

    public static void main(String[] args) {
        print("first",11);
        print(11,"first");
    }
}

