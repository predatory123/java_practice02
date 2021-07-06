package book.xuexiaoxiao.study.fifth;

// 1.����һ���ɹ�FotoSchooting���õ���
// 2.����getter��setter�����������������Ч�ԣ�brennweiteMax��ֵҪ����brennweiteMin
// 3.�����������setter
public class FotoApparat {
	private int magePixel;
	private double displayGroesse;
	private boolean bildStabilisiert;
	private String marke;
	int brennweiteMin;
	int brennweiteMax;
	private String herstellungsLand;	
	private Objektiv objektiv;
	// ���峣��
	public static final int MIN_BRENNEEITE = 10;
	public static final int MAX_BRENNEEITE = 270;
	
	public FotoApparat() {
		
	}

	public void machFoto() {
		System.out.println("Klick.");
	}

	public int getMagePixel() {
		return magePixel;
	}

	public void setMagePixel(int magePixel) {
		this.magePixel = magePixel;
	}

	public double getDisplayGroesse() {
		return displayGroesse;
	}

	public void setDisplayGroesse(double displayGroesse) {
		this.displayGroesse = displayGroesse;
	}

	public boolean isBildStabilisiert() {
		return bildStabilisiert;
	}

	public void setBildStabilisiert(boolean bildStabilisiert) {
		this.bildStabilisiert = bildStabilisiert;
	}

	public String getMarke() {
		return marke;
	}
//
//	public void setMarke(String marke) {
//		this.marke = marke;
//	}
	// ��̬���ض������ֵ
	public FotoApparat setMarke(String marke) {
		this.marke = marke;
		return this;
	}
	
	public int getBrennweiteMin() {
		return brennweiteMin;
	}

	public int getBrennweiteMax() {
		return brennweiteMax;
	}
	
	public void setBrennweiteMin(int brennweiteMin) {
		if(this.brennweiteMax >= brennweiteMin) {
			this.brennweiteMin = brennweiteMin;
		}else {
			System.err.println("FALSE! brennweiteMin > brennweiteMax");
		}
	}

	public void setBrennweiteMax(int brennweiteMax) {
		if (this.brennweiteMin <= brennweiteMax) {
			this.brennweiteMax = brennweiteMax;
		}else {
			System.err.println("������");
		}
	}
	
	public void setBrennweiten(int brnnweitrMin, int brnnweitrMax) {
		if (brennweiteMin <= brennweiteMax) {
			this.brennweiteMin = brennweiteMin;
			this.brennweiteMax = brennweiteMax;
		}else {
			System.err.println("����������Сֵ�����ֵ����");
		}
	}


	public String getHerstellungsLand() {
		return herstellungsLand;
	}

	public void setHerstellungsLand(String herstellungsLand) {
		this.herstellungsLand = herstellungsLand;
	}

	public FotoApparat(int magePixel, double displayGroesse, boolean bildStabilisiert, String marke, int brennweiteMin,
			int brennweiteMax, String herstellungsLand) {
		super();
		this.magePixel = magePixel;
		this.displayGroesse = displayGroesse;
		this.bildStabilisiert = bildStabilisiert;
		this.marke = marke;
		this.brennweiteMin = brennweiteMin;
		this.brennweiteMax = brennweiteMax;
		this.herstellungsLand = herstellungsLand;
//		this.objektiv = objektiv;
		// ���������ĸ�ֵ
//		this.setBrennweiten(brnnweitrMin, brnnweitrMax);
		this.setBrennweiten(10, 200);
	}

	public Objektiv getObjektiv() {
		return objektiv;
	}

	public void setObjektiv(Objektiv objektiv) {
		this.objektiv = objektiv;
	}

	@Override
	public String toString() {
		return "FotoApparat [magePixel=" + magePixel + ", displayGroesse=" + displayGroesse + ", bildStabilisiert="
				+ bildStabilisiert + ", marke=" + marke + ", brennweiteMin=" + brennweiteMin + ", brennweiteMax="
				+ brennweiteMax + ", herstellungsLand=" + herstellungsLand + "]";
	}
	

}
