package oblig;

import java.util.Scanner;

public class Fakultet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gi et heltall: ");
		int x = scan.nextInt();
        int sum = 1;
        
        for(int i = 1; i <= x; i++) {
            sum *= i;
        }
        
        System.out.println("Fakultetet av tallet " + x + " er " + sum);

	}

}
