package loja;

public class A_Loja {

	public static void main(String[] args) {
		
		//---------------------Pedidos------------------------
		
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();
		
			//---------------------Forma de pagamento------------------------
		Cartao ca1 = new Cartao(24.50, 69127391);
		
		Cartao ca2 = new Cartao(74.25, 4352345);
		
		Dinheiro din = new Dinheiro(150);
		
		Dinheiro din2 = new Dinheiro(100);
		
		//---------------------Pagamento------------------------
		Pagamento pag1 = new Pagamento();
		Pagamento pag2 = new Pagamento(122, "Aprovado");
		Pagamento pag3 = new Pagamento(99.98, "Em processamento");
		Pagamento pag4 = new Pagamento(74.25, "Aprovado");
		
		//---------------------Usuario------------------------
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		
		//---------------------Clientes------------------------
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		//---------------------Imprimir------------------------
		Impressora imp = new Impressora();
		
		//---------------------Pedidos------------------------
		
		
		p1.setData("12/03/2020");
		p1.setStatus("Pendete");
		p1.addITipoItem("Shampoo",91238234 ,12.25 , 2);
		p1.addPagamento(24.50, "Em processamento");
	
		
		
		
		p2.setData("10/01/2019");
		p2.setStatus("Aprovado");
		p2.addITipoItem("Costela Suina", 2341234 ,30.50, 4);
		p2.addPagamento(122, "Aprovado");
		
		
		
		p3.setData("20/08/2020");
		p3.setStatus("Pendente");
		p3.addITipoItem("Tenis", 3124234, 49.99, 2);
		p3.addPagamento(99.98, "Em processamento");
		
		p3.setData("10/05/2018");
		p3.setStatus("Apovado");
		p3.addITipoItem("Ventilador",65756723, 24.75, 3);
		p3.addPagamento(74.25, "Aprovado");
		
	
		//---------------------Pagamento------------------------
		
		
		pag1.setQuantia(24.50);
		pag1.setStatus("Em processamento");
		pag1.addCartao(ca1);
		
	
		pag2.addDinheiro(din);
		
		
		pag3.addDinheiro(din2);
	
		
		pag4.addCartao(ca2);
		
		//---------------------Usuario------------------------
		
		
		u1.setID_Usuario("PauloFerreiro98");
		u1.setEmailUsuario("paulo1998@gmail.com");
		u1.setSenhaUsuario("paulo123456");
		u1.addPedido(p1);
		
		
		
		u2.setID_Usuario("JoaoAlf");
		u2.setEmailUsuario("JAf@hotmail.com");
		u2.setSenhaUsuario("J4686F");
		u2.addPedido(p2);
		
		
		
		u3.setID_Usuario("Maria_123_Augusta");
		u3.setEmailUsuario("MariaAugusta@outlook.com");
		u3.setSenhaUsuario("Maria19700812");
		u3.addPedido(p3);
		
		//---------------------Clientes------------------------

		
		c1.setNome("Paulo Ferreiro");
		c1.setEndereço("Bairro Alvorada; Conjunto das Rosas");
		c1.setCpfCliente("123.456.789-0");
		c1.addUsuario(u1);
		
		
		
		c2.setNome("Joao Alfredo");
		c2.setEndereço("Bairro dos Cocais; Rua do Major");
		c2.setCpfCliente("134.546.135-75");
		c2.addUsuario(u2);
		
		
		
		c3.setNome("Maria Augusta");
		c3.setEndereço("Bairro Parque das Laranjeiras; Avenida Paulista");
		c3.setCpfCliente("753.356.684-23");
		c3.addUsuario(u3);
	
		//---------------------Mostrar na tela------------------------
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//---------------------Imprimir------------------------
		
		imp.setMarca("HP");
	
		
	}

}
