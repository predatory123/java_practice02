package main.java.com.book.test.qa.six;

public class BackgroundSeangerin extends Musiker {
    private String name;
    private int alter;
    private Band band;
    public void musizieren() {
        System.out.println("wawawa");
    }

    public BackgroundSeangerin() {
        super();
    }

    public BackgroundSeangerin(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }
}
