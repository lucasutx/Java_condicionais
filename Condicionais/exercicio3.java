import java.util.Scanner;

/*
 * Lucas Xavier Bitencourt
 * Objetivo:
 *  Faça um algoritmo que leia o ano de nascimento de uma pessoa e calcule sua idade,
 *	considerando o ano atual. Para verificar se já fez aniversário no ano atual pergunte se a
 *	pessoa já fez aniversário, sendo que ela pode entrar com a informação "S"(sim) ou "N"
 *	(não). Com isto é possível se ter maior precisão sobre a idade. Verifique também se a
 *	pessoa já tem idade para conseguir Carteira de Habilitação (18 anos ou mais) e imprima a
 *	mensagem referente a esta checagem. Imprima a idade da pessoa
 */
public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaração das variáveis
		int anoNasc,idade;
		char resposta;
		
		
		//Leitura dos dados do usuário
		System.out.print("Digite o ano de nascimento: ");
		anoNasc=teclado.nextInt();
		
		
		//Cálculo para idade
		idade=2022-anoNasc;
		
		
		//Caso do Switch
		System.out.println("Se você já fez aniversário, digite (s),caso contrário, digite(n)");
		resposta=teclado.next().charAt(0);
		
		switch(resposta)
		{
			case 's': System.out.println("Então você tem: "+idade +" anos");
			
						if(idade>=18) {System.out.println("Você tem idade para conseguir a carteira da habilitação");}
						else {System.out.println("Você não tem idade para conseguir a carteira de habilitação");}
			break;
			case 'n':
				idade=idade-1;
				System.out.println("Então você tem: "+idade +" anos");
				if(idade>=18) {System.out.println("Você tem idade para conseguir a carteira da habilitação");}
				else {System.out.println("Você não tem idade para conseguir a carteira de habilitação");}
			break;
			default:
				System.out.println("Letra fora das opções");
		}
			
		teclado.close();

	}

}
