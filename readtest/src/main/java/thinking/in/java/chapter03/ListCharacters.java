package thinking.in.java.chapter03;

/**
 * @author: wenyongjie
 * @date: 2021/7/21 21:54
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            if (Character.isLowerCase((char) i)) {
                System.out.println("value: " + i + "character: " + (char)i);
            }
        }
    }
}
