
package Clases;

import java.util.ArrayList;
import java.util.List;


public class ListaSucursales extends EntidadLista{
    //Atributos
    private ArrayList <Sucursal> sucursales=new ArrayList();
    
    //Métodos
    public ListaSucursales(){
        InicializaLista(sucursales);
    }   
    
    @Override
    public Sucursal Mostrar(String codSucursal){
        return sucursales.get(BuscarElemento(codSucursal));
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }
    
}
