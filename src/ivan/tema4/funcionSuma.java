package ivan.tema4;

public class funcionSuma {
	
	static int f(int a,int b) { //En java da igual donde ponerlo
		int aux=a+b;
		return aux;
	}

	public static void main(String[] args) {
		int a=3;
		int b=4;
		int resultado= f(a,b);
		System.out.printf("%d",resultado);

	}

}
