package ivan.pruebas;

public class StringDaolaVuelta {
	
	public static String vuelta(String a) {
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		String a="hola";
		System.out.println(vuelta(a));

	}

}
