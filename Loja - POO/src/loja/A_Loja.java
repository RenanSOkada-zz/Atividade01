package loja;

public class A_Loja {

	public static void main(String[] args) {
		
		
		//---------------------Clientes------------------------
		Cliente c1 = new Cliente();
		
		c1.setNome("Paulo Ferreiro");
		c1.setEndereço("Bairro Alvorada; Conjunto das Rosas");
		c1.setCpfCliente("123.456.789-0");
		
		Cliente c2 = new Cliente();
		
		c2.setNome("Joao Alfredo");
		c2.setEndereço("Bairro dos Cocais; Rua do Major");
		c2.setCpfCliente("134.546.135-75");
		
		Cliente c3 = new Cliente();
		
		c3.setNome("Maria Augusta");
		c3.setEndereço("Bairro Parque das Laranjeiras; Avenida Paulista");
		c3.setCpfCliente("753.356.684-23");
	
		
		//---------------------Pedidos------------------------
		Pedido p1 = new Pedido();
		
		p1.setData("12/03/2020");
		p1.setStatus("Pendete");
		p1.addITipoItem("Shampoo",91238234 ,12.25 , 2);
		p1.addCartao(24.50, 69127391, 24.50, "Em processamento");
	
		
		Pedido p2 = new Pedido();
		
		p2.setData("10/01/2019");
		p2.setStatus("Aprovado");
		p2.addITipoItem("Costela Suina", 2341234 ,30.50, 4);
		p2.addDinheiro(122, 150, "Aprovado");
		
		Pedido p3 = new Pedido();
		
		p3.setData("20/08/2020");
		p3.setStatus("Pendente");
		p3.addITipoItem("Tenis", 3124234, 49.99, 2);
		p3.addDinheiro(99.98, 100, "Em processamento");
		
		p3.setData("10/05/2018");
		p3.setStatus("Apovado");
		p3.addITipoItem("Ventilador",65756723, 24.75, 3);
		p3.addCartao(74.25, 4352345, 74.25, "Aprovado");
		
		//---------------------Usuario------------------------
		Usuario u1 = new Usuario();
		
		u1.setID_Usuario("PauloFerreiro98");
		u1.setEmailUsuario("paulo1998@gmail.com");
		u1.setSenhaUsuario("paulo123456");
		u1.addCliente(c1);
		u1.addPedido(p1);
		
		Usuario u2 = new Usuario();
		
		u2.setID_Usuario("JoaoAlf");
		u2.setEmailUsuario("JAf@hotmail.com");
		u2.setSenhaUsuario("J4686F");
		u2.addCliente(c2);
		u2.addPedido(p2);
		
		Usuario u3 = new Usuario();
		
		u3.setID_Usuario("Maria_123_Augusta");
		u3.setEmailUsuario("MariaAugusta@outlook.com");
		u3.setSenhaUsuario("Maria19700812");
		u3.addCliente(c3);
		u3.addPedido(p3);
		
	
		//---------------------Mostrar na tela------------------------
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		//---------------------Imprimir------------------------
		Impressora imp = new Impressora();
		
		imp.setMarca("HP");
		imp.imprimir(p1);
		imp.imprimir(p2);
		
	}

}
