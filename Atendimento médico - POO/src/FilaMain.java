
public class FilaMain {

	public static void main(String[] args) {
		
		//---------------------Atendimentos------------------------
		Atendimento ate1 = new Atendimento("15:30", "15:50", "Não Urgente", "Consultar vacinação", "15/06/2014");
		Paciente p1 = new Paciente("Osvaldo da Silva", "33" , "792137123");
		
		Atendimento ate2= new Atendimento("12:45", "16:00", "Urgente", "Tem disúria", "15/06/2014");
		Paciente p2 = new Paciente("Maria Clara", "25" , "341234123");
		
		Atendimento ate3 = new Atendimento("18:20", "01:29", "Emergencia", "Parada Cardiaca", "16/06/2014");
		Paciente p3 = new Paciente("Matheus Henrique", "39" , "6453214");
		
		//---------------------Filas a serem utilizadas------------------------
		Fila jaAtendidos = new Fila();
		Fila paraAtender = new Fila();
		
		//---------------------Pacientes------------------------
		paraAtender.inserir("Osvaldo da Silva", 92847263);
		paraAtender.AddIAtendiemento("15:30", "15:50", "Não Urgente", "Consultar vacinação", "15/06/2014");

		paraAtender.inserir("Maria Clara", 123423412);
		paraAtender.AddIAtendiemento("12:45", "16:00", "Urgente", "Tem disúria", "20/04/2017");
		
		paraAtender.inserir("Matheus Henrique", 462351432);
		paraAtender.AddIAtendiemento("18:20", "01:29", "Emergencia", "Parada Cardiaca", "30/01/2020");
		
		paraAtender.inserir("Felipe Araujo", 576235183);
		paraAtender.AddIAtendiemento("17:10", "Ainda não atendido", "Não Urgente", "Consultar medicamento", "15/06/2014");
		
		paraAtender.inserir("Maria Clara", 442352323);
		paraAtender.AddIAtendiemento("17:50", "Ainda não atendido", "Pouco Urgente", "Tosses sem sinal de risco", "15/06/2014");
		
		paraAtender.inserir("Lucas Pereira", 67234524);
		paraAtender.AddIAtendiemento("12:20", "Ainda não atendido", "Não Urgente", "Atendimento de rotina", "15/06/2014");
		
		paraAtender.inserir("Luana Dala", 376235452);
		paraAtender.AddIAtendiemento("13:49", "Ainda não atendido", "Pouco Urgente", "Dor leve na lombar", "15/06/2014");
		
		paraAtender.inserir("Nina da Silva", 83746278);
		paraAtender.AddIAtendiemento("14:18", "Ainda não atendido", "Urgente ", "Crise", "15/06/2014");
		
		paraAtender.inserir("Luiz Felipe", 749283746);
		paraAtender.AddIAtendiemento("15:26", "Ainda não atendido", "Nao Urgente ", "Dores fracas", "15/06/2014");
		
		paraAtender.inserir("Gabriel Castro" , 31241234);
		paraAtender.AddIAtendiemento("17:48", "Ainda não atendido", "Urgente", "Febre moderada", "15/06/2014");
		
		paraAtender.inserir("Joao Lucas" , 32465423);
		paraAtender.AddIAtendiemento("18:35", "Ainda não atendido", "Urgente", "Necessita de isolamento", "15/06/2014");
		
		paraAtender.inserir("Dariu rel", 462351432);
		paraAtender.AddIAtendiemento("14:27", "Ainda não atendido", "Emergencia", "Comprometimento nas vias aereas", "15/06/2014");
		
		paraAtender.inserir("Zé Neto", 63178263);
		paraAtender.AddIAtendiemento("11:30", "Ainda não atendido", "Nao Urgente ", "Exames de rotina", "15/06/2014");
		
		paraAtender.inserir("Felipe Araujo", 632348234);
		paraAtender.AddIAtendiemento("09:41", "Ainda não atendido", "Nao Urgente ", "Conflitos e crises familiares", "15/06/2014");
	
		paraAtender.inserir("Juliano Saft", 7623781);
		paraAtender.AddIAtendiemento("11:47", "Ainda não atendido", "Urgente", "Depressão", "15/06/2014");
		
		paraAtender.inserir("Marcelo Felipe", 65763527);
		paraAtender.AddIAtendiemento("18:27", "Ainda não atendido", "Emergencia", "Convulsão", "15/06/2014");
		
		
		paraAtender.inserir("Valéria Figueireida", 462351432);
		paraAtender.AddIAtendiemento("17:43", "Ainda não atendido", "Emergencia", "Baixo nivel de consciencia", "15/06/2014");
		
		
		paraAtender.inserir("José Neto", 328746232);
		paraAtender.AddIAtendiemento("11:21", "Ainda não atendido", "Urgente", "Dor consideravel no abdomen", "15/06/2014");
		
		paraAtender.inserir("Raissa Ord", 76312873);
		paraAtender.AddIAtendiemento("17:25", "Ainda não atendido", "Urgente", "Gestante", "15/06/2014");
		
		paraAtender.inserir("Fernanda Ferreira", 8731297);
		paraAtender.AddIAtendiemento("19:57", "Ainda não atendido", "Urgente", "Crise de asma", "15/06/2014");
		
		paraAtender.mostrarFila();
		paraAtender.mostraAtendimento();
		
		//---------------------Médicos------------------------
		Medico m1 = new Medico("Osvaldo da Silva", "33" , "792137123", "Catarina Amanda", "Clinico Geral");
		
		m1.addPaciente(p1);
		m1.AddIAtendiemento(ate1);
		paraAtender.ClienteAtendido("15:50");
		System.out.println("Médico responsavel: " + "Catarina Amanda"  + "\nChegada do paciente: " + "15:30\n");
		jaAtendidos.inserir("Osvaldo da Silva", 92847263);
		
		Medico m2 = new Medico("Maria Clara", "25" , "341234123", "Henrique Benício", "Urologista");
		m2.addPaciente(p2);
		m2.AddIAtendiemento(ate2);
		paraAtender.ClienteAtendido("16:00");
		System.out.println("Médico responsavel: " + "Henrique Benício"  + "\nChegada do paciente: " + "12:45\n");
		jaAtendidos.inserir("Maria Clara", 123423412);
		
		Medico m3 = new Medico("Matheus Henrique", "39" , "6453214", "Lívia Isis", "Cardiologista");
		m3.addPaciente(p3);
		m3.AddIAtendiemento(ate3);
		paraAtender.ClienteAtendido("01:29");
		System.out.println("Médico responsavel: " + "Lívia Isis" + "\nChegada do paciente: " + "18:20\n");
		jaAtendidos.inserir("Matheus Henrique", 462351432);
		
		paraAtender.mostrarFila();
		
	}

}
