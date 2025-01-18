package ivan.pruebas;

public class prueba6 {
	
	public static void tonta(String a, String b) {
		a=b;
	}

	public static void main(String[] args) {
	
		
		String caca="caca";
		String peo="peo";
		
		tonta(caca,peo);
		
		System.out.printf("%s y %s%n",caca,peo);
		caca=peo;
		System.out.printf("%s y %s",caca,peo);

	}

}
