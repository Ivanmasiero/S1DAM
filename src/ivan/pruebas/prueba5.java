package ivan.pruebas;

public class prueba5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		      
		           char char1 = '0';
		           char char2 = '1';
		           int x = char1;
		           int y = char2;

		           System.out.println("ASCII value of '" + char1 + "' is " + x);
		           System.out.println("ASCII value of '" + char2 + "' is " + y);
		           System.out.println(y-x);
		           
		           char char3 = 'A';
		           System.out.println("ASCII value of '" + char3 + "' is " + (int)char3);
		           System.out.println(char3+1);
		           
		           char char4 = '1';
		           char char5 = '0';
		           char char6 = '9';

		           int x1 = Character.getNumericValue(char4);
		           int y2 = Character.getNumericValue(char5);
		           int z = Character.getNumericValue(char6);

		           System.out.println(x1);
		           System.out.println(y2);
		           System.out.println(z + 1);
		   
	}

}
