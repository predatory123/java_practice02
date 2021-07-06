package book.xuexiaoxiao.study.fifth;

/**
 * 	����һ���飨Buch�����࣬Ӧ�ð�����������������Titel)�����ߣ�Autor����ҳ����Seitenanzahl����
 * 	�ǲ��Ǿ�װ�飨gebunden�������⻹Ҫ��������ҳ��Ϊ49�����ҳ������Ϊ50 560������һ���Ķ�����
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
			System.err.println("ҳ�����ô���");
		}
	}
	public boolean isGebunden() {
		return gebunden;
	}
	public void setGebunden(boolean gebunden) {
		this.gebunden = gebunden;
	}
	
	public void readBook() {
		System.out.println("�����ǣ�" + this.getTitel() + ",�����ǣ�" + this.autor);
	}
	
}
