package Operadores;

import java.util.Scanner;

public class DescontoFrete100 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor do Produto ");
		Double valorDoProduto = scanner.nextDouble();
		
		Boolean desconto = valorDoProduto >= 100;
	    Double valorFinal = valorDoProduto;
				
		if(!desconto) {
			valorFinal += 10;
				}
		
		System.out.print("Valor Final " + valorFinal);
		scanner.close();
	}

}
