package teste;

public class TesteStatic {

	public static void main(String[] args) {
		
		Contador.incrementaContador();
		Contador.incrementaContador();
		Contador.incrementaContador();
		Contador.incrementaContador();
		Contador.incrementaContador();
		Contador.incrementaContador();

		Contador c1 = new Contador();
		c1.setFator(15);
		System.out.println(c1.getContador());
		
		Contador c2 = new Contador();
		System.out.println(c2.getContador());
		
	}
	
}
