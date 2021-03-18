
package loja;


import java.io.*;
import java.util.*;

public class A_Loja {

	public static void main(String[] args) throws IOException {
		
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
		
		//---------------------Pessoas------------------------
		Pessoa c1 = new Pessoa();
		Pessoa c2 = new Pessoa();
		Pessoa c3 = new Pessoa();
		
		//---------------------Imprimir------------------------
		Impressora imp = new Impressora();
		
		//---------------------Tipo Usuario------------------------
		TipoUsuario tipo = TipoUsuario.ADMINISTRADOR;
				
		TipoUsuario tipo2 = TipoUsuario.USUARIO;
		
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
		Usuario.TipoU(tipo, u1);
		
		
		u2.setID_Usuario("JoaoAlf");
		u2.setEmailUsuario("JAf@hotmail.com");
		u2.setSenhaUsuario("J4686F");
		u2.addPedido(p2);
		Usuario.TipoU(tipo2, u2);
		
		
		u3.setID_Usuario("Maria_123_Augusta");
		u3.setEmailUsuario("MariaAugusta@outlook.com");
		u3.setSenhaUsuario("Maria19700812");
		u3.addPedido(p3);
		Usuario.TipoU(tipo2, u3);
		
		//---------------------Pessoa------------------------

		
		c1.setNome("Paulo Ferreiro");
		c1.setEndereço("Bairro Alvorada; Conjunto das Rosas");
		c1.setCpfPessoa("123.456.789-0");
		c1.addUsuario(u1);
		
		
		
		c2.setNome("Joao Alfredo");
		c2.setEndereço("Bairro dos Cocais; Rua do Major");
		c2.setCpfPessoa("134.546.135-75");
		c2.addUsuario(u2);
		
		
		
		c3.setNome("Maria Augusta");
		c3.setEndereço("Bairro Parque das Laranjeiras; Avenida Paulista");
		c3.setCpfPessoa("753.356.684-23");
		c3.addUsuario(u3);
	
		//---------------------Mostrar na tela------------------------
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//---------------------Imprimir------------------------
		
		imp.setMarca("HP");
		imp.imprimir(pag1);
		imp.imprimir(p1);
		
		//---------------------Papel------------------------
		din.TipoPapel();
		//---------------------Interface------------------------
		
		
				Pessoa pes = new Pessoa();
				
				pes.Cep("42343234");
				pes.NumCasa("123");
				pes.Telefone("23424242");
				
				Usuario us = new Usuario();
				
				us.Cep();
				us.Telefone();
				us.NumCasa();
				
		
		//---------------------CSV------------------------
		
		
		List<Item> lista = new ArrayList<>();
		
		Item it = new Item();
		
		it.setPreço(12);
		it.setQuantidade(10);
		lista.add(it);
		
		it = new Item();
		it.setPreço(20.0);
		it.setQuantidade(20);
		lista.add(it);
		
		Scanner ler = new Scanner(System.in);
		FileWriter arq = new FileWriter ("agenda.csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for (Item item: lista) {
			gravarArq.printf("%d;%s\n", item.getPreço(), item.getQuantidade());
		}
		
		arq.close();
		
		try {
			FileReader arq1 = new FileReader("agenda.csv");
			BufferedReader lerArq = new BufferedReader (arq1);		
			String linha = lerArq.readLine();
			lista = new ArrayList <Item>();
			while(linha != null) {
				String[] leitura = linha.split(";");
				it = new Item();
				it.setPreço(Integer.parseInt(leitura[0]));
				it.setQuantidade(Integer.parseInt(leitura[1]));
				lista.add(it);
				linha = lerArq.readLine();
				}
			arq1.close();
			} catch (IOException e) {
				System.out.println("Erro de abertura de arquivo: %s . \n , e.getMessage()");
			}
		for (Item item : lista) {
			System.out.println(item);
		}
		ler.close();
	}
		
}
