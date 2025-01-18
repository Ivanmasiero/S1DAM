package ivan.tema4;

public class numeroPrimos {

	public static void main(String[] args) {
		int n,c,r;
		n=7;
		for(int i=2;i<=n;i++) {
			boolean esPrimo=true;
			for(int j=2;j<i;j++) {
				c=i/j;
				r=i-(j*c);
				if(r==0) { 
					esPrimo=false;
				}
			}
			if(esPrimo)
				System.out.printf("%d,",i);
		}

	}

}
