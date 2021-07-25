package thinking.in.java.chapter03;

import com.bruceeckel.simpletest.Test;

import java.util.Random;

/**
 * 算术运算符
 * @author: wenyongjie
 * @date: 2021/7/18 17:57
 */
public class MathOps {
    static Test monitor = new Test();
    static void printInt(String s, int i) {
        System.out.println(s + " = " + i);
    }

    static void printFloat(String s, float f) {
        System.out.println(s + " = " + f);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        j = rand.nextInt(100) + 1;
        k = rand.nextInt(100) + 1;
        printInt("j", j);
        printInt("k", k);
        i = j + k;
        printInt("j + K", i);
        i = j - k;
        printInt("j - K", i);
        i = j * k;
        printInt("j * K", i);
        i = j / k;
        printInt("j / K", i);
        i = j % k;
        printInt("j % K", i);
        j %= k;
        printInt("j %= K", j);

        float u, v, w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        printFloat("v", v);
        printFloat("w", w);
        u = v + w;
        printFloat("v + w", u);
        u = v - w;
        printFloat("v - w", u);
        u = v * w;
        printFloat("v * w", u);
        u = v / w;
        printFloat("v / w", u);
        u += v;
        printFloat("u += v", u);
        u -= v;
        printFloat("u -= v", u);
        u *= v;
        printFloat("u *= v", u);
        u /= v;
        printFloat("u /= v", u);

        // 正则匹配结果，已失效
        monitor.expect(new String[] {
                "%% j = -?\\d+",
                "%% k = -?\\d+",
                "%% j \\+ k = -?\\d+",
                "%% j - k = -?\\d+",
                "%% k / j = -?\\d+",
                "%% k \\* j = -?\\d+",
                "%% k % j = -?\\d+",
                "%% j %= k = -?\\d+",
                "%% v = -?\\d+\\.\\d+(E-?\\d)?",
                "%% w = -?\\d+\\.\\d+(E-?\\d)?",
                "%% v \\+ w = -?\\d+\\.\\d+(E-?\\d)??",
                "%% v - w = -?\\d+\\.\\d+(E-?\\d)??",
                "%% v \\* w = -?\\d+\\.\\d+(E-?\\d)??",
                "%% v / w = -?\\d+\\.\\d+(E-?\\d)??",
                "%% u \\+= v = -?\\d+\\.\\d+(E-?\\d)??",
                "%% u -= v = -?\\d+\\.\\d+(E-?\\d)??",
                "%% u \\*= v = -?\\d+\\.\\d+(E-?\\d)??",
                "%% u /= v = -?\\d+\\.\\d+(E-?\\d)??",
        });
    }
}
