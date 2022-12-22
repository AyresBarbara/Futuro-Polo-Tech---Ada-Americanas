package atvModulo2;

public class Cliente {
	
	private String nome;
	private Conta conta;
	
	
	public String getNome() {
		return nome;
	}


	public Conta getConta() {
		return this.conta;
	}

	public Cliente(String nome) {
		
		this.nome = nome;
		this.conta = new Conta(this);
		
	}
	public String toString(){
		return "O cliente " + this.getNome()+ " tem o saldo igual: "+ this.getConta().getSaldo();
	}

}
