package com.mx.teknei.readIWL;

import com.mx.teknei.DTO.RecvAccessPointDTO;
import com.mx.teknei.util.DateUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 19/10/2015
 * @class ReadFormatIWL
 */
public class ReadFormatIWL {

    public static RecvAccessPointDTO nuevoPunto;
    
    public static void main(String[] args) {
        //Variable que se utilizaran dentro de la Lectura del archivo.
        int contadorVuelta=0;
        // Se cambiaria por arg[0] en un momento determinado, cuando ya este listo.
        File archivo = new File("src/wifi_14.iwl");
        FileReader fr = null;
        //Se inicia la lectura del archivo.
        try {
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            //**Se trata de tener siempre abierta la lectura del Archivo por si se adjuntas mas cosas en el.
            while (true) {
                linea = br.readLine(); 
                if( linea != null ){
                    if(!linea.equals("")){
                        /*
                        Empezar a comprobar si contiene primero la cadena "GNGGA"
                        dentro de esa Linea si no que la ignore.
                        */
                        if(linea.contains("$GNGGA")){
                            obtenerDatosCadena_GNGGA(linea);
                        }else{
                            
                        }
                        
                    }
                }else{
                    continue;
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("--Error con el archivo que indico:" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error de Lectura en el archivo:" + ex.getMessage());
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo:" + ex.getMessage());
            } catch (NullPointerException npe) {
                System.out.println("Error al leer el archivo:" + npe.getMessage());

            }
        }

    }
    
    /**
     * Esta funcion sirve para una cadena que contenga la fecha de esta forma
     * Eje. "2015-10-27 13:30:00 $GNGGA,193352.00,1858.14509..." , la función 
     * valida que tenga ese orden si no regresa un NULL.
     * @param linea Este parametro es un String que contenga la forma que se 
     * muestra en el Ejmeplo.
     * @return Retorna un OBJETO DATE si todo salio bien y retorna NULL si hubo 
     * algun error.
     */
    protected static Date obtenerDatosCadena_GNGGA(String linea){
        Date dateReturn = null;
        if( linea.contains("GNGGA") ){
            String []fechaSeparada = linea.split(" ");
            if(fechaSeparada.length == 3){
                dateReturn = new DateUtil().convertStringToDate2(fechaSeparada[0],fechaSeparada[1]);
                
            }else{
                return null;
            }
        }
        return dateReturn;
    }

}
