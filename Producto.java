
package Clases;

public class Producto extends EntidadIndividual{
    //Atributos
    private String lugarDestino;
    private boolean perecible;
    private int gradoFragilidad;//fragilidad 1: baja; 2: media; 3: alta
    private String gradoFra;
    private int vidaUtil;//en días
    private double peso;
    private int estadoProceso;//1: solicitado; 2: Paquete en almacen; 3: En transporte; 4: entregado
    private String estadoPro;
    private int numPartes;
    
    //Métodos
    private void setGradoFra(int gradoFragilidad){
        switch(gradoFragilidad){
            case 1: gradoFra="baja";
                break;
            case 2: gradoFra="media";
                break;
            case 3: gradoFra="alta";
                break;    
        }
    }
    
    private void setEstadoPro(int estadoProceso){
        switch(estadoProceso){
            case 1: estadoPro="Solicitado";
                break;
            case 2: estadoPro="Paquete en almacen";
                break;
            case 3: estadoPro="En transporte";
                break;
            case 4: estadoPro="Entregado";
                break;
        }
    }
    
    public Producto(String codProducto, String lugarDestino, boolean perecible, 
            int gradoFragilidad, int vidaUtil, double peso, int estadoProceso,
            int numPartes){
        super(codProducto);
        this.lugarDestino=lugarDestino;
        this.perecible=perecible;
        this.estadoProceso=gradoFragilidad;
        this.vidaUtil=vidaUtil;
        this.peso=peso;
        this.estadoProceso=estadoProceso;
        this.numPartes=numPartes;
        setGradoFra(this.estadoProceso);
        setEstadoPro(this.estadoProceso);
    }
    
    public void setEstadoProceso(int estadoProceso){
        this.estadoProceso=estadoProceso;
        setEstadoPro(estadoProceso);
    }

    public int getGradoFragilidad() {
        return gradoFragilidad;
    }

    public int getEstadoProceso() {
        return estadoProceso;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public boolean isPerecible() {
        return perecible;
    }

    public String getGradoFra() {
        return gradoFra;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public double getPeso() {
        return peso;
    }

    public String getEstadoPro() {
        return estadoPro;
    }

    public int getNumPartes() {
        return numPartes;
    }
    
    @Override
    public String Mostrar(){
        String mensaje;
        String pereci;
        if(perecible){
            pereci="Sí";
        }else{
            pereci="No";
        }
        mensaje="Código del producto: "+super.getCodigo()+".\n";
        mensaje+="Lugar de destino: "+lugarDestino+".\n";
        mensaje+="Perecible: "+pereci+".\n";
        mensaje+="Grado de frgilidad: "+gradoFra+".\n";
        mensaje+="Vida útil: "+vidaUtil+" días.\n";
        mensaje+="Peso: "+peso+".\n";
        mensaje+="Estado del proceso: "+estadoPro+".\n";
        mensaje+="Número de partes: "+numPartes+".\n";
        return mensaje;
    }
    
}
