package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double notaFinal;

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		notaFinal = nota1 + nota2;
		System.out.println("NOTA FINAL = " + notaFinal);
		if (notaFinal > 60) {
			System.out.println("Parab�ns! Voc� foi aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		sc.close();
	}

}
