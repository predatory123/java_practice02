package main.java.com.book.test.qa.six;

// 继承-子类
public class Bassist extends Musiker {
    private String name;
    private int alter;
    private Band band;

    public Bassist(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    public Bassist() {
        super();
    }

    public void musizieren() {

    }
}
