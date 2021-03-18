package loja;

import java.util.ArrayList;
import java.util.List;

public class Pagamento {
	private double quantia;
	private String Status;
	
	List<Cartao> Icartao = new ArrayList<Cartao>();
	
	List<Dinheiro> Idinheiro = new ArrayList<Dinheiro>();
	
	public Pagamento() {
	}
		
	public Pagamento(double quantia, String Status) {
		setQuantia(quantia);
		setStatus(Status);
	}	
	
	public boolean addCartao(Cartao cartao) {
		return Icartao.add(cartao);
	}
	
	public boolean addDinheiro(Dinheiro dinheiro) {
		return Idinheiro.add(dinheiro);
	}
	
	public double getQuantia() {
		return quantia;
	}
	public String getStatus() {
		return Status;
	}
	public void setQuantia(double quantia) {
		if(quantia>0)
		this.quantia = quantia;
	}
	public void setStatus(String status) {
		if(status.length()>0)
		Status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pagamento [quantia=");
		builder.append(quantia);
		builder.append(", Status=");
		builder.append(Status);
		builder.append("]");
		for (Cartao cartao : Icartao) {
			builder.append(cartao.toString());
		}
		for (Dinheiro dinheiro : Idinheiro) {
			builder.append(dinheiro.toString());
		}
		return builder.toString();
	}
	

}
