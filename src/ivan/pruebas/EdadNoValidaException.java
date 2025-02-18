package ivan.pruebas;

public class EdadNoValidaException extends Exception{
    public EdadNoValidaException(){
        super("Edad no valida");
    }
    public EdadNoValidaException(String message){
        super(message);
    }
}
