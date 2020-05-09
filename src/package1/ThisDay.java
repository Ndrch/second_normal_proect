package package1;

import java.util.Date;

public class ThisDay {

	public static void main(String[] args) {
		System.out.println(new Date() + " This day");
		System.out.println((new Date()).getDate());
		String[] srt = new String[] {};
		
		for(String s : srt ) {
			System.out.println(s);
		}
		
		System.out.println("int: " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
	}

}
