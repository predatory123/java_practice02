package book.xuexiaoxiao.study.fifth;

import book.xuexiaoxiao.study.fifth.*;
public class Objektiv  {
	private int brennweiteMin;
	private int brennweiteMax;

	public Objektiv(int brennweiteMin, int brennweiteMax) {
		this.setBrennweiten(brennweiteMin,brennweiteMax);
	}
	
	public int getBrennweiteMin() {
		return brennweiteMin;
	}
	
	public int getBrennweiteMax() {
		return brennweiteMax;
	}
	
	public void setBrennweiten(int brennweiteMin, int brennweiteMax) {
		if(brennweiteMin < brennweiteMax) {
			this.brennweiteMax = brennweiteMax;
			this.brennweiteMin = brennweiteMin;
		}else {
			System.err.println("³ö´íÀ²£¡");
		}
	}
	
//	public static void main(String[] args) {
//		FotoApparat fotoApparat = new FotoApparat();
//		fotoApparat.setObjektiv(new Objektiv(18, 100));
//		fotoApparat.setBildStabilisiert(true);
	}
	
}
