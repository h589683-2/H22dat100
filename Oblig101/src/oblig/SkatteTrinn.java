package oblig;
import java.util.Scanner;

public class SkatteTrinn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv inn brutto inntekt: ");
		int inntekt = scan.nextInt();
		double skatt = 0;
		
		if (inntekt <= 190349) {
			System.out.println("Trinn 0, ingen skatt");
		} else if (inntekt >= 190350 && inntekt < 267900) {
			skatt = (inntekt - 190349) * 0.017;
			System.out.println("Trinn 1, Skatt: " + skatt);
			
		} else if (inntekt >= 267900 && inntekt < 643800) {
			skatt = (inntekt - 190349) * 0.04;
			System.out.println("Trinn 2, Skatt: " + skatt);
			
		} else if (inntekt >= 643800 && inntekt < 969200) {
			skatt = (inntekt - 190349) * 0.134;
			System.out.println("Trinn 3, Skatt: " + skatt);
			
		} else if (inntekt >= 969200 && inntekt < 2000000) {
			skatt = (inntekt - 190349) * 0.164;
			System.out.println("Trinn 4, Skatt: " + skatt);
			
		} else if (inntekt >= 2000000) {
			skatt = (inntekt - 190349) * 0.174;
			System.out.println("Trinn 5, Skatt: " + skatt);
		}

	}

}
