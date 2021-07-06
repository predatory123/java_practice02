package book.xuexiaoxiao.study.six;

public class PremiumAbo extends Abo {
    public PremiumAbo() {
        System.out.println("Premiumabo...........");
    }

    @Override
    public double getPreisProJahr() {
        return super.getPreisProJahr() *2;
    }

    @Override
    public void getAbonnet() {
        super.getAbonnet();
    }
}
