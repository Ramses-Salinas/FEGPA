package Guardar;

import Clases.Cliente;
import Clases.Historial;
import Clases.ListaClientes;
import Clases.ListaSucursales;
import Clases.ListaVehiculos;
import Clases.Producto;
import Clases.Servicio;
import Clases.Sucursal;
import Clases.Vehiculo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Guardar {

    private static final Workbook excel = new XSSFWorkbook();
    private static final Sheet clientes = excel.createSheet("Clientes");
    private static final Sheet vehiculos = excel.createSheet("Vehiculos");
    private static final Sheet sucursales = excel.createSheet("Sucursales");
    private static final Sheet productos = excel.createSheet("Prouctos");

    private static void creaArchivo() {
        try {
            FileOutputStream fileout = new FileOutputStream("Hitorial.xlsx");
            excel.write(fileout);
            fileout.close();
            System.out.println("Creado ");
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1: "+ex);
        } catch (IOException ex) {
            System.out.println("Error 2: "+ex);
        }
    }

    public static void crearExcel() {
        Row encabezadoClientes = clientes.createRow(0);
        encabezadoClientes.createCell(0).setCellValue("Código");
        encabezadoClientes.createCell(1).setCellValue("Nombre");
        encabezadoClientes.createCell(2).setCellValue("DNI");
        encabezadoClientes.createCell(3).setCellValue("Tipo");
        encabezadoClientes.createCell(4).setCellValue("Nota");

        Row encabezadoVehiculos = vehiculos.createRow(0);
        encabezadoVehiculos.createCell(0).setCellValue("Código");
        encabezadoVehiculos.createCell(1).setCellValue("Máxima capacidad de carga");
        encabezadoVehiculos.createCell(2).setCellValue("Disponibilidad");
        encabezadoVehiculos.createCell(3).setCellValue("Sucursal de Origen");
        encabezadoVehiculos.createCell(4).setCellValue("Lugar de último reporte");
        encabezadoVehiculos.createCell(5).setCellValue("Tipo de recorrido");
        encabezadoVehiculos.createCell(6).setCellValue("Nota");

        Row encabezadoSucursales = sucursales.createRow(0);
        encabezadoSucursales.createCell(0).setCellValue("Código");
        encabezadoSucursales.createCell(1).setCellValue("Ubicación");
        encabezadoSucursales.createCell(2).setCellValue("Tipo");

        Row encabezadoProductos = productos.createRow(0);
        encabezadoProductos.createCell(0).setCellValue("Código de servicio");
        encabezadoProductos.createCell(1).setCellValue("Código de producto");
        encabezadoProductos.createCell(2).setCellValue("Destino");
        encabezadoProductos.createCell(3).setCellValue("Perecicle");
        encabezadoProductos.createCell(4).setCellValue("Grado fragilidad");
        encabezadoProductos.createCell(5).setCellValue("Vida útil");
        encabezadoProductos.createCell(6).setCellValue("Peso");
        encabezadoProductos.createCell(7).setCellValue("Estado de proceso");
        encabezadoProductos.createCell(8).setCellValue("Número de partes");

        creaArchivo();

    }

    public static void agregarServicio(Servicio service) {
        Sheet servicio = excel.createSheet(service.getCodServicio());

        Row encabezadoServicio = servicio.createRow(0);
        encabezadoServicio.createCell(0).setCellValue("Cliente");
        encabezadoServicio.createCell(1).setCellValue("Sucursales recorridas");
        encabezadoServicio.createCell(2).setCellValue("Vehiculos involucrados");
        encabezadoServicio.createCell(3).setCellValue("Productos");
        encabezadoServicio.createCell(4).setCellValue("Dirección del remitente");
        encabezadoServicio.createCell(5).setCellValue("Dirección del destinatario");
        encabezadoServicio.createCell(6).setCellValue("Ruta");
        encabezadoServicio.createCell(7).setCellValue("Fecha de contratación");
        encabezadoServicio.createCell(8).setCellValue("Fecha de cumplimiento");

        Row fila1 = servicio.createRow(1);
        fila1.createCell(0).setCellValue(service.getClienteServicio().getCodigo());
        fila1.createCell(4).setCellValue(service.getDireccionRemitente());
        fila1.createCell(5).setCellValue(service.getDireccionDestino());
        fila1.createCell(6).setCellValue(service.getRuta());
        fila1.createCell(7).setCellValue(service.getFechaContratacion());
        fila1.createCell(8).setCellValue(service.getFechaCumplimiento());
        int i = 1;
        for (Sucursal sucur : service.getSucursalesRecorridas().getSucursales()) {
            try {
                Row fila = servicio.getRow(i);
                fila.createCell(1).setCellValue(sucur.getCodigo());
                i++;
            } catch (NullPointerException ex) {
                Row fila = servicio.createRow(i);
                fila.createCell(1).setCellValue(sucur.getCodigo());
                i++;
            }
        }
        i = 1;
        for (Vehiculo vehi : service.getVehiculosInvolucrados().getVehiculos()) {
            try {
                Row fila = servicio.getRow(i);
                fila.createCell(2).setCellValue(vehi.getCodigo());
                i++;
            } catch (NullPointerException ex) {
                Row fila = servicio.createRow(i);
                fila.createCell(2).setCellValue(vehi.getCodigo());
                i++;
            }
        }
        i = 1;
        for (Producto pro : service.getProductosEncargados()) {
            try {
                Row fila = servicio.getRow(i);
                fila.createCell(3).setCellValue(pro.getCodigo());
                i++;
            } catch (NullPointerException ex) {
                Row fila = servicio.createRow(i);
                fila.createCell(3).setCellValue(pro.getCodigo());
                i++;
            }
        }

        creaArchivo();
    }

    public static void guardar(Historial historia, ListaClientes cli, ListaVehiculos vehi, ListaSucursales sucur) {
        int i = 1;
        for (Cliente client : cli.getClientes()) {
            Row fila = clientes.createRow(i);
            fila.createCell(0).setCellValue(client.getCodigo());
            fila.createCell(1).setCellValue(client.getNombre());
            fila.createCell(2).setCellValue(client.getDni());
            fila.createCell(3).setCellValue(client.getTipoCliente());
            fila.createCell(4).setCellValue(client.getNota());
            i++;
        }
        i = 1;
        for (Vehiculo veh : vehi.getVehiculos()) {
            Row fila = vehiculos.createRow(i);
            fila.createCell(0).setCellValue(veh.getCodigo());
            fila.createCell(1).setCellValue(veh.getMaxCapPeso());
            fila.createCell(2).setCellValue(veh.getDisponibilidad());
            fila.createCell(3).setCellValue(veh.getSucursalOrigen());
            fila.createCell(4).setCellValue(veh.getLugarUltimoReporte());
            fila.createCell(5).setCellValue(veh.getTipoRecorrido());
            fila.createCell(6).setCellValue(veh.getNota());
            i++;
        }
        i = 1;
        for (Sucursal suc : sucur.getSucursales()) {
            Row fila = sucursales.createRow(i);
            fila.createCell(0).setCellValue(suc.getCodigo());
            fila.createCell(1).setCellValue(suc.getUbicacion());
            fila.createCell(2).setCellValue(suc.getTipoSucursal());
            i++;
        }

        for (Servicio service : historia.getServicios()) {
            i = 1;
            for (Producto produc : service.getProductosEncargados()) {
                Row fila = productos.createRow(i);
                fila.createCell(0).setCellValue(service.getCodServicio());
                fila.createCell(1).setCellValue(produc.getCodigo());
                fila.createCell(2).setCellValue(produc.getLugarDestino());
                fila.createCell(3).setCellValue(produc.isPerecible());
                fila.createCell(4).setCellValue(produc.getGradoFragilidad());
                fila.createCell(5).setCellValue(produc.getVidaUtil());
                fila.createCell(6).setCellValue(produc.getPeso());
                fila.createCell(7).setCellValue(produc.getEstadoProceso());
                fila.createCell(8).setCellValue(produc.getNumPartes());
                i++;
            }
            agregarServicio(service);
        }
        creaArchivo();
    }

    public static void leerExcel(Historial historia, ListaClientes cli, ListaVehiculos vehi, ListaSucursales sucur) {
        try {
            FileInputStream archivo = new FileInputStream(new File("Hitorial.xlsx"));
            XSSFWorkbook excelLectura = new XSSFWorkbook(archivo);
            XSSFSheet hoja;
            Producto[] productos=new Producto[2];

            for (int h = 0; h < excelLectura.getNumberOfSheets(); h++) {
                hoja = excelLectura.getSheetAt(h);
                int numFilas = hoja.getLastRowNum();

                //Clientes
                String codigoCli = "";
                String nombre = "";
                String dni = "";
                int tipoCli = 0;
                String notaCli = "";

                //Vehiculos
                String codigoVe = "";
                float maxCap = 0;
                boolean disponibilidad = true;
                String sucurOrigen = "";
                String lugarUltimo = "";
                int tipoRe = 0;
                String notaVe = "";

                //Sucursales
                String codigoSu = "";
                String ubi = "";
                int tipoSu = 0;

                //Productos
                String[] codServ = new String[numFilas + 1];
                String codigoPro = "";
                String lugarDestino = "";
                boolean perecible = false;
                int gradoFra = 0;
                int vida = 0;
                double peso = 0;
                int estadoPro = 0;
                int numPartes = 0;
                if(h==3){
                    productos = new Producto[numFilas + 1];
                }
                
                //Servicios
                String codigoServ = "";
                String dirRemi = "";
                String dirDesti = "";
                String ruta = "";
                String fechaCon = "";
                String codCli = "";
                String fechaCum = "";
                Cliente cliServ;
                //
                String codSucur="";
                String codVehi="";

                for (int i = 1; i <= numFilas; i++) {
                    
                    Row fila = hoja.getRow(i);
                    int numCols = fila.getLastCellNum();
                    for (int j = 0; j < numCols; j++) {
                        Cell celda = fila.getCell(j);

                        switch (h) {
                            case 0://Clientes
                                switch (j) {
                                    case 0:
                                        codigoCli = celda.getStringCellValue();
                                        break;
                                    case 1:
                                        nombre = celda.getStringCellValue();
                                        break;
                                    case 2:
                                        dni = celda.getStringCellValue();
                                        break;
                                    case 3:
                                        tipoCli = (int) celda.getNumericCellValue();
                                        Cliente client = new Cliente(codigoCli, nombre, dni, tipoCli, notaCli);
                                        cli.Agregar(client);
                                        break;
                                    case 4:
                                        notaCli = celda.getStringCellValue();
                                        cli.Mostrar(codigoCli).setNota(notaCli);
                                        break;
                                }
                                break;
                            case 1://Vehiculos
                                switch (j) {
                                    case 0:
                                        codigoVe = celda.getStringCellValue();
                                        break;
                                    case 1:
                                        maxCap = (float) celda.getNumericCellValue();
                                        break;
                                    case 2:
                                        disponibilidad = celda.getBooleanCellValue();
                                        break;
                                    case 3:
                                        sucurOrigen = celda.getStringCellValue();
                                        break;
                                    case 4:
                                        lugarUltimo = celda.getStringCellValue();
                                        break;
                                    case 5:
                                        tipoRe = (int) celda.getNumericCellValue();
                                        Vehiculo auto = new Vehiculo(maxCap, disponibilidad, sucurOrigen, codigoVe, lugarUltimo, tipoRe);
                                        vehi.Agregar(auto);
                                        break;
                                    case 6:
                                        notaVe = celda.getStringCellValue();
                                        vehi.Mostrar(codigoVe).setNota(notaVe);
                                        break;
                                }
                                break;
                            case 2://Sucursales
                                switch (j) {
                                    case 0:
                                        codigoSu = celda.getStringCellValue();
                                        break;
                                    case 1:
                                        ubi = celda.getStringCellValue();
                                        break;
                                    case 2:
                                        tipoSu = (int) celda.getNumericCellValue();
                                        Sucursal suc = new Sucursal(codigoSu, ubi, tipoSu);
                                        sucur.Agregar(suc);
                                        break;
                                }
                                break;
                            case 3://Productos
                                switch (j) {
                                    case 0:
                                        codServ[i] = celda.getStringCellValue();
                                        break;
                                    case 1:
                                        codigoPro = celda.getStringCellValue();
                                        break;
                                    case 2:
                                        lugarDestino = celda.getStringCellValue();
                                        break;
                                    case 3:
                                        perecible = celda.getBooleanCellValue();
                                        break;
                                    case 4:
                                        gradoFra = (int) celda.getNumericCellValue();
                                        break;
                                    case 5:
                                        vida = (int) celda.getNumericCellValue();
                                        break;
                                    case 6:
                                        peso = celda.getNumericCellValue();
                                        break;
                                    case 7:
                                        estadoPro = (int) celda.getNumericCellValue();
                                        break;
                                    case 8:
                                        numPartes = (int) celda.getNumericCellValue();
                                        productos[i] = new Producto(codigoPro, lugarDestino, perecible,
                                                gradoFra, vida, peso, estadoPro, numPartes);
                                        break;
                                }
                                break;
                            default:
                                try {
                                    switch (j) {//Servicio
                                        case 0:
                                            codCli = celda.getStringCellValue();
                                            break;
                                        case 4:
                                            dirRemi = celda.getStringCellValue();
                                            break;
                                        case 5:
                                            dirDesti = celda.getStringCellValue();
                                            break;
                                        case 6:
                                            ruta = celda.getStringCellValue();
                                            break;
                                        case 7:
                                            fechaCon = celda.getStringCellValue();
                                            break;
                                        case 8:
                                            fechaCum = celda.getStringCellValue();
                                            codigoServ = hoja.getSheetName();
                                            cliServ = cli.Mostrar(codCli);
                                            Servicio service = new Servicio(codigoServ, dirRemi, dirDesti, ruta, fechaCon, cliServ);
                                            historia.AgregarServicio(service);
                                            historia.MostrarServicio(codigoServ).setFechaCumplimiento(fechaCum);
                                            break;
                                    }
                                } catch (NullPointerException ex) {
                                    System.out.println("Error en lectura"+ex);
                                }
                                
                            break;
                        }
                    }
                }
                
                if(h>3){
                    //Lee productos asociadas al servicio
                    XSSFSheet hojaPro=excelLectura.getSheetAt(3);
                    for(int k=0;k<=hojaPro.getLastRowNum();k++){
                        Row filaPro=hojaPro.getRow(k);
                        Cell celdaServ=filaPro.getCell(0);
                        if(celdaServ.getStringCellValue().equals(hoja.getSheetName())){
                            historia.MostrarServicio(hoja.getSheetName()).Agregar(productos[k]);
                        }
                    }
                    //Lee sucursales y vehiculos asociadas al servicio
                    for(int i = 1; i <= numFilas; i++){
                        Row fila = hoja.getRow(i);
                        int numCols = fila.getLastCellNum();
                        for (int j = 0; j < numCols; j++){
                            try{
                            if(1<=j&&j<=3){
                                Cell celda=fila.getCell(j);
                                switch(j){
                                    case 1://Lee sucursales asociadas al servicio
                                        codSucur=celda.getStringCellValue();
                                        for(Sucursal s: sucur.getSucursales()){
                                            if(codSucur.equals(s.getCodigo())){
                                                historia.MostrarServicio(hoja.getSheetName()).AniadirSucursal(s);
                                            }
                                        }
                                        break;
                                    case 2://Lee vehiculos asociadas al servicio
                                        codVehi=celda.getStringCellValue();
                                        for(Vehiculo v: vehi.getVehiculos()){
                                            if(codVehi.equals(v.getCodigo())){
                                                historia.MostrarServicio(hoja.getSheetName()).AniadirVehiculo(v);
                                            }
                                        }
                                        break;
                                }
                            }
                            }catch(NullPointerException ex){
                                System.out.println("Error de lectura: "+ex);
                            }
                        }
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error 2.1 "+ex);
        } catch (IOException ex) {
            System.out.println("Error 2.2 "+ex);
        }
    }

}
