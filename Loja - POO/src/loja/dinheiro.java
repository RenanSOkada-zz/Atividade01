package loja;

public class dinheiro extends Pagamento {
	 
	private double valor;
	
	public dinheiro() {
		super();
	}
	
	public dinheiro(double valor, double quantia, String Status) {
		super(quantia, Status);
		setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor>0)
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("dinheiro [valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
