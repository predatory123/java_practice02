package thinking.in.java.chapter04;

/**
 * 构造器  示例  无参构造
 * @author: wenyongjie
 * @date: 2021/7/22 22:35
 */
class  Rock {
    Rock() {
        System.out.println("Create Rock");
    }
}

public class SampleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
