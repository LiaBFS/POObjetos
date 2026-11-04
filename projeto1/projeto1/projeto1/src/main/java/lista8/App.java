package lista8;

public class App {

	public static void main(String[] args) {
		
		
		ContaAgua agua = new ContaAgua();
		agua.setMetrosCubicos(100);
		agua.setPrecoMetro(2);
		
		PrevidenciaPrivada p = new PrevidenciaPrivada();
		p.setSaldo(10);
		p.setValor(300);
		
		Contas contas = new Contas();
		contas.incluirConta(p);
		contas.incluirConta(agua);
		
		System.out.println(contas.calcularTotalContas());
		
	}

}
