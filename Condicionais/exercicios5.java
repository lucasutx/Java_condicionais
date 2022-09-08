import java.util.Scanner;

/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 * Descobrir valores de diárias com preço promocional e ocupações
 */
public class exercicios5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		double diaria;
		double opc1,opc2,opc3,opc4;
		int opcoes;
		double numap=75;
		
		
		//Leitura do valor da diária
		System.out.print("Digite o valor da diária:");
		diaria=teclado.nextDouble();
		
		//Condição com Switch
		System.out.println("Digite 1- Para ver o valor da diária promocional,"
				+ "Digite 2 - O valor total arrecadado com 80% de ocupação e diária promocional,"
				+ "Digite 3 - 0 valor total arrecadado com 50% de ocupação e diária normal,"
				+ "Digite 4 - .A diferença entre estes dois valores ");
		opcoes=teclado.nextInt();
		
		switch(opcoes)
		{
		case 1: 
				opc1=diaria-(diaria*0.25);
				System.out.println("O valor da diária com valor promocional é:"+opc1);
				break;
		case 2:
			numap=(numap*0.8);
			opc2=(diaria-(diaria*0.25))*numap;
			System.out.println("O valor com 80% de ocupação é diária promocional é:"+opc2);
			break;
			
		case 3:
			numap=numap*0.5;
			opc3=diaria*numap;
			System.out.println(" 0 valor total arrecadado com 50% de ocupação e diária normal é:"+opc3);
			break;
			
		case 4:
			
			opc2=numap=(numap*0.8);
			opc2=(diaria-(diaria*0.25))*numap;
			
			
			numap=37.5;
			opc3=diaria*numap;
			
			
			opc4= opc2-opc3;
			
			System.out.println("A diferença é:"+opc4);
			break;
			default:
				System.out.println("Escolha entre 1 e 4");
		}
		
		
	
		
		teclado.close();

	}

}