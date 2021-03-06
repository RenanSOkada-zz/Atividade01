
public class Operação {
	public String começo;
	public String termino;
	
	public Operação() {
	}
	
	public Operação(String começo, String termino) {
		setComeço(começo);
		setTermino(termino);
	}

	public String getComeço() {
		return começo;
	}

	public String getTermino() {
		return termino;
	}

	public void setComeço(String começo) {
		if(começo.length()>0)
		this.começo = começo;
	}

	
	public void setTermino(String termino) {
		if(termino.length()>0)
		this.termino = termino;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operação [começo=");
		builder.append(começo);
		builder.append(", termino=");
		builder.append(termino);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
