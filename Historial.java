
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Historial{
    //Atributos
    private ArrayList <Servicio> servicios=new ArrayList();
    
    //Métodos
    public boolean ExisteServicio(String codServicio){
        for(Servicio service: servicios){
            if(service.getCodServicio().equals(codServicio)){
                return true;
            }
        }
        return false;
    }
    
    public void AgregarServicio(Servicio servicio){
        servicios.add(servicio);
    }
    
    private int BuscarServicio(String codServicio){
        int index=0;
        for(int i=0;i<servicios.size();i++){
            if(servicios.get(i).getCodServicio().equals(codServicio)){
                index=i;
            }
        }
        return index;
    }
    
    public String EliminarServicio(String codServicio){
        if(ExisteServicio(codServicio)){
            if(servicios.remove(servicios.get(BuscarServicio(codServicio)))){
                return "Eliminado con exito.";
            }
            else{
                return "Error al eliminar.";
            }
        }
        else{
            return "No existe lo buscado";
        }
    }
    
    public Servicio MostrarServicio(String codServicio){
        return servicios.get(BuscarServicio(codServicio));
    }
    
    public String RecorrerHistorial(){
        String mensaje="";
        if(servicios.size()>0){
            for(Servicio service: servicios){
                mensaje+="________________________________________________\n";
                mensaje+=service.MostrarServicio();
                mensaje+="________________________________________________\n";
            }
        }else{
            mensaje="No hay servicios guardados.";
        }
        return mensaje;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }
    
}
