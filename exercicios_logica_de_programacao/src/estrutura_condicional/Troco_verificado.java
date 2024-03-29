package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Troco_verificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade;
		double precoProduto;
		double dinheiroRecebido;
		double troco;
		double faltam;
		System.out.println("Pre�o unit�rio do produto: ");
		precoProduto = sc.nextDouble();
		System.out.println("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.println("Dinheiro Recebido: ");
		dinheiroRecebido = sc.nextDouble();

		if (dinheiroRecebido >= precoProduto * quantidade) {
			troco = dinheiroRecebido - (precoProduto * quantidade);
			System.out.println("TROCO = " + String.format("%.2f", troco));
		} else {
			faltam = precoProduto * quantidade - dinheiroRecebido;
			System.out.println("Dinheiro insuficiente.Faltam " + String.format("%.2f", faltam) + " REAIS");
		}

		sc.close();
	}

}

//Problema "troco_verificado" 
//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
//O programa deve ler o pre�o unit�rio do produto, a quantidade de unidades compradas deste produto, 
//e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido 
//ao cliente. Se o dinheiro dado pelo cliente n�o for suficiente, mostrar uma mensagem informando o 
//valor restante conforme exemplo. 
//Exemplo 1: 
//Pre�o unit�rio do produto: 8.00
//Quantidade comprada: 2
//Dinheiro recebido: 20.00
//TROCO = 4.00 