package main.java.com.book.test.qa.five;

public class Person {
    private Katze katze;
    private Wohnung wohnung;

//    public Katze getKatze() {
//        return katze;
//    }

    public void setKatze(Katze katze) {
        this.katze = katze;
    }

    public Wohnung getWohnung() {
        return wohnung;
    }

    public void setWohnung(Wohnung wohnung) {
        this.wohnung = wohnung;
    }

    public void haushaltMachen(){
        this.getWohnung().putzen();
        this.haustierFuettern();
    }

    private void haustierFuettern(){
        if (this.katze != null){
            this.katze.fuettern();
        }
    }
}
