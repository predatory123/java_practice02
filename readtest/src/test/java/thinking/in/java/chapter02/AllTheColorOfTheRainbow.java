package thinking.in.java.chapter02;

/**
 * @author: wenyongjie
 * @date: 2021/7/11 21:10
 */
public class AllTheColorOfTheRainbow {
    int atIntagerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        if (newHue > 10) {
            newHue = atIntagerRepresentingColors;
            System.out.println(newHue);
        }else {
            System.out.println(newHue);
        }
    }

    public static void main(String[] args) {
        new AllTheColorOfTheRainbow().changeTheHueOfTheColor(11);
    }
}
