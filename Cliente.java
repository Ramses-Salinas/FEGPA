
package Clases;


public class Cliente extends EntidadIndividual{
    //Atributos
    private String  nombre, dni, nota="", tipoCli;
    private int tipoCliente;//1: cliente nuevo. 2: cliente recurrente. 3:cliente VIP
    
    //Metodos 
    private void inicializaAtributos(String nombre, String dni, int tipoCliente){
        this.nombre=nombre;
        this.dni=dni;
        this.tipoCliente=tipoCliente;
        switch(tipoCliente){
            case 1: tipoCli="Nuevo";
                break;
            case 2: tipoCli="Recurrente";
                break;
            case 3: tipoCli="VIP";
                break;    
        }
    }
    public Cliente(String codigoCliente, String nombre, String dni, int tipoCliente, String nota){
        super(codigoCliente);
        inicializaAtributos(nombre,dni,tipoCliente);
        this.nota=nota;
    }
    public Cliente(String codigoCliente, String nombre, String dni, int tipoCliente){
        super(codigoCliente);
        inicializaAtributos(nombre,dni,tipoCliente);
    }
    @Override
    public String Mostrar(){
        String mensaje;
        if(nota.equals("")){
            mensaje="Codigo de cliente: "+super.getCodigo()+"\nNombre: "+nombre+"\nDNI: "+dni+"\nTipo cliente: "+tipoCli+".\n";
        }
        else{
            mensaje="Codigo de cliente: "+super.getCodigo()+"\nNombre: "+nombre+"\nDNI: "+dni+"\nTipo cliente: "+tipoCli+"\nNota: "+nota+".\n";
        }
        return mensaje;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNota() {
        return nota;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }
    
    
}
