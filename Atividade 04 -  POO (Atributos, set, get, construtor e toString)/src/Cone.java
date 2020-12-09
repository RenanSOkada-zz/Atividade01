import java.util.Scanner;

public class Cone {
	
	Scanner entrada = new Scanner(System.in);

	private float r ;
	private float h ;
	private int tipoTinta ;
	double pi = 3.14 ;
	double a, b, c ;
	
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if(r > 0)
			this.r = r;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if (h > 0 ) 
			this.h = h;
	}
	public int getTipoTinta() {
		return tipoTinta;
	}
	public void setTipoTinta(int tipoTinta) {
		if (tipoTinta > 0 && tipoTinta <= 3)
			this.tipoTinta = tipoTinta;
	}
	
	public void infomar_AtributosCone () {
		System.out.println("Informe o raio do cone: ");
		r = entrada.nextFloat();
		setR(r);
		System.out.println("Informe a altura do cone: ");
		h = entrada.nextFloat();
		setH(h);
		System.out.println("Informe o tipo de tinta a ser pintado no cone (1, 2 ou 3): ");
		tipoTinta = entrada.nextInt();
		setTipoTinta(tipoTinta);
	}
	
	
	public double area_fundo () {
		return pi*r*r;		
	}
	
	public double geratriz() {
		a = r*r + h*h;
		return Math.sqrt(a);
	}
	
	public double area_lateral() {
		return  geratriz() *pi*r;
	}
	
	public double area_total(){
		return pi*r * (geratriz() + r);
	}
	
	public double litrosTinta () {
		return area_total() * 3.45 ; 
	}
	
	public double qDeLataNecessario () {
		b = litrosTinta() / 18;
		if (b % 1 != 0) {
			b = (b - (b % 1)) + 1 ;
		}
		return b ; 
	}
	
	public double pagar() {
		if (tipoTinta == 1 ){
			c = 238.90 * b ;
		}else if (tipoTinta == 2) {
			c = 467.98 * b ;
		}else {
			c = 758.34 * b ;
		}
		return c;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Cone: \n\n Raio = ");
		builder.append(r);
		builder.append("\n Altura= ");
		builder.append(h);
		builder.append("\n tipo de tinta escolhida = ");
		builder.append(tipoTinta);
		builder.append("\n area do fundo = ");
		builder.append(area_fundo());
		builder.append("\n geratriz = ");
		builder.append(geratriz());
		builder.append("\n area lateral = ");
		builder.append(area_lateral());
		builder.append("\n area total = ");
		builder.append(area_total());
		builder.append("\n litros de tinta = ");
		builder.append(litrosTinta());
		builder.append("\n quantidade de lataa necessaria(s) = ");
		builder.append(qDeLataNecessario());
		builder.append("\n precisará pagar = ");
		builder.append(pagar());
		return builder.toString();
	}
	
	
}
