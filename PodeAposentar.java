package Operadores;

import java.util.Scanner;

public class PodeAposentar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
	
		System.out.print("Digite sua idade ");
		Double idade = scanner.nextDouble();
		
		System.out.print("Digite tempo de contribuição ");
		Double tempoDeContribuicao = scanner.nextDouble();
		
		Boolean idadeParaAposentar = idade >= 55 ;
		Boolean tempoDeContribuicaoAposentar = tempoDeContribuicao >= 25 ;
	
		Boolean aposentar = tempoDeContribuicaoAposentar && idadeParaAposentar;
		
		if(aposentar) {
			
			aposentar = true;
			System.out.println("Parabens você pode se aposentar!");
		}
		else {
			System.out.println("Infelizmente você não pode se aposentar");
		}
	
		scanner.close();
	
	}
}
