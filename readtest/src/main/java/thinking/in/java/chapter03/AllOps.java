package thinking.in.java.chapter03;

/**
 * 操作符实例
 * @author: wenyongjie
 * @date: 2021/7/21 21:35
 */
public class AllOps {
    void f(boolean b){

    }

    void boolTest(boolean x, boolean y) {
        f(x == y);
        f(x != y);
        f(!y);

        x = x && y;
        x = x || y;

        x= x & y;
        x = x | y;
        x = x ^ y;

        x &= y;
        x ^= y;
        x |= y;
    }

    void charTest(char x, char y) {
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x = (char) (x + y);
        x = (char) (x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
    }
}
