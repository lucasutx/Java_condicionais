import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo:Demonstração de simbolos por meio do switch
 */

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Declaração da variável
		char simbolo;
		
		//Leitura das informçãoes do usuário
		System.out.println("Escolha um dos simbolos: < , > , = , *");
		simbolo=teclado.next().charAt(0);
		
		//Caso switch
		switch(simbolo)
		{
			case '<':
				System.out.println("Sinal de MENOR");
				break;
			case '>':
				System.out.println("Sinal de MAIOR");
				break;
			case '=':
				System.out.println("Sinal de IGUAL");
				break;
			case '*':
				System.out.println("OUTRO SINAL");
				break;
				default:
					System.out.println("Escolha um dos simbolos citados acima");
		}
		
		
		teclado.close();
	}

}
