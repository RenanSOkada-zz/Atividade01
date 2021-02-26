package loja;

public class Item {

	private double pre�o;
	private int quantidade;
	
	public Item() {
	}
	
	public Item (double pre�o, int quantidade) {
		setPre�o(pre�o);
		setQuantidade(quantidade);
	}
	public double getPre�o() {
		return pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setPre�o(double pre�o) {
		if(pre�o>0)
		this.pre�o = pre�o;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade>0)
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [pre�o=");
		builder.append(pre�o);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
