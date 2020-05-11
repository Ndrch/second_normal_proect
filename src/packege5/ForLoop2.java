package packege5;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("Vvedit slovo: ");
		String slovo  = skan.nextLine();
		
		for (int i = slovo.length() - 1; i >=0; i--) {
			System.out.print(slovo.substring(i, i + 1));
		}
				
	}

}
