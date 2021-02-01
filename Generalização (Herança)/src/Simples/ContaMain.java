package Simples;

public class ContaMain {

	public static void main(String[] args) {
		
		
		Conta c = new Conta("Bradesco", 12348, 12345670, 50.34);
		
		c.deposito(30.21);
		System.out.println(c);
		System.out.println("\n");
		
		c.saque(50.76);
		System.out.println(c);
		System.out.println("\n\n");
		
		ContaSimples ct = new ContaSimples("Banco do Brasil", 87654, 98765431, 216.25, 100);
		
		ct.deposito(50);
		System.out.println(ct);
		
		ct.depositoPoupanca(30.92);
		System.out.println(ct);
		System.out.println("\n");
		
		ct.saquePoupanca(100);
		System.out.println(ct);
		System.out.println("\n");
		
		ContaEspecial ce = new ContaEspecial("Banco Santander", 91827, 82730173, 523.12, 12, 4000);
		
		System.out.println(ce);
		
	}

}
