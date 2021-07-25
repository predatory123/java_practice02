package thinking.in.java.chapter03;

/**
 * 1.打印1到100的数字
 * 2.使用break使用练习1中的程序，在47的时候退出，在46的时候return
 * @author: wenyongjie
 * @date: 2021/7/22 21:20
 */
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 57) {
                break ;
            }if (i == 46) {
                return ;
            }
            System.out.println(i);
        }
    }
}
