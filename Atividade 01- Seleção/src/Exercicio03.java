import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe o valor que deseja sacar:");
		valor = entrada.nextInt();
		
		if (valor >= 10 && valor <= 600) {
			System.out.println("Notas de 100 necessararios:");
			System.out.println(valor / 100);
			
			System.out.println("Notas de 50 necessararios:");
			System.out.println((valor % 100) / 50 );
			
			System.out.println("Notas de 10 necessararios:");
			System.out.println(((valor % 100) % 50) / 10 );
			
			System.out.println("Notas de 5 necessararios:");
			System.out.println((((valor % 100) % 50) % 10) / 5 );
			
			System.out.println("Notas de 1 necessararios:");
			System.out.println(((((valor % 100) % 50) % 10) % 5) / 1 );
		} else
			System.out.println("Não pode-se sacar esse valor");
	}

}
