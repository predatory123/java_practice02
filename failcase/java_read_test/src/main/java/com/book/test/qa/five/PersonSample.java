package main.java.com.book.test.qa.five;

public class PersonSample {
    public static void main(String[] args) {
        Person schroedinger = new Person();
        Person schroedingersFreundin = new Person();
        schroedingersFreundin.setWohnung(new Wohnung());
        Katze katze = new Katze(schroedingersFreundin);
        schroedingersFreundin.haushaltMachen();
    }
}
