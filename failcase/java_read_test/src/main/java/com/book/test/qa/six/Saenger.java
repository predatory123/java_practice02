package main.java.com.book.test.qa.six;

// 继承-子类
public class Saenger extends Musiker {
    public Saenger(){
        super();

    }
    public Saenger(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }

    @Override
    public void musizieren() {
        System.out.println(" I am a singer");
    }
}
