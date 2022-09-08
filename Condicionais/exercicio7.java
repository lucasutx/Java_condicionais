import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 * Descobrir o valor Y, dado um número X
 */

public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		//Declaração das variáveis
		int x,quadrado;
		double cubo;
		
		//Leitura de dados do usuário
		System.out.println("Digite o valor de x:");
		x=teclado.nextInt();
		
		//condicionais
		if(x <= 1)
		{
			System.out.println("O valor de y é: 1");
		}else if(x>1 && x<=2)
		{
			System.out.println("O valor de y é:2");
		}else if(x>2 && x<=3)
		{
			quadrado = x*x;
			System.out.println("O valor de y é:"+quadrado);
		}else if(x>3)
		{
			cubo=Math.pow(x,3);
			System.out.println("O valor de y é:"+cubo);
		}
		
		
		
		
		teclado.close();

	}

}
