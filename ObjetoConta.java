package aula9;

import java.util.Scanner;

public class ObjetoConta {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		//saldo inicial
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		// saque
		System.out.println("Informe o valor que deseja sacar: ");
		conta.sacar(ler.nextDouble());
		
		//mostrar saldo após o saque
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		// depósito
		System.out.println("Informe o valor que deseja depositar: ");
		conta.depositar(ler.nextDouble());
		
		//mostrar após saque
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		ler.close();
	}

}
