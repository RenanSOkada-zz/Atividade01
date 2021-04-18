import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Usuario {
	private String ID_Usuario;
	private String usuário;
	private String senha;
	
	Scanner entrada = new Scanner(System.in);	

	public static void TipoU(TipoUsuario tipoUsuario, Usuario usuario ) {
		System.out.print("O usuario: " + usuario.ID_Usuario + " é um ");
		System.out.println(tipoUsuario.name());
	}
	
	public Usuario(){
	}
	
	public Usuario(String usuário, String senha) throws NoSuchAlgorithmException {
		if(usuário != senha)
		setUsuário(usuário);
		setSenha(senha);
	}
	
	public String getUsuário() {
		return usuário;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsuário(String usuário) {
		if(usuário.length()>0 || usuário != senha)
		this.usuário = usuário;
	}
	public void setSenha(String senha) throws NoSuchAlgorithmException {
		if(senha.length() > 0 || senha != usuário )
		
		System.out.print("");
		
		MessageDigest md = MessageDigest.getInstance("SHA1");
		md.update(senha.getBytes());
		
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		} 
		
		System.out.println("Sua seha em SHA1 Hash: "+ sb.toString());
			
		this.senha = sb.toString();
	}
	
	
	public String getID_Usuario() {
		return ID_Usuario;
	}

	public void setID_Usuario(String iD_Usuario) {
		if(iD_Usuario.length()>0)
		ID_Usuario = iD_Usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [usuário=");
		builder.append(usuário);
		builder.append(", senha=");
		builder.append(senha);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
