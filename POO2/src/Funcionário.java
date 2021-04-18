import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Funcionário extends Usuario {
	
	private String nome;
	private String email;
	private String DataNasc;
	private int AnoNasc;
	private int Idade;
	private int SM = 0 ;
	private int ST = 0 ;
	private int maior = 0 ;
	private int maior2 = 0 ;
	private int menor = 999999999 ;
	private int menor2 = 999999999 ;
	
	
	// Nesse vetor será contabilizado as horas trabalhadas no mes
	private int vet[] ;
	
	// Nesse vetor será contabilizado o valor da hora no determiando mes
	private int vet2[] ;
	
	
	
	//Calcular salário do mes 
	public void CalcularSM() {
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			System.out.println("O sálario no mês "+ (x+1)+ " de trabalho é: " + SM);
		}
	}
	
	//Calcular salário de todos os meses (Calcular salátio total)
	public void CalcularST() {
		ST = 0;
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			ST += SM;
		}
		System.out.println();
		System.out.println("O Valor total de todos os salários é: "+ ST);
	}
			
	//Calcular Média de todos os salários(Calcular Média Salátio Total)
	public void CalcularMST() {
			ST = 0;
			for(int x = 0 ; x <= vet.length - 1; x++) {
				SM = vet[x] * vet2[x];
				ST += SM;
			}
			System.out.println();
			System.out.println("A Média de todos os salários é: "+ ST/(vet.length));
		}		
		
	//Mostrar os N maiores e N menores
	public void MostrarN() {
	
		//N maiores
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			if(SM > maior) {
				maior = SM;	
			}
		}
		System.out.println();
		System.out.println("O maior salário é: "+ maior);
		
		
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			
			if(SM != maior) {
				if(SM > maior2) {
					maior2 = SM;	
				}
			}
		}
		System.out.println();
		System.out.println("O segundo maior salário é: "+ maior2);
		
		//N menores
		
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			if(SM < menor) {
				menor = SM;	
			}
		}
		System.out.println();
		System.out.println("O menor salário é: "+ menor);
		
		
		for(int x = 0 ; x <= vet.length - 1; x++) {
			SM = vet[x] * vet2[x];
			
			if(SM != menor) {
				if(SM < menor2) {
					menor2 = SM;	
				}
			}
		}
		System.out.println();
		System.out.println("O segundo menor salário é: "+ menor2);
	}
	
	public void MesesTrabalhados() {
		System.out.println("\nMeses Trabalhados: "+ vet.length);
	}
	
	public void AnosMesesTrabalhados() {
			System.out.println("\n"+vet.length/12+" Anos e " + vet.length%12 + " Meses Trabalhados!");
	}
	
	public void Aposentadoria() {
		System.out.println("\nAno de nascimento: " + AnoNasc);
		System.out.println("Ano de aposentadoria: " + (AnoNasc+65));
		System.out.println("Anos Faltantes para se aposentar: " +  (35-(vet.length/12)));
		System.out.println("Idade de aposentadoria: " + (Idade + (35-(vet.length/12))));
		System.out.println("Ano idade minima (65): " + (AnoNasc+65));
		System.out.println("Ano dos 35 anos de contribuição: "+ (Idade + (35-(vet.length/12))));
	}
		
		
	public Funcionário(){
	super();
	}
	
	public Funcionário(String usuário, String senha,  String nome, String email, String DataNasc, int AnoNasc, int Idade) throws NoSuchAlgorithmException{
	super(usuário ,senha);
	setNome(nome);
	setEmail(email);
	setDataNasc(DataNasc);
	setAnoNasc(AnoNasc);
	setIdade(Idade);
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getDataNasc() {
		return DataNasc;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public void setEmail(String email) {
		if(email.length()>0)
		this.email = email;
	}
	public void setDataNasc(String dataNasc) {
		if(dataNasc.length() > 0)
		DataNasc = dataNasc;
	}

	public int[] getVet() {
		return vet;
	}

	public int[] getVet2() {
		return vet2;
	}

	public void setVet(int[] vet) {
		if(vet.length > 0)
		this.vet = vet;
	}

	public void setVet2(int[] vet2) {
		if(vet2.length > 0)
		this.vet2 = vet2;
	}

	public int getAnoNasc() {
		return AnoNasc;
	}

	public int getIdade() {
		return Idade;
	}

	public void setAnoNasc(int anoNasc) {
		if(anoNasc>0)
		AnoNasc = anoNasc;
	}

	public void setIdade(int idade) {
		if(idade>0)
		Idade = idade;
	}

	@Override
	public final String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionário [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", DataNasc=");
		builder.append(DataNasc);
		builder.append(", AnoNasc=");
		builder.append(AnoNasc);
		builder.append(", Idade=");
		builder.append(Idade);
		builder.append(", horas trabalhadas no mes=");
		builder.append(Arrays.toString(vet));
		builder.append(", valor da hora no determiando mes=");
		builder.append(Arrays.toString(vet2));
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	


	

}
