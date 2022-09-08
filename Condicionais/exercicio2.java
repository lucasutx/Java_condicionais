import java.util.Scanner;

/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 * Faça um algoritmo que leia 2 números inteiros e faça sua adição. Se o resultado for maior
 *	ou igual a 10, some 5 a este número. Caso contrário some 7 a ele. Imprima o resultado
 *	final.
 */
public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int num1,num2,adi;
		
		//Leitura dos dados do usuário
		System.out.print("Digite seus respectivos números:");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		
		//Adição
		adi=num1+num2;
		
		
		//Condições
		if(adi >= 10) 
		{
			adi=adi+5;
			System.out.println("Somado a 5 é: "+adi);
		}else 
		{
			adi=adi+7;
			System.out.println("Somado a 7 é: "+adi);
		}
		
		teclado.close();

	}

}
