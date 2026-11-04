package lista8;

public class PrevidenciaPrivada extends Investimento{
	
	private double valor;

	@Override
	public double calcularValorPagar() {
		
		return 0;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
