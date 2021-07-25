package thinking.in.java.chapter03;

/**
 * Math.Random 实例
 * @author: wenyongjie
 * @date: 2021/7/21 22:29
 */
public class RandomBounds {
    static void usage() {
        System.out.println("Usage: \n\t" + "RandomBounds lower\n\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
        }
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0) {
                System.out.println("Produced 0.0 !");
            }
        }else if (args[0].equals("upper")) {
            while (Math.random() != 1.0) {
                System.out.println("Produced 1.0 !");
            }
        }else {
            usage();
        }
    }
}
