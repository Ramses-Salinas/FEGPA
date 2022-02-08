
package Clases;


import java.util.*;

public class ListaClientes extends EntidadLista{
    //Atributos
    private ArrayList<Cliente> clientes=new ArrayList();
    
    //Metodos
    public ListaClientes(){
        InicializaLista(clientes);
    }
    
    @Override
    public Cliente Mostrar(String codCliente){
        return clientes.get(BuscarElemento(codCliente));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    
    
}
