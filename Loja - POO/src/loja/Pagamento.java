package loja;

public class Pagamento {
	private double quantia;
	private String Status;
	
	public Pagamento() {
	}
	
	public Pagamento(double quantia, String Status) {
		setQuantia(quantia);
		setStatus(Status);
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
		return builder.toString();
	}
	

}
