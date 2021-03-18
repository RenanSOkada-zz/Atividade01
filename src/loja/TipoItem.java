package loja;

public class TipoItem extends Item {

	private String Descri��o;
	private int CodigoItem;
	
	public TipoItem() {
		super();
	}
	
	public TipoItem ( String Descri��o, int CodigoItem, double pre�o, int quantidade) {
		super(pre�o, quantidade);
		setDescri��o(Descri��o);
		setCodigoItem(CodigoItem);
	}
	public String getDescri��o() {
		return Descri��o;
	}
	public int getCodigoItem() {
		return CodigoItem;
	}
	public void setDescri��o(String descri��o) {
		if(descri��o.length()>0)
		Descri��o = descri��o;
	}
	public void setCodigoItem(int codigoItem) {
		if(codigoItem>0)
		CodigoItem = codigoItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoItem [Descri��o=");
		builder.append(Descri��o);
		builder.append(", CodigoItem=");
		builder.append(CodigoItem);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
