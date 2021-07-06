package main.java.com.book.test.qa.five;

// 堆栈区分？
public class Ungeheuer {
    private int anzahlZaehne = 200;
    private String name;
    public static void main(String[] args) {
        Ungeheuer ungeheuer = new Ungeheuer("tom");
        ungeheuer.erschrecken();
        ungeheuer.kauen();
        ungeheuer.flirten(new Ungeheuer("BOB"));
    }

    public Ungeheuer (String name) {
        this.name = name;
    }

    public void erschrecken() {
        int lautsterke = 5;
        String schrei = "hahaha";
        System.out.println(this.name + schrei);
        for (int i = 0; i < lautsterke; i++) {
            System.out.println("!");
        }
        System.out.println("");
    }

    public void kauen() {
        for (int i = 0; i < this.anzahlZaehne; i++) {
            System.out.println("!");
        }
        System.out.println("");
    }

    public void flirten(Ungeheuer ungeheuer) {
        this.erschrecken();
        ungeheuer.erschrecken();
    }
}
