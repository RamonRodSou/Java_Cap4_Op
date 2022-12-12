package Operadores;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o Primeiro numero ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite [1 para + ] [2 para - ] [3 para X ] [4 para / ]");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite o Segundo numero ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
	 if (operacao.equals(1)){
			 resultado = primeiroNumero + segundoNumero;
	 }
	 if (operacao.equals(2)) {
		 resultado = primeiroNumero - segundoNumero;
	 }
	 if (operacao.equals(3)) {
		 resultado = primeiroNumero * segundoNumero;
	 }
	 if (operacao.equals(4)) {
		 resultado = primeiroNumero / segundoNumero;
	 }
	 
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}
}
