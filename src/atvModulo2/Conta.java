package atvModulo2;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	private static int indConta = 1000;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.agencia = 101;
		this.saldo = 0;
		this.conta = indConta;
		indConta++;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDepositado) {
		if(valorDepositado > 0) {
			this.saldo = this.saldo + valorDepositado;
			System.out.println(this.cliente.getNome() + ", o seu saldo atual é: "+ this.saldo);
		}else {
			System.out.println(this.cliente.getNome() +", o valor a ser depositado tem que ser maior que R$0,00");
		}
	}

	public void sacar(double valorSacado) {
		if(this.saldo >= valorSacado && valorSacado > 0) {
			this.saldo = this.saldo - valorSacado;
			System.out.println(this.cliente.getNome() + ", o seu saldo atual é: "+ this.saldo);
		}else {
			System.out.println(this.cliente.getNome() +", valor de saque não permitido.");
		}
	}
	public void transferir(double valorTransferido, Cliente cliente ) {
		if(this.saldo >= valorTransferido && valorTransferido > 0) {
			this.saldo = this.saldo - valorTransferido;
			
			System.out.println(this.cliente.getNome() +", o valor transferido foi: " + valorTransferido);
			cliente.getConta().depositar(valorTransferido);
			
		} else {
			System.out.println(this.cliente.getNome() +", valor de transferência não permitido.");
		}
	}
}















