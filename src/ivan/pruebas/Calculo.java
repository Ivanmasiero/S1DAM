package ivan.pruebas;

public class Calculo {
	int añoNacimiento;
	int añoActual=2024;
	int edad;
	
	public void valor(int nuevoAñoNacimiento) {
		this.añoNacimiento=nuevoAñoNacimiento;
		 
	}
	
	public static void  edad(Calculo ins) {
		ins.edad=ins.añoActual-ins.añoNacimiento;
	
	}
	public void mostrar() {
		System.out.println(this.edad);
	}
	

	public static void main(String[] args) {
		
		Calculo a=new Calculo();
		a.valor(2000);
		a.edad(a);
		a.mostrar();
		Calculo b=new Calculo();
		b.valor(2004);
		b.edad(b);
		b.mostrar();
		
		

	}

}
