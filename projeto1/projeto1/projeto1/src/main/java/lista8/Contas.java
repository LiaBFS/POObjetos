package lista8;

import java.util.ArrayList;

public class Contas {
	
	private ArrayList<Pagavel> contas = new ArrayList();
	
	public void incluirConta(Pagavel conta) {
		contas.add(conta);
	}
	
	public double calcularTotalContas() {
		double total=0;
		for(Pagavel conta: contas) {
			total += conta.calcularValorPagar();
			
		}
		
		return total;
	}

}
