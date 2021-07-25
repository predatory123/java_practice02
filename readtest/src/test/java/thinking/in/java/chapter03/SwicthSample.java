package thinking.in.java.chapter03;

/**
 * 写一个switch开关语句，为每个case打印一个消息。然后把这个switch放进for 循环来测试每个case。
 * 先让每个case后面都有break，测试一下会怎样；然后把break删了，看看会怎样
 * @author: wenyongjie
 * @date: 2021/7/22 22:29
 */
public class SwicthSample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
//                    break;
                case 2:
                    System.out.println("2");
//                    break;
                case 3:
                    System.out.println("3");
//                    break;
            }
        }
    }
}
