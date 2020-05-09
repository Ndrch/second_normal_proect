package packet2;

import java.util.Scanner;

public class BattleOfNumbers {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		String vvedenja = "0.0";
		double chyslovved = 0, chysloPl = 0, chysloMn = 0, sumaPl = 0, sumaMn = 0;
		int kilkistPl = 0, kilkistMn = 0;

		System.out.println("Vvedit chyslo, abo 'e' dlja zavershennja");
		vvedenja = skan.nextLine();
		while (!vvedenja.equals("e")) {

			chyslovved = Double.parseDouble(vvedenja);

			if (chyslovved >= 0) {
				sumaPl = sumaPl + dodatni(chyslovved);
				kilkistPl++;
				
			} else {
				sumaMn = sumaMn + vidjemni(chyslovved);
				kilkistMn++;
			}
			System.out.println("Vvedit chyslo, abo 'e' dlja zavershennja");
			vvedenja = skan.nextLine();
		}
		if (kilkistPl > kilkistMn) {
			System.out.println("Kilkist dodatnih > kilkist vidjemnyh: " + kilkistPl + ">" + kilkistMn);
		} else {
			System.out.println("kilkist dodatnih < kilkist vidjemnuh: " + kilkistPl + "<" + kilkistMn);
		}
		if (sumaPl + sumaMn > 0) {
			System.out.println("suma dodatnih > suma vidjemnyh: " + sumaPl + ">" + sumaMn);
		} else {
			System.out.println("suma do9datnih < suma vidjemnyh: " + sumaPl + "<" + sumaMn);
		}
	}

	public static double dodatni(double chyslovved) {
		double sumaPl = 0.0;
		sumaPl = sumaPl + chyslovved;
		return sumaPl;
	}

	public static double vidjemni(double chyslovved) {
		double sumaMn = 0.0;
		sumaMn = sumaMn + chyslovved;
		return sumaMn;
	}

}
