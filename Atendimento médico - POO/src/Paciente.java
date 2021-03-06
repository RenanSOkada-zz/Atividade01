import java.util.ArrayList;
import java.util.List;

public class Paciente {
	public String nome;
	public String Idade;
	public String CpfPaciente;
	
	public Paciente(){
	}
	
	List<Atendimento> IAtendiemento = new ArrayList<Atendimento>();
 	
 	public boolean AddIAtendiemento (String começo, String termino, String NivelPrioridade, String PerguntaDePriori, String DataAtendida) {
 		Atendimento i = new Atendimento( começo,  termino,  NivelPrioridade,  PerguntaDePriori,  DataAtendida);

		return 	IAtendiemento.add(i);
	}
	
	public Paciente (String nomePaciente, String Idade, String CpfPaciente) {
		setNome(nomePaciente);
		setIdade(Idade);
		setCpfPaciente(CpfPaciente);
	}
	
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return Idade;
	}
	public String getCpfPaciente() {
		return CpfPaciente;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
		this.nome = nome;
	}
	public void setIdade(String idade) {
		if(idade.length()>0)
		Idade = idade;
	}
	public void setCpfPaciente(String cpfPaciente) {
		if(cpfPaciente.length()>0)
		CpfPaciente = cpfPaciente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [nome=");
		builder.append(nome);
		builder.append(", Idade=");
		builder.append(Idade);
		builder.append(", CpfPaciente=");
		builder.append(CpfPaciente);
		builder.append("]");
		for (Atendimento atendimento : IAtendiemento) {
			builder.append(atendimento.toString());
		}
		return builder.toString();
	}
	
	

}
