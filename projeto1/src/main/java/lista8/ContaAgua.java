package lista8;

public class ContaAgua implements Pagavel{
	
	private int metrosCubicos;
	private double precoMetro;
	

	@Override
	public double calcularValorPagar() {
	
		return metrosCubicos*precoMetro;
	}


	public int getMetrosCubicos() {
		return metrosCubicos;
	}


	public void setMetrosCubicos(int metrosCubicos) {
		this.metrosCubicos = metrosCubicos;
	}


	public double getPrecoMetro() {
		return precoMetro;
	}


	public void setPrecoMetro(double precoMetro) {
		this.precoMetro = precoMetro;
	}
	
	
	

}
