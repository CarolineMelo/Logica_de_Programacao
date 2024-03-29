package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double aPagar = 0;

		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		switch (codigo) {
		case 1:
			aPagar = 5.00 * quantidade;
			break;
		case 2:
			aPagar = 3.50 * quantidade;
			break;

		case 3:
			aPagar = 4.80 * quantidade;
			break;
		case 4:
			aPagar = 8.90 * quantidade;
			break;
		case 5:
			aPagar = 7.32 * quantidade;
			break;
		default:
			System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 a 5.");

		}

		System.out.println("Valor a pagar: " + String.format("%.2f", aPagar));

		sc.close();

	}

}