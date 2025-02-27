package ivan.POO.EjercicioMatriz.EjercicioMatriz;
/*
Vamos a crear una clase que nos permita crear una matriz de una sola dimension que sea dispersa, de tal forma de que
se enlace.
 */

public class MatrizD {
    private int index;
    private int value;
    private MatrizD nextNode; //puntero al siguiente nodo
    private MatrizD prevNode;
    /**
     * Creo un objeto tipo Matriz, sin valores y sin indices
     */
    public MatrizD(){
    this.nextNode=null;
    }
    /**
     * Me permite buscar la referencia del nodo buscado por indice y devuelve null si no lo encuentra
     * @param index a buscar
     * @return La referencia del nodo
     */
    private MatrizD find(int index) {
        MatrizD node=nextNode;
        while (node!=null){
            if (node.index==index) return node;
            node=node.nextNode;
        }
        return node;
    }
    /**
     * Permite asignar un valor al indice que queramos, en caso de escoger un indice ya asignado se sobreescribira el
     * valor
     * @param value debe ser entero <<<<< control de errores
     * @param index debe ser entero <<<<<
     */
    public void setNum(int value, int index){
        if (find(index)!=null)
            find(index).value=value;
        else {
            MatrizD newNode=new MatrizD();
            newNode.index=index;
            newNode.value=value;
            MatrizD node=this;
            while (node.nextNode!=null)
                node=node.nextNode;
            node.nextNode=newNode;
        }
    }
    /**
     * Devuelve el valor del indice introducido, en caso de que no exista el indice devolver error <<<< control de err
     * @param index valor entero
     * @return valor del contenido
     */
    public int getNum(int index) {
        if(find(index)==null) throw new IllegalArgumentException("Indice incorrecto");
        else
            return find(index).value;
    }
    @Override
    public String toString() {
        String value= "Matriz { ";
        MatrizD node=nextNode;
        while (node!=null){
            value+="Indice: "+node.value+" Valor: "+node.value;
            node=node.nextNode;
        }
        value+=" }";
        return value;
    }
}
