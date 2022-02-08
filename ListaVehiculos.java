
package Clases;

import java.util.ArrayList;
import java.util.List;


public class ListaVehiculos extends EntidadLista{
    //Atributos
    private ArrayList<Vehiculo> vehiculos=new ArrayList();
    
    //Metodos
    public ListaVehiculos(){
        InicializaLista(vehiculos);
    }
    
    @Override
    public Vehiculo Mostrar(String codVehiculo){
        return vehiculos.get(BuscarElemento(codVehiculo));
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    
    
}
