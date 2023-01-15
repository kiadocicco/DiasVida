import java.util.Scanner;

public class CalculaDias {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o dia do seu nascimento");
		int dia=teclado.nextInt();
		System.out.println("Digite o mês do seu nascimento");
		int mes=teclado.nextInt();
		System.out.println("Digite o ano do seu nascimento");
		int ano=teclado.nextInt();
		System.out.println("Digite o ano atual");
		int anoatual=teclado.nextInt();
		
		int CalculaDias=(dia+mes*30+(anoatual-ano)*365);
		
		System.out.println("Você possui "+CalculaDias+" dias de vida" );
		

	}

}
