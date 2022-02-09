
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Servicio extends EntidadLista{
    //Atrivutos
    private final String codServicio;
    private final String direccionRemitente;
    private final String direccionDestino;
    private final String ruta;
    private final String fechaContratacion;
    private String fechaCumplimiento="no cumplida";
    private ListaSucursales sucursalesRecorridas=new ListaSucursales();
    private ArrayList <Producto> productosEncargados=new ArrayList();
    private final Cliente clienteServicio;
    private ListaVehiculos vehiculosInvolucrados=new ListaVehiculos();
    
    //Métodos
    public Servicio(String codServicio, String direccionRemitente, String direccionDestino,
            String ruta, String fechaContratacion, Cliente clienteServicio){
        this.codServicio=codServicio;
        this.direccionRemitente=direccionRemitente;
        this.direccionDestino=direccionDestino;
        this.ruta=ruta;
        this.fechaContratacion=fechaContratacion;
        this.clienteServicio=clienteServicio;
        super.InicializaLista(productosEncargados);
    }
    
    public void AniadirSucursal(Sucursal sucursal){
        sucursalesRecorridas.Agregar(sucursal);
    }
    
    public void AniadirVehiculo(Vehiculo vehiculo){
        vehiculosInvolucrados.Agregar(vehiculo);
    }
    
    public void AniadirProducto(Producto producto){
        productosEncargados.add(producto);
    }
    
    public String EliminarSucursal(String codSucursal){
        return sucursalesRecorridas.EliminarElemento(codSucursal);
    }
    
    public String EliminarVehiculo(String codVehiculo){
        return vehiculosInvolucrados.EliminarElemento(codVehiculo);
    }
    
    @Override
    public Producto Mostrar(String codProducto){
        return productosEncargados.get(BuscarElemento(codProducto));
    }
    
    public String MostrarServicio(){
        String mensaje;
        mensaje="Código de servicio: "+codServicio+".\n";
        mensaje+="Cliente del servicio:\n"+clienteServicio.Mostrar()+".\n";
        mensaje+="Dirección del remitente: "+direccionRemitente+".\n";
        mensaje+="Dirección de destino: "+direccionDestino+".\n";
        mensaje+="Ruta: "+ruta+".\n";
        mensaje+="Fecha de contratación: "+fechaContratacion+".\n";
        mensaje+="Fecha de cumplimiento: "+fechaCumplimiento+".\n";
        mensaje+="Información de sucursales recorridas:\n"+sucursalesRecorridas.Recorrer()+".\n";
        mensaje+="Productos encargados:\n"+Recorrer()+".\n";
        mensaje+="Información de vehiculos involucrados:\n"+vehiculosInvolucrados.Recorrer()+".\n";
        return mensaje;
    }
    
    public ListaSucursales getSucursalesRecorridas() {
        return sucursalesRecorridas;
    }

    public ListaVehiculos getVehiculosInvolucrados() {
        return vehiculosInvolucrados;
    }

    public String getCodServicio() {
        return codServicio;
    }

    public ArrayList<Producto> getProductosEncargados() {
        return productosEncargados;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getRuta() {
        return ruta;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public String getFechaCumplimiento() {
        return fechaCumplimiento;
    }

    public Cliente getClienteServicio() {
        return clienteServicio;
    }
    
    public void setFechaCumplimiento(String fechaCumplimiento) {
        this.fechaCumplimiento = fechaCumplimiento;
    }
    
    public void setEstadoProcesoProductos(int estado){
        for(Producto producto: productosEncargados){
            producto.setEstadoProceso(estado);
        }
    }
}
