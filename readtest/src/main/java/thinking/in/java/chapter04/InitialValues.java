package thinking.in.java.chapter04;

/**
 * 成员初始化
 * @author: wenyongjie
 * @date: 2021/7/26 10:46
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    void print(String s) {
        System.out.println(s);
    }

    void printInitialValues() {
        print("Date type Initial value");
        print("boolean  " + t);
        print("char  [" + c + "]");
        print("byte  " + b);
        print("short  " + s);
        print("int  " + i);
        print("long  " + l);
        print("float  " + f);
        print("double  " + d);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();

        /*  也可以以这样写
        new InitialValues().printInitialValues();
         */
    }
}
