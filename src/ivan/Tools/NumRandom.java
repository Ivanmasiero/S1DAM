package ivan.Tools;
import java.util.Random;
// Clase para sacar un numero aleatorio

public class NumRandom {
	public static int Random(int m, int n){
		Random r= new Random();
        return r.nextInt(n-m+1)+m;
    }
}
