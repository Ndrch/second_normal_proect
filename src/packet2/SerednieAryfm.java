package packet2;

import java.util.Scanner;

public class SerednieAryfm {

	public static void main(String[] args) {
		
		Scanner skan = new Scanner(System.in);
		int chyslo = 0, suma = 0, kilkist = 0, serednje = 0;
		while (kilkist<3)
		{
			System.out.println("Vvedit chyslo");
			chyslo = skan.nextInt();
			suma = suma + chyslo;
			kilkist++;
			
		}
		serednje = suma/kilkist;
		System.out.println("serednje: " + serednje);

	}

}
