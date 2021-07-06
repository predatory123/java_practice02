package main.java.com.book.test.qa.six;

public class Trompeter extends Musiker {
    private String name;
    private int alter;
    private Band band;
    public void musizieren() {
        System.out.println("wawawa");
    }

    public Trompeter() {
        super();
    }

    public Trompeter(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }
}
