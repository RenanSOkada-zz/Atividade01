package loja;

public class Item {

	private double preço;
	private int quantidade;
	
	public Item() {
	}
	
	public Item (double preço, int quantidade) {
		setPreço(preço);
		setQuantidade(quantidade);
	}
	public double getPreço() {
		return preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setPreço(double preço) {
		if(preço>0)
		this.preço = preço;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade>0)
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [preço=");
		builder.append(preço);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
