package thinking.in.java.chapter04;

/**
 * finalize 示例
 * @author: wenyongjie
 * @date: 2021/7/25 18:21
 */
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // 适当的清理
        novel.checkIn();
        // 扔掉参考资料，忘记清理
        new Book(true);
        // 强制垃圾收集和终结
        System.gc();
    }
}
