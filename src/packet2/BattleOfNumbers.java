package packet2;

import java.util.Scanner;

public class BattleOfNumbers {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		String vvedenja = "0.0";
		double chyslovved = 0, chysloPl = 0, chysloMn = 0, sumaPl = 0.0, sumaMn = 0.0;
		int kilkistPl = 0, kilkistMn = 0;
		
		System.out.println("Vvedit chyslo abo stop dlja zavershennja");
		vvedenja = skan.nextLine();		
		while (!vvedenja.equals("e")) {
							
			chyslovved = Double.parseDouble(vvedenja);
				
			if (chyslovved >= 0) {
				chysloPl = chyslovved;
				dodatni(chysloPl);
				kilkistPl++;
			}
			else {
				chysloPl = chyslovved;
				vidjemni(chysloMn);
				kilkistMn++;
			}
			System.out.println("Vvedit chyslo abo stop dlja zavershennja");
			vvedenja = skan.nextLine();
		}
		if (kilkistPl > kilkistMn) {
			System.out.println("Kilkist dodatnih > kilkist vidjemnyh");
		} else {
			System.out.println("kilkist dodatnih < kilkist vidjemnuh");
		}
		if (sumaPl + sumaMn > 0) {
			System.out.println("suma dodatnih > suma vidjemnyh");
		} else {
			System.out.println("suma dodatnih < suma vidjemnyh");
		}
	}

	public static double dodatni(double chysloPl) {
		double sumaPl = 0.0;
		sumaPl = sumaPl + chysloPl;
		return sumaPl;
	}
	public static double vidjemni(double chysloMn) {
		double sumaMn = 0.0;
		sumaMn = sumaMn + chysloMn;
		return sumaMn;
	}
	
}
