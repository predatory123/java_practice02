package thinking.in.java.chapter03;

/**
 * if...else
 * @author: wenyongjie
 * @date: 2021/7/21 21:45
 */
public class IfElse {
    static int test(int testval, int target, int begin, int end) {
        int result = 0;
        if (testval <= begin || testval >= end) {
            if (testval > target) {
                result = +1;
            } else if (testval < target) {
                result = -1;
            } else {
                result = 0;
            }
            return result;
        }else {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10,5,1,20));
        System.out.println(test(5,10,1,20));
        System.out.println(test(5,5,1,20));
    }
}
