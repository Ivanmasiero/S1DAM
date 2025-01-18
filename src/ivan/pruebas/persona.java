package ivan.pruebas;
import java.util.Scanner;

public class persona {
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}



	Scanner sc=new Scanner(System.in);
	
	String nombre;
	String apellido;
	int edad;
	
	
	public  static void actualizar(persona ins, String nombre,String apellido,int edad) {
	ins.nombre=nombre;
	ins.apellido=apellido;
	ins.edad=edad;
	}
	public persona(){
	}
	
	
	public persona(String nombre, String apellido, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		}
	public static void setNombre (persona ins, String nombre) {
		ins.nombre=nombre;
	}
	public void mostrar() {
		System.out.println("mi nommbre es: " +nombre );
		System.out.println("mi apellido es: "+apellido);
		System.out.println("mi edad es: "+edad);
	}
	
	

	public static void main(String[] args) {
		persona a=new persona("ivan","barria",20);
		a.mostrar();
		a.actualizar(a,"paula","sanchez",25);
		a.mostrar();
		a.setNombre(a, "jorge");
		a.mostrar();
		 
		persona b=new persona();
		
		
	
		
	
		
		
		

	}
}	
