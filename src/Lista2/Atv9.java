package Lista2;

public class Atv9 {
	
	public static void main(String[] args) {
		
	    double populacaoA = 80000; // População do país A
	    double taxaCrescimentoA = 0.03; // Taxa de crescimento do país A
	    double populacaoB = 200000; // População do país B
	    double taxaCrescimentoB = 0.015; // Taxa de crescimento do país B

	    int anos = 0; // Armazena o número de anos necessários

	    // Enquanto a população do país A for menor que a do país B
	    while (populacaoA < populacaoB) {
	      // Aumenta a população do país A de acordo com a taxa de crescimento
	      populacaoA += populacaoA * taxaCrescimentoA;
	      // Aumenta a população do país B de acordo com a taxa de crescimento
	      populacaoB += populacaoB * taxaCrescimentoB;
	      // Incrementa o número de anos
	      anos++;
	    }

	    // Exibe o resultado
	    System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
	  }
	
}
