package oblig;

import java.util.Scanner;

public class Karakter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gi poeng i heltall [0-100]");
		
		for (int i = 0; i < 10; i++) {
			int poeng = Integer.valueOf(scan.nextLine());
			boolean gyldig = false;
		
			if (poeng >= 0 && poeng <= 100) {
				gyldig = true;
			}
			
			// Låser inn brukeren hvis ugyldig poengsum
			while (gyldig == false) {
				System.out.println("Ugyldig poengsum.");
				System.out.println("Skriv på nytt: ");
				int x = Integer.valueOf(scan.nextLine());
				
				if (x >= 0 && x <= 100) {
					gyldig = true;
				}

			}
			
			// Karakterene
			if (poeng < 40) {
				System.out.println("Karakter: F");
			} else if (poeng >= 40 && poeng < 50) {
				System.out.println("Karakter: E");
			} else if (poeng >= 50 && poeng < 60) {
				System.out.println("Karakter: D");
			} else if (poeng >= 60 && poeng < 80) {
				System.out.println("Karakter: C");
			} else if (poeng >= 80 && poeng < 90) {
				System.out.println("Karakter: B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter: A");
			}
			
			
		}
		

	}

}
