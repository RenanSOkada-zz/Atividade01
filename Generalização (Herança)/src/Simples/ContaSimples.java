package Simples;

public class ContaSimples extends Conta {

	private double saldoPoupanca;
	private double valor;
	
	public ContaSimples(){
		super();
	}
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca){
		super(banco, agencia, numeroconta,saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}


	public void setSaldoPoupanca(double saldoPoupanca) {
		if(saldoPoupanca > 0)
		this.saldoPoupanca = saldoPoupanca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		if(valor > 0)
		this.valor = valor;
	}


	public boolean depositoPoupanca(double valor) {
		setValor(valor);
		
		if(valor > 0) {
			saldoPoupanca += valor ;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean saquePoupanca(double valor) {
		setValor(valor);
		
		if(valor > 0) {
			saldoPoupanca -= valor ;
			return true;
			
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", getValor()=");
		builder.append(getValor());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
