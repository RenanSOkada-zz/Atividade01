	
public class Piramide {
	
	double areaTriangulo,baseTriangulo, hTriangulo,areaBasePiramide;
	private double hPiramide, apotema;
	private int tipoTinta ; 
	
	public double gethPiramide() {
		return hPiramide;
	}
	
	public double getApotema() {
		return apotema;
	}

	public int getTipoTinta() {
		return tipoTinta;
	}
	
	public void sethPiramide(double hPiramide) {
		if (hPiramide > 0)
			this.hPiramide = hPiramide;
	}
	
	public void setApotema(double apotema) {
		if (apotema > 0)
			this.apotema = apotema;
	}
	
	public void setTipoTinta(int tipoTinta) {
		if (tipoTinta > 0 && tipoTinta <= 3)
			this.tipoTinta = tipoTinta;
	}
	
	public double triangulo (){
		areaTriangulo = baseTriangulo * hTriangulo / 2;
		return areaTriangulo;	
	}
	public double volumePiramide (){
		return areaBasePiramide * hPiramide / 3;
}
	public double areaTotal (){
		return (areaTriangulo*4) + areaBasePiramide;
}
}
