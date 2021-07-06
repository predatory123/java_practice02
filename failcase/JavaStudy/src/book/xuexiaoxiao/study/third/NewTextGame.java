package book.xuexiaoxiao.study.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author predatory+
 * 	文字游戏增加条件判断，向北移动4次有奖励
 *
 */
public class NewTextGame {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello " + args[0] + "欢迎来到魔兽世界，你现在在新手村.");
		System.out.println("使用“ N”，“ O”，“ S”和“ W”键移动，" + 
				"和“i”来查看您的库存");
		System.out.println("随着“ Q”，你离开游戏.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		while((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Do gehst nach Norden.星期四往北走");
				break;
			case "o":
				System.out.println("Do gehst nach Osten.星期四往东走");
				break;
			case "s":
				System.out.println("Do gehst nach Suden.星期四往南走");
				break;
			case "w":
				System.out.println("Do gehst nach Westen.星期四西行");
				break;
			case "q":
				System.out.println("您真的要放弃了吗？ y/n ");
				String bestaetigungString = br.readLine();
				switch (bestaetigungString.toLowerCase()) {
				case "y":
					System.out.println("Und Tashuss.退出");
					System.exit(0);
				case "n":
					System.out.println("Finde ich prima.不退出，继续游戏");
					break;
				}
				break;
			case "":
				System.out.println("Du willst gar nichts machen? Das glaube ich nicht.你不想做什么？ 我不相信");
				break;
			case "i":
				System.out.println("Da du noch nicht die Weisheit der Aray-kundigen Sammler"
						+ "erlangt hast, defindet sich in deinem Inventar nur ein einziger"
						+ "Gegenstand ein Holzschwert,由于您尚未了解精通Aray的收藏家的智慧，" + 
						"+您的库存中只有一个使一把木剑 ");
					
			default:
				System.out.println("Das verstehe ich nicht.我不明白这个 ");
			}
			
			
		}
		

	}
	
	public static void test() {
		// 打印皇冠
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
