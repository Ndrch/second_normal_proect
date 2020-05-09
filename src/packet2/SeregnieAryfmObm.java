package packet2;

import java.util.Scanner;

public class SeregnieAryfmObm {

	public static void main(String[] args) {

		Scanner skan = new Scanner(System.in);
		String vvedennya = "0.0";
		double chyslo = 0, suma = 0, serednje = 0;
		int kilkist = 0;

		while (vvedennya.equals(".") != true) {
			chyslo = Double.parseDouble(vvedennya);
			suma = suma + chyslo;

			System.out.println("Vvedit chyslo, abo [.] chob zupynytys");
			vvedennya = skan.nextLine();
			kilkist++;

		}
		serednje = suma / --kilkist;
		System.out.println("seredje z " +kilkist+ " chysel stanovyt: " + serednje);

	}

}
