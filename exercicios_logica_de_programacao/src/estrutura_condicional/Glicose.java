package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida da glicose: ");
		double medida = sc.nextDouble();
		if (medida <= 100) {
			System.out.println("Classificação: Normal");
		} else if (medida <= 140) {
			System.out.println("Classificação: Elevado");
		} else {
			System.out.println("Classificação: Diabetes");
		}

		sc.close();
	}

}
