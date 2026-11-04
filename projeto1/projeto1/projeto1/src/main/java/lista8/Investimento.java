package lista8;

public abstract class Investimento implements Pagavel{
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	//só a classe e suas filhas conseguem usar o método, pois ele é protected (#)

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
