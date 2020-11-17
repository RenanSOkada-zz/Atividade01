import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float altura, peso;
		int sexo;
		
		System.out.print("Informe sua altura:");
		altura = entrada.nextFloat();
		
		System.out.print("Informa seu peso:");
		peso = entrada.nextFloat();
		
		System.out.print("Informe seu sexo(Masculino = 1/ Feminino = 2):");
		sexo = entrada.nextInt();
		
		entrada.nextLine();
		
		if (sexo == 1) {
			System.out.print("Seu peso ideal é:");
			System.out.println((72.7 * altura) - 58);
			
			if (((72.7 * altura) - 58) < 55)
				System.out.println("Você esta abaixo do peso ideal");
			else if (((72.7 * altura) - 58) > 68)
				System.out.println("Você esta acima do peso ideal");
			else
				System.out.println("Você esta no peso ideal");
		}
		if (sexo == 2) {
			System.out.print("Seu peso ideal é:");
			System.out.println((62.1 * altura) - 44.7);
			
			if (((72.7 * altura) - 58) < 51)
				System.out.println("Você esta abaixo do peso ideal");
			else if (((72.7 * altura) - 58) > 63)
				System.out.println("Você esta acima do peso ideal");
			else
				System.out.println("Você esta no peso ideal");

		}
						
		System.out.println("Sua altura é:" + altura);
		System.out.println("Seu peso é:" + peso);
		System.out.println("Seu sexo (Masculino = 1/ Feminino = 2) é :" + sexo);	
		
		
	}

}
