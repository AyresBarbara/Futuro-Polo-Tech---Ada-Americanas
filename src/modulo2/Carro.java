package modulo2;

public class Carro {

	
		String cor;
		String marca;
		String modelo;
		boolean isLigado;
		int velocidade;
		
		//Construtor - Auxilia a criação de objetos
		
		public Carro (String cor, String marca, String modelo) {
			this.cor= cor;
			this.marca = marca;
			this.modelo = modelo;
			this.isLigado = true;
			this.velocidade = 0;
			
		}
		
		public void desligar() {
			isLigado = false;
			
		}
		public void acelerar() {
			this.velocidade+=10;
			
			System.out.printf("Voce acelerou seu carro, sua velocidade é: %dkm/h", velocidade);
		}
		public void frear() {
			
			if(velocidade -10< 0) {
				velocidade=0;
			}else {
				
			velocidade-=10;
			}
			System.out.printf("Voce freou seu carro, sua velocidade é: %dkm/h", velocidade);
		}
		public void mostrarEstadoAtual() {
			System.out.printf("Voce freou seu carro, sua velocidade é: %dkm/h", velocidade);
		}
	// get/ is- buscar
		public String getModelo() {
			return this.modelo;
		}
		
	//set - adicionar
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

}
