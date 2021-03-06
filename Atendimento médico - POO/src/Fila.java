import java.util.ArrayList;
import java.util.List;


public class Fila {
	private Nodo inicio = null;
	private Nodo fim = null;
	private Nodo aux = null;

	
	public void inserir(String nome, int Telefone){
		Nodo novo = new Nodo();
		
		novo.nome = nome;
		novo.Telefone = Telefone;
		
		if (inicio == null){
			inicio = novo;
			fim = novo;
			novo.prox = null;
		}
		else
		{
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
	}
	
	public void mostrarFila(){
		if (inicio == null){
			System.out.println("Fila vazia");
		}
		else
		{
			
			System.out.println("\nMostrando toda fila para ser atendida");
			aux = inicio;
			while(aux != null){
				System.out.print(aux.nome+ "\t"+ aux.Telefone+ "\n");
				aux = aux.prox;
			}
			
		}
		System.out.println();
	}
	
	public void mostraAtendimento() {
		System.out.println("Lista dos atendimentos (Em ordem)): ");
			
			for (Atendimento atendimento : IAtendiemento) {
				System.out.println(atendimento.toString());
			}
			
			System.out.println();
	}
 public void ClienteAtendido(String HoraAtendido){
	 if (inicio == null){
			
			System.out.println("Fila vazia");
		}
		else
		{
			
			
			System.out.println("Cliente: "+ inicio.nome+ " atendido as " + HoraAtendido);
		
			inicio = inicio.prox;
		}		
    }
 public void  esvaziarLista (){
		if (inicio == null){
			
			System.out.println("Fila vazia!!!");
		}
		else
		{
			inicio = null;
			System.out.println("Fila esvaziada");
		}
 }
 public Nodo getInicio(){
	 return this.inicio;
 }
 
 	List<Atendimento> IAtendiemento = new ArrayList<Atendimento>();
 	
 	public boolean AddIAtendiemento (String começo, String termino, String NivelPrioridade, String PerguntaDePriori, String DataAtendida) {
 		Atendimento i = new Atendimento( começo,  termino,  NivelPrioridade,  PerguntaDePriori,  DataAtendida);

		return 	IAtendiemento.add(i);
	}
 
}
