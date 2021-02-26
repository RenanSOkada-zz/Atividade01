package loja;

public class TipoItem extends Item {

	private String Descrição;
	private int CodigoItem;
	
	public TipoItem() {
		super();
	}
	
	public TipoItem ( String Descrição, int CodigoItem, double preço, int quantidade) {
		super(preço, quantidade);
		setDescrição(Descrição);
		setCodigoItem(CodigoItem);
	}
	public String getDescrição() {
		return Descrição;
	}
	public int getCodigoItem() {
		return CodigoItem;
	}
	public void setDescrição(String descrição) {
		if(descrição.length()>0)
		Descrição = descrição;
	}
	public void setCodigoItem(int codigoItem) {
		if(codigoItem>0)
		CodigoItem = codigoItem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TipoItem [Descrição=");
		builder.append(Descrição);
		builder.append(", CodigoItem=");
		builder.append(CodigoItem);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
