package thinking.in.java.chapter04;

/**
 * 在构造其中调用构造器
 * @author: wenyongjie
 * @date: 2021/7/25 18:02
 */
public class Flower {
    int petalCount = 0;
    String s = new String("null");
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ String arg only. petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only. s= " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi",47);
        System.out.println("default constructor (no args)");
    }

    void print() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }
}
