package loja;

public class Cliente {
	
	private String nome;
	private String endere�o;
	private String CpfCliente;
	
	public String getNome() {
		return nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public String getCpfCliente() {
		return CpfCliente;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}
	public void setEndere�o(String endere�o) {
		if(endere�o.length() > 0)
		this.endere�o = endere�o;
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
		builder.append(", endere�o=");
		builder.append(endere�o);
		builder.append(", CpfCliente=");
		builder.append(CpfCliente);
		builder.append("]");
		return builder.toString();
	}
	
}
