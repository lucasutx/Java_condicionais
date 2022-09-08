import java.util.Scanner;

/*
 * Lucas Xavier Bitencourt
 * Objetivo:Mostrar o maior número entre dois
 */
public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int num1,num2;
		
		//Leitura dos dados do usuário
		System.out.print("Digite seus respectivos números:");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		
		//Condições
		if(num1>num2) 
		{
			System.out.println("O maior número é: "+num1);
		}else 
		{
			System.out.println("O maior número é: "+num2);
		}
		
		teclado.close();

	}

}
