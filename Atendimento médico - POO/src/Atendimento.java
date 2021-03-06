
public class Atendimento extends Operação {
	
	public String NivelPrioridade;
	public String PerguntaDePriori;
	public String DataAtendida;
	
	public Atendimento() {
		super();
	}
	
	public Atendimento(String começo, String termino, String NivelPrioridade, String PerguntaDePriori, String DataAtendida) {
		super(começo, termino);
		setNivelPrioridade(NivelPrioridade);
		setPerguntaDePriori(PerguntaDePriori);
		setDataAtendida(DataAtendida);
	}
	
	public String getNivelPrioridade() {
		return NivelPrioridade;
	}
	public String getPerguntaDePriori() {
		return PerguntaDePriori;
	}
	public String getDataAtendida() {
		return DataAtendida;
	}
	public void setNivelPrioridade(String nivelPrioridade) {
		if(nivelPrioridade.length()>0)
		NivelPrioridade = nivelPrioridade;
	}
	public void setPerguntaDePriori(String perguntaDePriori) {
		if(perguntaDePriori.length()>0)
		PerguntaDePriori = perguntaDePriori;
	}
	public void setDataAtendida(String dataAtendida) {
		if(dataAtendida.length()>0)
		DataAtendida = dataAtendida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [NivelPrioridade=");
		builder.append(NivelPrioridade);
		builder.append(", PerguntaDePriori=");
		builder.append(PerguntaDePriori);
		builder.append(", DataAtendida=");
		builder.append(DataAtendida);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	

}
