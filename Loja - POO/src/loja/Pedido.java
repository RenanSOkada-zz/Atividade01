package loja;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String Data;
	private String Status;
	
	List<TipoItem> ITipoItem = new ArrayList<TipoItem>();
	
	public boolean addITipoItem (String Descrição, int CodigoItem, double preço, int quantidade) {
		TipoItem i = new TipoItem( Descrição,CodigoItem, preço, quantidade);

		return 	ITipoItem.add(i);
	}
	
	List<cartao> Icartao = new ArrayList<cartao>();
	
	public boolean addCartao(double valor, int NumCartao, double quantia, String Status) {
		cartao c = new cartao( valor,  NumCartao,  quantia,  Status);
		return Icartao.add(c);
	}
	
	List<dinheiro> Idinheiro = new ArrayList<dinheiro>();
	
	public boolean addDinheiro(double valor, double quantia, String Status) {
		dinheiro d = new dinheiro( valor,  quantia,  Status);
		return Idinheiro.add(d);
	}
	
	public String getData() {
		return Data;
	}
	public String getStatus() {
		return Status;
	}
	public void setData(String data) {
		if(data.length() > 0)
		Data = data;
	}
	public void setStatus(String status) {
		if(status.length() > 0)
		Status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [Data=");
		builder.append(Data);
		builder.append(", Status=");
		builder.append(Status);
		builder.append("]");
		for (TipoItem tipoItem : ITipoItem) {
			builder.append(tipoItem.toString());
		}
		for (cartao Cartao : Icartao) {
			builder.append(Cartao.toString());
		}
		for (dinheiro Dinheiro : Idinheiro) {
			builder.append(Dinheiro.toString());
		}
		return builder.toString();
	}
	
		

}
