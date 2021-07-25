package thinking.in.java.chapter03;

import java.util.Random;

/**
 * 按位操作符演示
 * @author: wenyongjie
 * @date: 2021/7/20 21:34
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("-i", -i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j",i & j);
        printBinaryInt("i | j",i | j);
        printBinaryInt("i ^ j",i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(-i) >> 5", (-i) >> 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(-i) >> 5", (-i) >> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("maxpneg", lln);
        printBinaryLong("1", 1);
        printBinaryLong("-1", -1);
        printBinaryLong("-1", -1);
        printBinaryLong("m", m);
        printBinaryLong("1 & m", 1 & m);
        printBinaryLong("1 | m", 1 | m);
        printBinaryLong("1 ^ m", 1 ^ m);
        printBinaryLong("1 << 5", 1 << 5);
        printBinaryLong("1 >> 5", 1 >> 5);
        printBinaryLong("(-1) >> 5", (-1) >> 5);
        printBinaryLong("1 >> 5", 1 >> 5);
        printBinaryLong("(-1) >> 5", (-1) >> 5);
    }

    public static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", binary: ");
        System.out.print("   ");
        for (int j = 31; j >= 0; j--) {
            if (((1 << j) & i) != 0) {
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
        System.out.println();
    }

    public static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ", binary: ");
        System.out.print("   ");
        for (int i = 63; i >= 0; i--) {
            if (((1L << i) & l) != 0) {
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
