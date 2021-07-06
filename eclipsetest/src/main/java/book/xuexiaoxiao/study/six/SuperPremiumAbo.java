package book.xuexiaoxiao.study.six;

public class SuperPremiumAbo extends PremiumAbo {
    public SuperPremiumAbo() {
        System.out.println("-----------SuperPremiumAbo-----------");
    }

    @Override
    public double getPreisProJahr() {
        return super.getPreisProJahr() *2;
    }

    public static void main(String[] args) {
        Abo abo = new SuperPremiumAbo();
        System.out.println(abo.getPreisProJahr());
    }
}
