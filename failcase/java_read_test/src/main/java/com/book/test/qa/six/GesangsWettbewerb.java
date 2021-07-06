package main.java.com.book.test.qa.six;

/**
 *  如果重写有个带参数或者返回值的方法，则必须保证参数个数相同
 *  并且重写方法的返回值类型要与原来方法的返回值类型有很好的兼容性
 */
public class GesangsWettbewerb extends MusikWettbewerb {
    @Override
    public Saenger derGewinnerIst(){
        return null;
    }

//    @Override
    public void fuegeTeilnehmerHinze(Musiker musiker){

    }

//    @Override
//    public void happy(){}

}
