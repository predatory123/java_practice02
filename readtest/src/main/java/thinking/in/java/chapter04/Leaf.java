package thinking.in.java.chapter04;

/**
 * this关键字的使用
 * @author: wenyongjie
 * @date: 2021/7/25 17:58
 */
public class Leaf {
    private int i = 0;
    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
