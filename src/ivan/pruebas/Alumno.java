package ivan.pruebas;

public class Alumno extends persona{
	String matricula;
	int id;
	
	public Alumno() {
	}
	public Alumno(String matricula, int id,String nombre, String apellido,int edad) {
		super(nombre,apellido,edad);
		this.matricula=matricula;
		this.id=id;
	}
	public void mostrar() {
		System.out.println("mi id es: "+id);	
		System.out.println("mi nombre es: "+nombre);
		System.out.println("mi apellido es: "+apellido);
		System.out.println("mi edad es: "+edad);
		System.out.println("mi matricula es: "+matricula);

	}
}
