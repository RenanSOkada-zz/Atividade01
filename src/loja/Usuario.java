package loja;

import java.util.ArrayList;
import java.util.List;

public class  Usuario implements InformaçõesPessoais{
	
	private String ID_Usuario;
	private String EmailUsuario;
	private String SenhaUsuario;
	
	List<Pedido> IPedido = new ArrayList<Pedido>();
	
	public static void TipoU(TipoUsuario tipoUsuario, Usuario usuario ) {
		System.out.print("O usuario: " + usuario.ID_Usuario + " é um ");
		System.out.println(tipoUsuario.name());
	}
		
	public boolean addPedido(Pedido pedido) {
		return IPedido.add(pedido);
	}
	
	public String getID_Usuario() {
		return ID_Usuario;
	}
	public String getEmailUsuario() {
		return EmailUsuario;
	}
	public String getSenhaUsuario() {
		return SenhaUsuario;
	}
	public void  setID_Usuario(String iD_Usuario) {
		if(iD_Usuario.length() > 0)
		ID_Usuario = iD_Usuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		if(emailUsuario.length() > 0)
		EmailUsuario = emailUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		if(senhaUsuario.length() > 0)
		SenhaUsuario = senhaUsuario;
	}
	
	
	public String Cep(String Cep) {
		return Cep;
	}

	
	public String Telefone(String Telefone) {
		return Telefone;
	}


	public String NumCasa(String NumCasa) {
		return NumCasa;
	}

	@Override
	public String Cep() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Telefone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String NumCasa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public final String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuário [ID_Usuario=");
		builder.append(ID_Usuario);
		builder.append(", EmailUsuario=");
		builder.append(EmailUsuario);
		builder.append(", SenhaUsuario=");
		builder.append(SenhaUsuario);
		builder.append("]");
		for (Pedido pedido : IPedido) {
			builder.append(pedido.toString());
		}
		return builder.toString();
	}

	
	
	
}
