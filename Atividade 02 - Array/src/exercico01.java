import java.util.Scanner;
import java.util.Random;

public class exercico01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Random generator = new Random();
		
		int  valor, aux, gerador = 5000, soma = 0, cont = 0, maior = 0, menor = 5001, numDivisores = 0, mediana = 0, qModa = 0;
		float media = 0.0f, variancia = 0.0f;
		double dp;
		
		
		for (int o = 0; o <= 5; o++) {	
			
		System.out.println("");
		System.out.println("Infomre quantos números deseja gerar:");
		valor = entrada.nextInt();
		
		if (valor <= 0  ) {
			
			System.out.println("O valor inserido de números que deseja gerar é invalido!");
			
		}else {
			
		int vet[] = new int [valor];
			
		for (int x = 0; x <= vet.length - 1; x++)
			vet[x]= generator.nextInt(gerador);
		
		for (int j = 0; j <= vet.length - 1 ; j++) {
		   for (int x =0; x <= vet.length - 2; x++) {
			   if (vet[x] > vet[x + 1]) {
				   aux = vet[x];
				   vet[x] = vet[x+1];
				   vet[x+1] = aux;
			   }
		    }
	}
		
		
		System.out.println("\n----------------Informando números gerados (Em ordem crescente)---------------------\n")  ;     
		    
		for (int x = 0; x <= vet.length - 1; x++)
			System.out.println(vet[x]);
		
		System.out.println("\n----------------Soma dos números gerados---------------------\n")  ;   
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    if (cont <= valor ) {
		    	soma = vet[x] + soma;
		    	cont++;
		    }
		    			    	
	}
		cont = 0;
		System.out.println("A soma dos numeros gerados é: " + soma)  ;  
		
		System.out.println("\n----------------A média dos números gerados---------------------\n")  ;   
		
		media = soma / valor;
		
		System.out.println("A média dos numeros gerados é: " + media)  ;  
		
		System.out.println("\n----------------A mediana dos numeros gerados---------------------\n")  ;   
		
		if (valor % 2  == 0) {
			mediana = (vet[valor/2] + vet[(valor/2) - 1]) / 2;
		}else {
			mediana = vet[((valor - 1)/2)];
		}
		System.out.println("A mediana dos numeros gerados é: " + mediana)  ;  
		
		System.out.println("\n----------------A moda dos numeros gerados---------------------\n")  ;   
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    for (int h = x + 1; h<= vet.length - 1; h++ ) {
		    	if (vet[h] == vet[x]) {
		    		System.out.println(vet[x]);
		    		qModa ++;
		    	}
		    }
		    }
		if (qModa == 0) {
			System.out.println("Não há modas nos números gerados");
		}
		qModa= 0;
		 
		
		System.out.println("\n----------------O maior dos numeros gerados---------------------\n")  ;   
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    if (vet[x] > maior ) {
		    	maior = vet[x];
		    	
		    }  			    	
	}
		System.out.println("O maior dos numeros gerados é: " + maior)  ;  
		
		System.out.println("\n----------------O menor dos numeros gerados---------------------\n")  ;   
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    if (vet[x] < menor ) {
		    	menor = vet[x];
		    	
		    }  			    	
	}
		System.out.println("O menor dos numeros gerados é: " + menor)  ;  
		
		System.out.println("\n----------------A variância dos numeros gerados---------------------\n")  ;   
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    variancia = variancia + ((vet[x] - media)*(vet[x] - media)); 	
		    }  
		
		variancia = variancia / valor;
				
		System.out.println("A variância dos numeros gerados é: " + variancia)  ;  
		
		System.out.println("\n----------------O desvio padrão dos numeros gerados---------------------\n")  ;   
		
		dp = Math.sqrt(variancia);
				
		System.out.println("O desvio padrão dos numeros gerados é: " + dp)  ;  
		
		
		System.out.println("\n----------------Os numeros pares gerados---------------------\n")  ; 
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    if (vet[x]  % 2 == 0 ) {
		    	System.out.println(vet[x]);
		    	
		    }  			    	
	}
		System.out.println("\n----------------Os numeros impares gerados---------------------\n")  ; 
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    if (vet[x]  % 2 == 1 ) {
		    	System.out.println(vet[x]);
		    	
		    }  			    	
	}
		System.out.println("\n----------------Os numeros primos gerados---------------------\n")  ; 
		
		for (int x = 0; x <= vet.length - 1; x++) {
		    for (int i = 1; i <= vet[x]; i++) {
		    	if (vet[x] % i == 0) {
		    		numDivisores++;		    		
		    	}		   
		    }
		     if (numDivisores == 2) {
		    	System.out.println(vet[x]);
		    }
		     numDivisores = 0;
		}
	}
		o--;
}
		
}
}
