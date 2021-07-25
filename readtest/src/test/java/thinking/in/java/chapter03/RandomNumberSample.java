package thinking.in.java.chapter03;

import java.util.Random;

/**
 * 1.随机生成25个整数，对于每个值，都用if...else判断大小，小于还是等于下一个随机生成的值
 * 2.加入while，变成死循环
 * @author: wenyongjie
 * @date: 2021/7/22 21:38
 */
public class RandomNumberSample {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        int k;
        while (true) {
            for (int j = 0; j < 25; j++) {
                k = random.nextInt(100);
                if (k > i) {
                    System.out.println(i + "<" + k);
                } else if (k < i) {
                    System.out.println(i + ">" + k);
                } else {
                    System.out.println(i + "=" + k);
                }
                i = k;
            }
        }
    }
}
