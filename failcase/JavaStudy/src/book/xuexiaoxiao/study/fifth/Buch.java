package book.xuexiaoxiao.study.fifth;

/**
 * 	创建一个书（Buch）的类，应该包含的属性有书名（Titel)、作者（Autor）、页数（Seitenanzahl）和
 * 	是不是精装书（gebunden）。此外还要设置最少页数为49，最多页数设置为50 560。还有一个阅读方法
*/
public class Buch {
	private String titel;
	private String autor;
	private int seitenanzhl;
	private boolean gebunden;
	public static final int PAGE_MIN = 49;
	public static final int PAGE_MAX = 50560;
	
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getSeitenanzhl() {
		return seitenanzhl;
	}
	public void setSeitenanzhl(int seitenanzhl) {
		if(seitenanzhl <= PAGE_MAX && seitenanzhl >= PAGE_MIN) {
			this.seitenanzhl = seitenanzhl;
		}else {
			System.err.println("页数设置错误");
		}
	}
	public boolean isGebunden() {
		return gebunden;
	}
	public void setGebunden(boolean gebunden) {
		this.gebunden = gebunden;
	}
	
	public void readBook() {
		System.out.println("书名是：" + this.getTitel() + ",作者是：" + this.autor);
	}
	
}
