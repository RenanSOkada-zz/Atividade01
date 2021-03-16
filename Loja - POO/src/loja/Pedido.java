package loja;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String Data;
	private String Status;
	
	List<TipoItem> ITipoItem = new ArrayList<TipoItem>();
	
	List<Pagamento> Ipagamento = new ArrayList<Pagamento>();
	
	public Pedido() {
	}
	public Pedido(String Data, String Status) {
		setData(Data);
		setStatus(Status);
	}
	
	public boolean addITipoItem (String Descri��o, int CodigoItem, double pre�o, int quantidade) {
		TipoItem i = new TipoItem( Descri��o,CodigoItem, pre�o, quantidade);

		return 	ITipoItem.add(i);
	}
	
	public boolean addPagamento(double quantia, String Status) {
		Pagamento p = new Pagamento( quantia,  Status);
		return Ipagamento.add(p);
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
		for (Pagamento pagamento : Ipagamento) {
			builder.append(pagamento.toString());
		}
		return builder.toString();
	}
	
		

}
