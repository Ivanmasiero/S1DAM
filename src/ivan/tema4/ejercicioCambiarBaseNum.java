package ivan.tema4;

public class ejercicioCambiarBaseNum {

	public static void main(String[] args) {
		int dividendo,divisor,cosciente,resto;
		int n=30;
		int base=8;
		StringBuilder cad=new StringBuilder();
		dividendo=n;
		divisor=base;
		while(dividendo>=divisor) {
			cosciente=dividendo/divisor;
			resto=dividendo-(divisor*cosciente);
			cad.insert(0,resto);
			dividendo=cosciente;
		}
		cad.insert(0,dividendo);
		System.out.printf("El numero en binario es: %s",cad);

	}

}
