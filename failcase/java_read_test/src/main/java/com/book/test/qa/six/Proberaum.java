package main.java.com.book.test.qa.six;

/**
 *  1.方法调用实例
 *  2.强制类型转换（向下转型）
 *  3.向上转型
 *  4.重载：方法名称相同，参数不同
 */
public class Proberaum {
    public static void main(String[] args) {
        Saenger saenger = new Saenger();
        Gitarrist gitarrist = new Gitarrist();
        Bassist bassist = new Bassist();
        Trompeter trompeter = new Trompeter();
        BackgroundSeangerin backgroundSeangerin = new BackgroundSeangerin();
        machtMusik(saenger, gitarrist, bassist, trompeter, backgroundSeangerin);

        // 强制类型转换
        Person mick = new Saenger();
        Musiker mickDerMusiker = (Musiker) mick;
        mickDerMusiker.musizieren();

        // 向上转型
        Musiker musikerDr = new Saenger();
        Person mickPerson = musikerDr;

        Musiker musiker1 = new Saenger();
        einkaufenAls(musiker1); // 此时调用 inkaufenAls(Musiker musiker1)
        // musiker1变成person类
        Person mickPerson1 = musiker1;
        einkaufenAls(mickPerson1);
    }

    // 重载
    public static void einkaufenAls(Person person){
        System.out.println("111");
    }

    public static void einkaufenAls(Musiker musiker){
        System.out.println("111");
    }
    public static void machtMusik(Musiker ... gruppe){  // ... 为可变参数
        for (Musiker musiker : gruppe){
            musiker.musizieren();
        }
    }
}
