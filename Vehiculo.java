
package Clases;


public class Vehiculo extends EntidadIndividual{
    //Atributos
    private float maxCapPeso;
    private boolean disponibilidad;//True:disponible; False: no disponible
    private String sucursalOrigen,  lugarUltimoReporte, nota="",tipoReco;
    private int tipoRecorrido;
    
    //Metodos
    private void inicializaAtributos(float maxCapPeso, boolean disponibilidad, String sucursalOrigen, String lugarUltimoReporte, int tipoRecorrido){
        
        this.maxCapPeso=maxCapPeso;
        this.disponibilidad=disponibilidad;
        this.sucursalOrigen=sucursalOrigen;
        this.lugarUltimoReporte=lugarUltimoReporte;
        this.tipoRecorrido=tipoRecorrido;
        setTipoReco(tipoRecorrido);
    }
    public Vehiculo(float maxCapPeso, boolean disponibilidad, String sucursalOrigen, String codVehiculo, String lugarUltimoReporte, int tipoRecorrido, String nota){
        super(codVehiculo);
        inicializaAtributos(maxCapPeso,disponibilidad,sucursalOrigen,lugarUltimoReporte,tipoRecorrido);
        this.nota=nota;
    }
    public Vehiculo(float maxCapPeso, boolean disponibilidad, String sucursalOrigen, String codVehiculo, String lugarUltimoReporte, int tipoRecorrido){
        super(codVehiculo);
        inicializaAtributos(maxCapPeso,disponibilidad,sucursalOrigen,lugarUltimoReporte,tipoRecorrido);
    }
    @Override
    public String Mostrar(){
        String mensaje;
        mensaje="Codigo de vehiculo: "+super.getCodigo()+"\n"+"Sucursal de origen: "+sucursalOrigen+"\n"+"Lugar de ultimo reporte: "+lugarUltimoReporte+"\n";
        mensaje+="Tipo de recorrido: "+tipoRecorrido+"\n"+"Maxima capacidad de carga: "+maxCapPeso+"\n"+"Disponibilidad: "+disponibilidad+"\n";
        if(!nota.equals("")){
            mensaje+="Nota: "+nota+".\n";
        }
        return mensaje;
    }
    private void setTipoReco(int tipoRecorrido){
        switch(tipoRecorrido){
            case 1:tipoReco="Urbano";
                break;
            case 2: tipoReco="Interprovinsial";
                break;
            case 3: tipoReco="Interregional";
                break;
        }
    }
    public float getMaxCapPeso() {
        return maxCapPeso;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public String getSucursalOrigen() {
        return sucursalOrigen;
    }

    public String getLugarUltimoReporte() {
        return lugarUltimoReporte;
    }

    public String getNota() {
        return nota;
    }

    public int getTipoRecorrido() {
        return tipoRecorrido;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
