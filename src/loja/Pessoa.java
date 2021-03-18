package loja;


import java.util.ArrayList;
import java.util.List;

public class Pessoa implements InformaçõesPessoais{
	
	private String nome;
	private String endereço;
	private String CpfPessoa;
	
	
	List<Usuario> IUsuario = new ArrayList<Usuario>();
	
	public boolean addUsuario (Usuario usuario) {
		return IUsuario.add(usuario);
		}
	
	public String getNome() {
		return nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public String getCpfPessoa() {
		return CpfPessoa;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public void setEndereço(String endereço) {
		if(endereço.length() > 0)
		this.endereço = endereço;
	}
	public void setCpfPessoa(String cpfPessoa) {
		if(cpfPessoa.length() > 0)
			CpfPessoa = cpfPessoa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append(", CpfCliente=");
		builder.append(CpfPessoa);
		builder.append("]");
		for (Usuario usuario : IUsuario) {
			builder.append(usuario.toString());
		}
		return builder.toString();
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
	
}
