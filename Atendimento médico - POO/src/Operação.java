
public class Opera��o {
	public String come�o;
	public String termino;
	
	public Opera��o() {
	}
	
	public Opera��o(String come�o, String termino) {
		setCome�o(come�o);
		setTermino(termino);
	}

	public String getCome�o() {
		return come�o;
	}

	public String getTermino() {
		return termino;
	}

	public void setCome�o(String come�o) {
		if(come�o.length()>0)
		this.come�o = come�o;
	}

	
	public void setTermino(String termino) {
		if(termino.length()>0)
		this.termino = termino;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Opera��o [come�o=");
		builder.append(come�o);
		builder.append(", termino=");
		builder.append(termino);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
