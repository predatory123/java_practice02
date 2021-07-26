package thinking.in.java.chapter04;

/**
 * 构造器初始化  初始化顺序
 * @author: wenyongjie
 * @date: 2021/7/26 10:56
 */
class Tag {
    Tag(int marker) {
        System.out.println("Tag( " + marker + ")");
    }
}

class Card {
    Tag t1 = new Tag(1);
    Card() {
        System.out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);

    void f() {
        System.out.println("f()");
    }
    Tag t3 = new Tag(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        Card t = new Card();
        t.f();
    }
}
