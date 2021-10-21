package teste;

public class Contador {

	private static int contador = 0;

	private static int fator;
	
	public static void incrementaContador(){
		Contador.contador *= fator;
	}

	public int getContador() {
		return contador;
	}

	public void setFator(int fator) {
		this.fator = fator;
	}
	
}
