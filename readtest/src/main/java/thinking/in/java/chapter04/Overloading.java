package thinking.in.java.chapter04;

/**
 * 重载 示例
 * @author: wenyongjie
 * @date: 2021/7/22 22:41
 */
class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int i) {
        System.out.println("Create a new Tree that is: " + i + " ,feet tall");
        height = i;
    }

    void info() {
        System.out.println("Tree is " + height + " .feet tail");
    }

    void info(String s) {
        System.out.println(s + " ,Tree is " + height + " .feet tail");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overload method");
            System.out.println("------------");
        }
    }
}
