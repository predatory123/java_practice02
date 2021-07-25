package thinking.in.java.chapter02;

import java.util.Scanner;

/**
 * @author: wenyongjie
 * @date: 2021/7/11 20:56
 */
public class SanerTest {
    public static void main(String[] args) {
        // scaner输入
        String s1, s2, s3;
        Scanner  sc = new Scanner(System.in);
        System.out.println("输入的三个参数是：");
        s1 = sc.nextLine();
        s2 = sc.next();
        s3 = sc.next();
        System.out.println(s1 + s2 + s3);

        // 命令行输入
        if(args.length < 3) {
            System.err.println("Need 3 arguments");
            System.exit(1);//终止程序
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

}
