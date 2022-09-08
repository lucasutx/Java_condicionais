import java.util.Scanner;
/*
 * Lucas Xavier Bitencourt
 * Objetivo:Mostrar o resultado da equação do 1° grau
 */

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int coe1,coe2;
		double resul;
		
		//Lendo dados do usuário
		System.out.println("Digite o coeficiente da A da equação e o coeficiente B:");
		coe1=teclado.nextInt();
		coe2=teclado.nextInt();
		
		//Condicionais
		switch(coe1)
		{
		case 0:
			System.out.println("Coeficiente A tem que ser diferente de 0");
			break;
		}
		
		if(coe1 != 0) 
		{
			if (coe1 < 0 && coe2 < 0) {
				resul=(coe2/-coe1);
				System.out.printf("O resultado da equação é:%.0f ",resul);
			}
			 if(coe1>0 &&coe2 > 0) {
			resul = (-coe2/coe1);
			System.out.printf("O resultado da equação é:%.0f ",resul);
			}  if(coe1>0 && coe2 < 0) 
			{
				resul= -1*(coe2/coe1);
				System.out.printf("O resultado da equação é: %.0f",resul );
			}  if(coe1<0 && coe2> 0) 
			{
				resul= -1*(-coe2/-coe1);
				System.out.printf("O resultado da esquação é: %.0f",resul);
			}
		}
		
		teclado.close();

	}

}
