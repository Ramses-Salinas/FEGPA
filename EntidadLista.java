
package Clases;

import java.util.ArrayList;
import java.util.List;


public abstract class EntidadLista {
    //Atributos
    private List <EntidadIndividual> contenedor;
    
    //Métodos
    public void InicializaLista(List elemento){
        contenedor=elemento;
    }
    
    public void Agregar(EntidadIndividual elemento){
        contenedor.add(elemento);
    }
    
    public String Recorrer(){
        String mensaje="";
        if(contenedor.size()>=1){
            for(int i=0; i<contenedor.size(); i++){
                mensaje+="________________________________________________\n";
                mensaje+=contenedor.get(i).Mostrar();
                mensaje+="________________________________________________\n";
            }
        }
        else{
            mensaje="Lista vacia";
        }
        return mensaje;
    }
    
    public boolean ExisteElemento(String codigo){
        for(EntidadIndividual elementos: contenedor){
            if(elementos.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    public int BuscarElemento(String codigo){
        int index=0;
        for(int i=0; i<contenedor.size(); i++){
            if(contenedor.get(i).getCodigo().equals(codigo)){
                index=i;
            }
        }
        return index;
    }
    
    public String EliminarElemento(String codigo){
        if(ExisteElemento(codigo)){
            if(contenedor.remove(contenedor.get(BuscarElemento(codigo)))){
                return "Eliminado con exito.";
            }
            else{
                return "Error al eliminar.";
            }
        }
        else{
            return "No existe cliente con el código dado.";
        }
    }
    
    public String EditaElemento(String codigo, EntidadIndividual elemento){
        if(ExisteElemento(codigo)){
            contenedor.set(BuscarElemento(codigo), elemento);
            return "Los datos han sido editados.";
        }
        else{
            return "No existe el elemento buscado";
        }
    }

    public abstract EntidadIndividual Mostrar(String codigo);
    
}
