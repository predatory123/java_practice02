package thinking.in.java.chapter03;

/**
 * switch...case
 * @author: wenyongjie
 * @date: 2021/7/21 22:19
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.println(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                default:
                    System.out.println("consonant");
            }
        }
    }
}
