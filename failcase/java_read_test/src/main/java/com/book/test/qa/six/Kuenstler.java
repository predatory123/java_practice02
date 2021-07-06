package main.java.com.book.test.qa.six;

public class Kuenstler extends Person{
    private String kuenstlerName;
//    @Override
//    public Person(String name, String vorname){
//        this.kuenstlerName = name;
//    }
    public Kuenstler(String kuenstlerName, String name, String vorname){
        super(name,vorname);
        this.kuenstlerName = kuenstlerName;

    }

    public Kuenstler(){}
}
