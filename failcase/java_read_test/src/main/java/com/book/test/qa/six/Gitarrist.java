package main.java.com.book.test.qa.six;

// 继承-子类
public class Gitarrist extends Musiker {
    @Override
    public void musizieren() {
        System.out.println("this is a gitarrist");
    }

    public Gitarrist() {
        super();
    }

    public Gitarrist(String kuenstlerName, String name, String vorname) {
        super(kuenstlerName, name, vorname);
    }
}
