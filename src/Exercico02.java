import java.util.Scanner;

public class Exercico02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float salario;
		
		System.out.println("Informe seu salário:");
		salario = entrada.nextFloat();
		
		if (salario <= 280) {
			System.out.print("Seu salario atual é:");
		    System.out.println(salario);
		    
			System.out.println("Seu salario ira aumentar em 20%");
			
			System.out.print("Foi acrescentado em seu salario:");
			System.out.println(salario * 0.2);
			
		   	System.out.print("Seu salario ira aumentar para:");
			System.out.println(salario + salario * 0.2);
		}
			
		if (salario > 280 && salario <= 700) {
			System.out.print("Seu salario atual é:");
		    System.out.println(salario);
		    
			System.out.println("Seu salario ira aumentar em 15%");
			
			System.out.print("Foi acrescentado em seu salario:");
			System.out.println(salario * 0.15);
			
		   	System.out.print("Seu salario ira aumentar para:");
			System.out.println(salario + salario * 0.15);
		}	
			
		if (salario > 700 && salario <= 1500) {
			System.out.print("Seu salario atual é:");
		    System.out.println(salario);
		    
			System.out.println("Seu salario ira aumentar em 10%");
			
			System.out.print("Foi acrescentado em seu salario:");
			System.out.println(salario * 0.1);
			
		   	System.out.print("Seu salario ira aumentar para:");
			System.out.println(salario + salario * 0.1);
		}	
		
		if (salario > 1500) {
			System.out.print("Seu salario atual é:");
		    System.out.println(salario);
		    
			System.out.println("Seu salario ira aumentar em 5%");
			
			System.out.print("Foi acrescentado em seu salario:");
			System.out.println(salario * 0.05);
			
		   	System.out.print("Seu salario ira aumentar para:");
			System.out.println(salario + salario * 0.05);
		}	

	}

}
