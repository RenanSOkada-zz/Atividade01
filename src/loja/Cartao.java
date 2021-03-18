
	package loja;

	public class Cartao{
		
		private double valor;
		private int NumCartao;
		
		public Cartao() {
		}
		
		public Cartao(double valor, int NumCartao) {
			setValor(valor);
			setNumCartao(NumCartao);
		}
		
		public double getValor() {
			return valor;
		}
		public int getNumCartao() {
			return NumCartao;
		}
		public void setValor(double valor) {
			if(valor>0)
			this.valor = valor;
		}
		public void setNumCartao(int numCartao) {
			if(numCartao>0)
			NumCartao = numCartao;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("cartao [valor=");
			builder.append(valor);
			builder.append(", NumCartao=");
			builder.append(NumCartao);

			builder.append("]");
			return builder.toString();
		}
		
		
		
	}


