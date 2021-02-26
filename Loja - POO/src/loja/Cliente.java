package loja;

public class Cliente {
	
	private String nome;
	private String endereço;
	private String CpfCliente;
	
	public String getNome() {
		return nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public String getCpfCliente() {
		return CpfCliente;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public void setEndereço(String endereço) {
		if(endereço.length() > 0)
		this.endereço = endereço;
	}
	public void setCpfCliente(String cpfCliente) {
		if(cpfCliente.length() > 0)
		CpfCliente = cpfCliente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append(", CpfCliente=");
		builder.append(CpfCliente);
		builder.append("]");
		return builder.toString();
	}
	
}
