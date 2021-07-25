package thinking.in.java.chapter03;

/**
 * 写一个接受两个参数的方法，用各种布尔值的比较关系来比较这2个字符串，然后打印出来
 * 做 == 和 ！= 时，使用equals比较，在main方法中用几个不同的字符串对象来调用这个方法
 * @author: wenyongjie
 * @date: 2021/7/22 21:25
 */
public class StringEqualsSample {
    public static void main(String[] args){
        compare("hello", "hello");
        compare("hello", new String("hello"));
        compare("hello", "kldsf");
    }

    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    private static void compare(String str1, String str2) {
        System.out.println("----------"+ str1 + "---------" + str2);
        p("str1 == str2", str2 == str1);
        p("str1 === str2", str2 == str1);
        p("str1 != str2", str2 != str1);
        p("str1 equal str2", str2.equals(str1));
    }

}
