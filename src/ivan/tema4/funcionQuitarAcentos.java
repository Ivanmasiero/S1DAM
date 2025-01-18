package ivan.tema4;

public class funcionQuitarAcentos {
	static String quitarAcentos(String cad) {
		String origen="áéíóúÁÉÍÓÚ";
		String destino="aeiouAEIOU";
		StringBuilder cadFinal=new StringBuilder("");
		for(int i=0;i<cad.length();i++) {
			char buscado=cad.charAt(i);
			boolean bandera=true;
			int j=0;
			for( j=0;j<origen.length();j++) {
				if(buscado==origen.charAt(j)) {
					bandera=false;
					break;
				}
			}
			if (bandera) 
			cadFinal.append(buscado);
			else
			cadFinal.append(destino.charAt(j));
		}
		return cadFinal.toString();
	}
	public static void main(String[] args) {
		System.out.println(quitarAcentos("LéÓn"));		
	}
}