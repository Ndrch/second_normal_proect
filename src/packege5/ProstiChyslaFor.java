package packege5;

import java.util.Scanner;

/**
 * class prosti chysla, v diapazoni zadanomy korystuvachem
 * 
 * @author Bart
 *
 */
public class ProstiChyslaFor {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		int vvedenja, vvedenja1;
		int min = 0, max = 0;

		System.out.println("Vvedit pochatok diapazonu: ");
		vvedenja = skan.nextInt();
		min = returnDiapazon(vvedenja);

		System.out.println("Vvedit kinec diapazonu: ");
		vvedenja = skan.nextInt();
		max = returnDiapazon(vvedenja);
		
		System.out.println("Zadanyj diapazon: " + min + "..." + max);
		
		for (int min1 = 1; min1 <= max; min1++) {
		
			}
		}	
	/**
	 * metod povertae pochatok/kinec diapazonu
	 * 
	 * @param vvedenja - chysla vvedenyj korystuvachem
	 * @return znachennja pochatok/kinec diapazonu
	 */
	public static int returnDiapazon(int vvedenja) {
		int vvedenja1 = vvedenja;
		return vvedenja1;
	}

}
