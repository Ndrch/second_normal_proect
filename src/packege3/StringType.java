package packege3;

import java.util.Scanner;

// написати програму, яка буде отримувати текст введений користувачем, 
// переводити його в нижній реєстр, 
// потім просити користувача ввести текст для пошуку - і повертати інформацію про те, 
// чи текст, введений користувачем спочатку, містить текст введений для пошуку.

public class StringType {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);

		System.out.println("VVedit text: ");
		String vvedText = skan.nextLine();

		String loverText = vvedText.toLowerCase();

		System.out.println("Vvedit text dla pochuku: ");

		String searchText = skan.nextLine();
		int number = 0;
		number = number + returnIndex(searchText, loverText);

		if (number == -1) {
			System.out.println("Vvedenyj text " + "'" + searchText + "'" + " ne mistytsja v osnovnomy texti");
		} else {
			System.out.println("Vvedenyj text " + "'" + searchText + "'" + " mistytsja v osnovnomy texti, jogo ID: " + number);
		}
		
		System.out.println("---------------------------------------------------");

		System.out.println("Vvedit ID symvola, jakyj vy shukaete, ce chyslo vid '0' do " + "'" + returnLength(loverText) + "'");
		int number2 = skan.nextInt();
		char b = returnSymbol(loverText, number2);

		System.out.println("Pid ID nomerom " + number2 + " znahodytsja symvol: " + "'" + b + "'");

		if (b == ' ') {
			System.out.println("Use virno, ' ' - probil");
		}

	}

	public static int returnIndex(String searchText, String loverText) {
		int number = loverText.indexOf(searchText);
		return number;
	}

	public static int returnLength(String loverText) {
		int length = loverText.length();
		return length;
	}

	public static char returnSymbol(String loverText, int number2) {
		char a = loverText.charAt(number2);
		return a;

	}

}
