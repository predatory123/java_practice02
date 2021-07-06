package main.java.com.book.test.qa.six;

// 继承-父类
public class Musiker extends Kuenstler{
    private String name;
    private int alter;
    private Band band;
    public void musizieren() {
        System.out.println("wawawa");
    }

    public Musiker(){}
    public Musiker (String kuenstlerName, String name, String vorname){
        super(kuenstlerName,name,vorname);
    }
}
