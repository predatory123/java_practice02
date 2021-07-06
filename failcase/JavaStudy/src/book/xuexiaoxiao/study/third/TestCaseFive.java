package book.xuexiaoxiao.study.third;

/**
 * 	��ӡ����
 * @author predatory
 *
 */
public class TestCaseFive {

	public static void main(String[] args) {
		testCalendar();

	}
	
	public static void testCalendar() {
		int monat = 6;
		int startTag = 2;
		if(monat >= 0 && monat <= 11 && startTag >= 0 && startTag <= 6) {
			int tage;
			switch (monat) {
				case 0: case 2: case 4: case 6: case 7: case 9: case 11:
					tage = 31;
					break;
				case 1:
					tage = 28;
					break;
				default:
					tage = 30;
			}
			System.out.println("|MD|DI|MI|DO|FR|SA|SO");
			int wochen = (tage + startTag) > 35 ? 6 : 5;
			for (int woche = 1; woche <= wochen; woche++) {
				for (int tag = 1; tag <=7; tag++) {
					int datum = tag + (woche-1)*7 - startTag;
					if (datum > 0 && datum <= tage) {
						// print�����Ĳ�����ʾ������ڣ���du�������궨zhiλ������ʾ�����һ���ַ�֮��
						// println �����Ĳ�����ʾ������ڣ����ڽ�β���ϻ��з����������궨λ����һ�еĿ�ʼ��
						System.out.print("|" + ((datum < 10) ? " " : "") + datum);
					}else {
						System.out.print("|  ");
					}
				}
				System.out.println("|  ");				
			}
		}
	}

}
