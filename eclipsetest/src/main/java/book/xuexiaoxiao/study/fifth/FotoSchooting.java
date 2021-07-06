package book.xuexiaoxiao.study.fifth;

// 1.调用FotoApparat，创建实例化对象
// 2.设置getter和setter
// 3.生成两个不同的照相机对象，并且用tostring方法输出到控制台，交换顺序后再输出一次
import book.xuexiaoxiao.study.fifth.FotoApparat;
import book.xuexiaoxiao.study.fifth.Objektiv;
import book.xuexiaoxiao.study.third.NewTextGame;

public class FotoSchooting {
	public static void main(String[] args) {
		FotoApparat fotoApparat = new FotoApparat();
		fotoApparat.setBrennweiten(18, 200);
		fotoApparat.setBildStabilisiert(true);
		fotoApparat.setDisplayGroesse(7.6);
		fotoApparat.setMarke("SoNie");
		fotoApparat.setMagePixel(18);
		
		FotoApparat fotoApparat1 = new FotoApparat(10, 7.5, true, "marke", 10, 200, "UK");
		String fotoString = fotoApparat1.toString();
		System.out.println(fotoString); //打印对象
		
		FotoApparat fotoApparat2 = new FotoApparat();
		fotoApparat2.setBrennweiten(18, 200);
		fotoApparat2.setBildStabilisiert(true);
		fotoApparat2.setDisplayGroesse(7.5);
		fotoApparat2.setMarke("NIKANG");
		fotoApparat2.setMagePixel(18);
		
		// 交换对象的创建过程
		Objektiv objektiv = fotoApparat.getObjektiv();
		fotoApparat.setObjektiv(fotoApparat2.getObjektiv());
		fotoApparat.setObjektiv(objektiv);
	}

	@Override
	public String toString() {
		return "FotoSchooting [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
	
}
