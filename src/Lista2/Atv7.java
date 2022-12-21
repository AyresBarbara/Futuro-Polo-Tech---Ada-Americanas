package Lista2;

import java.util.Scanner;

public class Atv7 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler os dados

	    String[] nomes = new String[5]; // Cria um array de nomes com tamanho 5
	    int[] idades = new int[5]; // Cria um array de idades com tamanho 5
	    int idadeTotal = 0; // Armazena a soma das idades

	    // Lê os nomes e idades de cada pessoa
	    for (int i = 0; i < 5; i++) {
	      System.out.print("Informe o nome da pessoa " + (i+1) + ": ");
	      nomes[i] = scanner.nextLine();

	      System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
	      idades[i] = scanner.nextInt();
	      scanner.nextLine(); // Consome a quebra de linha do Scanner

	      idadeTotal += idades[i]; // Adiciona a idade lida à soma total
	    }

	    // Encontra o índice da pessoa mais nova e mais velha
	    int indiceMaisNovo = 0;
	    int indiceMaisVelho = 0;
	    for (int i = 1; i < 5; i++) {
	      if (idades[i] < idades[indiceMaisNovo]) {
	        indiceMaisNovo = i;
	      }
	      if (idades[i] > idades[indiceMaisVelho]) {
	        indiceMaisVelho = i;
	      }
	    }

	    // Calcula a média de idade
	    double mediaIdade = (double) idadeTotal / 5;

	    // Exibe os resultados
	    System.out.println("A pessoa mais nova é " + nomes[indiceMaisNovo] + " com " + idades[indiceMaisNovo] + " anos.");
	    System.out.println("A pessoa mais velha é " + nomes[indiceMaisVelho] + " com " + idades[indiceMaisVelho] + " anos.");
	    System.out.println("A média de idade é " + mediaIdade + " anos.");
	  }

}
