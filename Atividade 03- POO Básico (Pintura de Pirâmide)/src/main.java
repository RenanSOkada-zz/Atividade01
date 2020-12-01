import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		float apotema ;
		int tipoTinta;
		double al, qDeLataNecessario,litrosTinta, pagar, alturaP;
		
		Scanner entrada = new Scanner (System.in);
		Piramide pira = new Piramide ();
			
		System.out.print("informe a altura da piramide:");
		alturaP = entrada.nextFloat();
		pira.sethPiramide(alturaP);
		
		System.out.print("Informe o valor da Apótema da base da pirâmide:");
		apotema = entrada.nextFloat();
		pira.setApotema(apotema);
		
		System.out.print("Agora informe o tipo de tinta que deseja pintar a piramide(1,2 ou 3):");
		tipoTinta = entrada.nextInt();
		pira.setTipoTinta(tipoTinta);
		
		al = Math.sqrt((pira.getApotema() * pira.getApotema()) + (pira.gethPiramide() * pira.gethPiramide()));
		
		pira.baseTriangulo = pira.getApotema()*2;
		pira.hTriangulo = al;
		pira.areaBasePiramide = (pira.getApotema()*2)*(pira.getApotema()*2);
		pira.areaTriangulo = (pira.getApotema()*2) * al / 2 ;
		litrosTinta =  pira.areaTotal() / 4.76  ; 
		qDeLataNecessario = litrosTinta / 18;
		
		if (qDeLataNecessario % 1 != 0) {
			qDeLataNecessario = (qDeLataNecessario - (qDeLataNecessario % 1)) + 1 ;
		}
	System.out.println("");
	System.out.println("Tipo de tinta escolhida :" + "Tinta " + pira.getTipoTinta());
	System.out.println("Area do triângulo é :" + pira.areaTriangulo);
	System.out.println("Quantidade de litros de tinta necessário: " + litrosTinta);
	System.out.println("O volume da piramide é:" + pira.volumePiramide());
	System.out.println("Quantidade de latas necessários: " + qDeLataNecessario);
	
	
	System.out.println("");
	if (tipoTinta == 1 ){
		pagar = 127.9 * qDeLataNecessario ;
	}else if (tipoTinta == 2) {
		pagar = 258.98 * qDeLataNecessario ;
	}else {
		pagar = 344.34 * qDeLataNecessario ;
	}
	System.out.println("Você precisará pagar:" + pagar);
	
			
	
	}

}
