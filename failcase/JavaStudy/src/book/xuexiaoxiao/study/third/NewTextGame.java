package book.xuexiaoxiao.study.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author predatory+
 * 	������Ϸ���������жϣ����ƶ�4���н���
 *
 */
public class NewTextGame {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello " + args[0] + "��ӭ����ħ�����磬�����������ִ�.");
		System.out.println("ʹ�á� N������ O������ S���͡� W�����ƶ���" + 
				"�͡�i�����鿴���Ŀ��");
		System.out.println("���š� Q�������뿪��Ϸ.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		while((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Do gehst nach Norden.������������");
				break;
			case "o":
				System.out.println("Do gehst nach Osten.������������");
				break;
			case "s":
				System.out.println("Do gehst nach Suden.������������");
				break;
			case "w":
				System.out.println("Do gehst nach Westen.����������");
				break;
			case "q":
				System.out.println("�����Ҫ�������� y/n ");
				String bestaetigungString = br.readLine();
				switch (bestaetigungString.toLowerCase()) {
				case "y":
					System.out.println("Und Tashuss.�˳�");
					System.exit(0);
				case "n":
					System.out.println("Finde ich prima.���˳���������Ϸ");
					break;
				}
				break;
			case "":
				System.out.println("Du willst gar nichts machen? Das glaube ich nicht.�㲻����ʲô�� �Ҳ�����");
				break;
			case "i":
				System.out.println("Da du noch nicht die Weisheit der Aray-kundigen Sammler"
						+ "erlangt hast, defindet sich in deinem Inventar nur ein einziger"
						+ "Gegenstand ein Holzschwert,��������δ�˽⾫ͨAray���ղؼҵ��ǻۣ�" + 
						"+���Ŀ����ֻ��һ��ʹһ��ľ�� ");
					
			default:
				System.out.println("Das verstehe ich nicht.�Ҳ�������� ");
			}
			
			
		}
		

	}
	
	public static void test() {
		// ��ӡ�ʹ�
		final int breite = 17;
		final int healfteBreite = (breite-1)/2;
		final int hoehe = healfteBreite;
		final int letzteReihe = hoehe-1;
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				switch (i) {
				case 0:
					System.out.println((j==0 || (j==healfteBreite || j==breite-1)) ? "*" : "");
					break;
				case letzteReihe:
					System.out.println(8);
					break;
				default:
					System.out.println((j<i || j>healfteBreite-i && j<healfteBreite+i || j>breite-1) ? 0 : "");
					break;
				}
			}
			System.out.println();
		}
	}

}
