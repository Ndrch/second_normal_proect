package packege4;

import java.util.Scanner;

public class SerednieAryamDoWhile {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		double chyslo = 0, suma = 0, serednie = 0;
		int kilkist = 0;
		String vvedenja = "0.0";
		do {

			System.out.println("Vvedit chyslo, abo '.' chob zupynytys");
			vvedenja = skan.nextLine();
			if (vvedenja.equals(".")) {
				break;
			}
			suma = suma + returnChyslo(vvedenja);
			kilkist++;

		} while (!vvedenja.equals("."));
		
		System.out.println("Serednie z " + kilkist + " chysel stanovyt: " + returnSerednie(suma, kilkist));

	}

	public static double returnChyslo(String vvedenja) {
		double chyslo = Double.parseDouble(vvedenja);
		return chyslo;
	}

	public static double returnSerednie(double suma, int kilkist) {
		double serednie = suma / kilkist;
		return serednie;
	}
}
