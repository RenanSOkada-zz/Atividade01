package loja;

public abstract class Papel {
	
	private String Tipo;

	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public abstract void TipoPapel();
}
