package serednieAryfm;

import java.util.Scanner;

public class serednieAryfm {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int chyslo = 0, suma = 0, kilkistChysel = 0, serednie = 0;

		while (kilkistChysel < 3) {
			System.out.println("Vvedit chyslo: ");
			chyslo = scan.nextInt();
			suma = suma + chyslo;
			kilkistChysel++;
		}
		serednie = suma / kilkistChysel;
		System.out.println("serednie znatchennja: " + serednie);

	}

}
