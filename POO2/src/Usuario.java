import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Usuario {
	private String ID_Usuario;
	private String usu�rio;
	private String senha;
	
	Scanner entrada = new Scanner(System.in);	

	public static void TipoU(TipoUsuario tipoUsuario, Usuario usuario ) {
		System.out.print("O usuario: " + usuario.ID_Usuario + " � um ");
		System.out.println(tipoUsuario.name());
	}
	
	public Usuario(){
	}
	
	public Usuario(String usu�rio, String senha) throws NoSuchAlgorithmException {
		if(usu�rio != senha)
		setUsu�rio(usu�rio);
		setSenha(senha);
	}
	
	public String getUsu�rio() {
		return usu�rio;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsu�rio(String usu�rio) {
		if(usu�rio.length()>0 || usu�rio != senha)
		this.usu�rio = usu�rio;
	}
	public void setSenha(String senha) throws NoSuchAlgorithmException {
		if(senha.length() > 0 || senha != usu�rio )
		
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
		builder.append("Usuario [usu�rio=");
		builder.append(usu�rio);
		builder.append(", senha=");
		builder.append(senha);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
