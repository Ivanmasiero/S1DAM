package ivan.Tools;

public class cambioCharInt {

	public static void main(String[] args) {
		//Para pasar de char a int un truco es es restarle 0 al char para despues convertilo en int y que nos de el numero que queramos
		 
		char char1='5';
		int int1=char1-'0';
		System.out.printf("%d",int1);
		
		//Para pasar de int a char usaremos el mismo truco pero en vez de restar sumaremos
		
		int int2=4;
		char char2=(char)(int2+'0');
		System.out.printf("%n%c",char2);
		
	}

}
