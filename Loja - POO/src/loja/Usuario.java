package loja;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String ID_Usuario;
	private String EmailUsuario;
	private String SenhaUsuario;
	
	
	List<Pedido> IPedido = new ArrayList<Pedido>();
	
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
	public void setID_Usuario(String iD_Usuario) {
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
	
	@Override
	public String toString() {
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
