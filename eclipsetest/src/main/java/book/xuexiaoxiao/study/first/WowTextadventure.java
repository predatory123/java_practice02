package book.xuexiaoxiao.study.first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author predatory
  *  ÎÄ×ÖÐ¡ÓÎÏ·
 */
public class WowTextadventure {

	public static void main(String[] args) throws IOException{
		System.out.println("Hello " + args[0] + "willkomen in der World of"
				+ "Warcraft. Du befindest dich im Dorf Bxuelknuxel.");
		System.out.println("Verwende die Tasten 'N' 'O' 'S' und 'W', um dich zu bewegen,"
				+ "und 'I', um einen Blick in dein Inventar zu werfen.");
		System.out.println("Mit 'Q' verlasst du das Spies.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String befehl;
		while((befehl = br.readLine()) != null) {
			switch (befehl.toLowerCase()) {
			case "n":
				System.out.println("Do gehst nach Norden.");
				break;
			case "o":
				System.out.println("Do gehst nach Osten.");
				break;
			case "s":
				System.out.println("Do gehst nach Suden.");
				break;
			case "w":
				System.out.println("Do gehst nach Westen.");
				break;
			case "q":
				System.out.println("Willst du wirklich schon aufgeben? Y/N");
				String bestaetigungString = br.readLine();
				switch (bestaetigungString.toLowerCase()) {
				case "y":
					System.out.println("Und Tashuss");
					System.exit(0);
				case "n":
					System.out.println("Finde ich prima.");
					break;
				}
				break;
			case "":
				System.out.println("Du willst gar nichts machen? Das glaube ich nicht.");
				break;
			case "i":
				System.out.println("Da du noch nicht die Weisheit der Aray-kundigen Sammler"
						+ "erlangt hast, defindet sich in deinem Inventar nur ein einziger"
						+ "Gegenstand ein Holzschwert,");
					
			default:
				System.out.println("Das verstehe ich nicht.");
			}
		}

	}

}
