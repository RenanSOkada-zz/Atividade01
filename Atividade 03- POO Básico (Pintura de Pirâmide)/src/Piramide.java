	
public class Piramide {
	
	double areaTriangulo,baseTriangulo, hTriangulo,areaBasePiramide,apotema,hPiramide;
	
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
