import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 * Exibe aumentos de acorod com o valor do salário
 */
public class exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		double salario;
		char opcao;
		
		//Leitura de dados do usuário
		System.out.println("Digite seu salário:");
		salario=teclado.nextDouble();
		
		//Caso do switch
		System.out.println("Escolha uma das opções:"
				+ "a - para aumento de 8% no salário,"
				+ "b - para aumento de 11% no salário,"
				+ "c - para aumento fixo no salário ");
		opcao=teclado.next().charAt(0);
		
		switch(opcao)
		{
		case 'a':
				salario=salario+(salario*0.08);
				System.out.println("Seu salário agora é:"+salario);
				break;
				
		case 'b':
			salario=salario+(salario*0.11);
			System.out.println("Seu salário agora é:"+salario);
			break;
			
		case 'c':		
			if(salario<=1000)
			{
				salario=salario+350;
				System.out.println("Seu salário é:"+salario);
			}else if(salario>1000)
			{
				salario=salario+200;
				System.out.println("Seu salário é:"+salario);
			}
			break;
			
			default:
				System.out.println("Escolha uma das opções citadas acima(com a letra minúscula)");
		}
		
		teclado.close();
	}

}
