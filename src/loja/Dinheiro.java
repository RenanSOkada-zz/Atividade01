package loja;

public class Dinheiro extends Papel{
	 
	private double valor;
	
	public Dinheiro() {
	}
	
	public Dinheiro(double valor) {
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

	public void TipoPapel() {
		System.out.println("Tipo do papel do dinheiro: Combinação de Madeira do Alacsa, Algodão, Água e Sal");
	}
	
	
}
