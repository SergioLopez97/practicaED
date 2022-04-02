package ejemplo;

import java.util.Scanner;

public class FicheroRama2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la frase que quieres analizar");
		String frase = sc.nextLine();
		int numVocales = 0;
		int numConsonantes=0;

		for (int i = 0; i < frase.length(); i++) {
			if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
					|| (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
				numVocales++;
			}
		}
		
		for (int i = 0; i < frase.length(); i++) {
			if ((frase.charAt(i) != 'a') || (frase.charAt(i) != 'e') || (frase.charAt(i) != 'i')
					|| (frase.charAt(i) != 'o') || (frase.charAt(i) != 'u')) {
				numConsonantes++;
			}
		}

		System.out.println("El numero de vocales que tiene la frase es:" + numVocales);
		System.out.println("El numero de consonantes que tiene la frase es:" + numConsonantes);
		sc.close();

	}

}
