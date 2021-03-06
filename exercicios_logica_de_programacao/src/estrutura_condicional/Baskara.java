package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double coeficienteA;
		double coeficienteB;
		double coeficienteC;

		System.out.print("Coeficiente a: ");
		coeficienteA = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeficienteB = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		coeficienteC = sc.nextDouble();

		double delta = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

		if (coeficienteA == 0 || delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais.");
		} else {

			double x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
			double x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);

			System.out.println("x1 = " + String.format("%.4f", x1));
			System.out.println("x2 = " + String.format("%.4f", x2));

		}
		sc.close();
	}

}
