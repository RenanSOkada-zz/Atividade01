import java.util.ArrayList;
import java.util.List;


public class Medico extends Paciente {
	
	public String nome;
	public String especialidade;
	
	public Medico () {
	}
	
	public Medico (String nomePaciente, String Idade, String CpfPaciente, String nomeMedico,  String especialidade) {
		super(nomePaciente, Idade, CpfPaciente );
		setNome(nomeMedico);
		setEspecialidade(especialidade);
	}
	
	List<Atendimento> IAtendiemento = new ArrayList<Atendimento>();
 	
 	public boolean AddIAtendiemento (Atendimento atendimento) {
		return 	IAtendiemento.add(atendimento);
	}
 	
 	List<Paciente> IPaciente = new ArrayList<Paciente>();
	
	public boolean addPaciente (Paciente paciente) {
		return IPaciente.add(paciente);
		}
	
	public String getNome() {
		return nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setNome(String nome) {
		if(nome.length()>0)
		this.nome = nome;
	}
	public void setEspecialidade(String especialidade) {
		if(especialidade.length() > 0)
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [nome=");
		builder.append(nome);
		builder.append(", especialidade=");
		builder.append(especialidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		for (Atendimento atendimento : IAtendiemento) {
			builder.append(atendimento.toString());
		}
		return builder.toString();
	}
	
	
	
	

}
