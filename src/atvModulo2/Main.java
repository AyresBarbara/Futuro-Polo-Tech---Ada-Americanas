package atvModulo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente("Fernanda");
		Cliente cliente2 = new Cliente("João");
		
		cliente1.getConta().depositar(1200);
		cliente2.getConta().depositar(1000);
		
		cliente1.getConta().sacar(50);
		cliente2.getConta().sacar(1300);
		
		cliente1.getConta().transferir(100, cliente2);
		cliente1.getConta().getSaldo();
		
		System.out.println(cliente1);
	}

}
