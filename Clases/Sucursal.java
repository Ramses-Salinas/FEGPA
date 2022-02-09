
package Clases;


public class Sucursal extends EntidadIndividual{
    //Atributos
    private String ubicacion;
    private int tipoSucursal;//1: Central Nacional; 2:Central Regional; 3: Central Provinsial; 4: Central Distrital
    private String tipoSuc;
    
    //Métodos
    public Sucursal(String codSucursal, String ubicacion, int tipoSucursal){
        super(codSucursal);
        this.ubicacion=ubicacion;
        this.tipoSucursal=tipoSucursal;
        setTipoSuc(tipoSucursal);
    }
    @Override
    public String Mostrar(){
        String mensaje;
        mensaje="Código de sucursal: "+super.getCodigo()+".\nUbicación: "+ubicacion+".\nTipo de sucursal: "+tipoSuc+".\n";
        return mensaje;
    }
    private void setTipoSuc(int tipoSucursal){
        tipoSuc="Central ";
        switch(tipoSucursal){
            case 1: tipoSuc+="Nacional";
                break;
            case 2: tipoSuc+="Regional";
                break;
            case 3: tipoSuc+="Provincial";
                break;    
            case 4: tipoSuc+="Distrital";
                break;
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getTipoSucursal() {
        return tipoSucursal;
    }

    public String getTipoSuc() {
        return tipoSuc;
    }
    
}
