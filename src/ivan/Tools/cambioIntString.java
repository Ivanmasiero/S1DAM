package ivan.Tools;
//vamos a aprender a cambiar de int a string y alreves
public class cambioIntString {

	public static void main(String[] args) {
		
		//Primera forma de int a string
		int num =10;
		String numS=String.valueOf(num);
		System.out.printf("un int pasado a string -> %s",num);
		
		//Segunda forma
		int num2=20;
		String numS2=Integer.toString(num2);
		System.out.printf("%nun int a String de otra forma -> %s",num2);
		
		//Primera forma de string a int
		String numS3="123";
		int num3=Integer.valueOf(numS3);
		System.out.printf("%nun String a int -> %d",num3);
		
		//Segunda forma
		String numS4="321";
		int num4=Integer.parseInt(numS4);
		System.out.printf("%notra fomrma -> %d",num4);
		
		//Ahora lo haremos si tiene una letra
		
		String numS5="123a4";
		String numS5num=numS5.replaceAll("[^0-9]","");// [^0-9] quiere decir que cualquier cosa que no sea digito  se remplace por ""
		int num5=Integer.parseInt(numS5num);
		System.out.printf("%nHemos quitado la letra de la cadena y lo sacamos como int -> %d",num5);
		

	}

}
