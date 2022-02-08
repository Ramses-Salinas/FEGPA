
package Clases;


public abstract class EntidadIndividual {
    //Atributos
    private String codigo;
    
    //Método
    public EntidadIndividual(String codigo){
        this.codigo=codigo;
    }
    
    public abstract String Mostrar();

    public String getCodigo() {
        return codigo;
    }
    
}
