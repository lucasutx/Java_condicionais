import java.util.Scanner;

/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 * Faça um algoritmo que segundo uma nota informada pelo usuário, verifique em qual faixa
 * a mesma se encaixa e imprima para o usuário a mensagem correspondente
 */
public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int nota;
		
		//Leitura dos dados do usuário
		System.out.print("Digite sua nota:");
		nota=teclado.nextInt();
		
		
		//Condições e Saída para os usuários
		if(nota>= 8 && nota <=10 )
		{
			System.out.println("Ótimo");
		}else if(nota >= 7 && nota<8)
		{
			System.out.println("Bom");
		}else if(nota >= 5 && nota < 7)
		{
			System.out.println("Regular");
		}else if(nota<5){
			System.out.println("Insatisfatório");
		}else {
			System.out.println("As notas permitidas são apenas entre 0 a 10");
		}
		
		
		teclado.close();

	}

}