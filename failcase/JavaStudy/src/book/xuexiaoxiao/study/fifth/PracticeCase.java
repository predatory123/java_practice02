package book.xuexiaoxiao.study.fifth;

public class PracticeCase {
	public static void main(String[] args) {
		System.out.println(name("jake"));
		System.out.println(sageWetterVoraus(1, "window"));
	}
	
	public static String name(String name) {
		return name;
	}
	
	// 天气预报代码修改，只返回一个值
//	private static String sageWetterVoraus(int monat, String land) {
//		String vorhersage = "Regen mit Graupel";
//		if ("Deutschland".equals(land)) {
//			return "Absolut nicht vorhersehbar.";
//		}else if (monat >= 5 && monat <= 9) {
//			return "Wahrscheinlich ganz gut.";
//		}
//		return vorhersage;
//	}
	
	private static String sageWetterVoraus(int monat, String land) {
		String vorhersage = "Regen mit Graupel";
		if ("Deutschland".equals(land)) {
			vorhersage = "Absolut nicht vorhersehbar.";
		}else if (monat >= 5 && monat <= 9) {
			vorhersage = "Wahrscheinlich ganz gut.";
		}
		return vorhersage;
	}
}
