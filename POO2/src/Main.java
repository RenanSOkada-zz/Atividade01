import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
				
		Funcionário f1 = new Funcionário("renan", "wqfqw2314", "Renan Okada", "renan417126@hotmail.com", 
											"02/10/2000", 2000, 20);
		Usuario u1 = new Usuario();
		
		Pessoa p1 = new Pessoa();
		
		TipoUsuario tipo = TipoUsuario.ADMINISTRADOR;
		
		TipoUsuario tipo2 = TipoUsuario.USUARIO;
		
		int vet1[] = {20, 30, 10, 40, 42, 45, 76, 1234, 42562, 143};
		
		int vet2[] = {234, 4123, 4143, 3124, 4, 1234, 1, 4123, 4, 14};
		
		f1.setVet(vet1);
		f1.setVet2(vet2);
		
		f1.setAnoNasc(2000);
		f1.setIdade(20);
		
		f1.CalcularSM();
		f1.CalcularST();
		f1.CalcularMST();
		f1.MostrarN();
		f1.MesesTrabalhados();
		f1.AnosMesesTrabalhados();
		f1.Aposentadoria();
		
		u1.setID_Usuario("renan73612");
		u1.setSenha("wqfqw2314");
		u1.setUsuário("renan");
		Usuario.TipoU(tipo, u1);
		
		p1.setCpfPessoa("123123123");
		p1.setEndereço("Rua eldorado");
		p1.setNome("Osvaldo");
		p1.addUsuario(u1);
		
		System.out.println(f1);
		System.out.println(u1);
		System.out.println(p1);	
		
		//---------------------Interface------------------------
		
		
		Pessoa pes = new Pessoa();
		
		pes.Cep("42343234");
		pes.NumCasa("123");
		pes.Telefone("23424242");
		
		
		
		
	// Criptografar a senha em SHA1	
	/*
	Scanner entrada = new Scanner(System.in);
	System.out.println("Insira uma mensagem: ");
	String input = entrada.nextLine();
	
	MessageDigest md = MessageDigest.getInstance("SHA1");
	md.update(input.getBytes());
	
	byte[] digest = md.digest();
	StringBuffer sb = new StringBuffer();
	for (byte b : digest) {
		sb.append(String.format("%02x", b & 0xff));
	} 
	
	System.out.println("SHA1 Hash: "+ sb.toString());
	*/
		
		
		
		
	}

}
