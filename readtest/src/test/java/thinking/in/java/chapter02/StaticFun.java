package thinking.in.java.chapter02;

/**
 * @author: wenyongjie
 * @date: 2021/7/11 20:51
 */
public class StaticFun {

    static void incr() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        StaticFun sf = new StaticFun();
        sf.incr();
        StaticFun.incr();
    }
}
