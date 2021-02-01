
public class MainPessoa {

	public static void main(String[] args) {

			Pessoa p = new Pessoa("Joao", "Rio de Janeiro");
			
			System.out.println(p);
			System.out.println("\n");
		
			PessoaFisica pf = new PessoaFisica("Matheus", "Sao Paulo", "123.456.789.01", "Solteiro");
			
			System.out.println(pf);
			System.out.println("\n");
			
			PessoaJuridica pj = new PessoaJuridica("Lucas", "Santa Catarina", "18.690.203/0001-12", " Empresário Individual");
			
			System.out.println(pj);
			System.out.println("\n");
	}

}
