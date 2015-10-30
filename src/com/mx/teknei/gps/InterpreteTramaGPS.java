/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.gps;

import com.mx.teknei.DTO.GNGGADTO;
import com.mx.teknei.util.StringUtil;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 */
public class InterpreteTramaGPS {

    public InterpreteTramaGPS() {

    }

    /**
     * Función que recibe un string que es la trama que se optiene de GPS, esta
     * trama son para las que contienen el Formato GNGGA
     *
     * @param trama
     * @return
     */
    public GNGGADTO intepreteGNGGA(String trama) {
        GNGGADTO tramaDTO = null;
        if (trama.contains("$GNGGA")) {
            System.out.println(trama);
            String[] tramaGPS = trama.split(",");
            if (tramaGPS.length == 15) {//Comprueba que contenga los 15 parametros que tiene el formato GNGGA
                //----FECHA GPS

            } else {
                System.err.println("La trama obtenida no tiene el formato adecuado."
                        + ":Class." + this.getClass().getSimpleName() + "(intepreteGNGGA)");
            }
        } else {
            System.err.println("La trama obtenida como parametro no contiene '$GNGGA'"
                    + ":Class." + this.getClass().getSimpleName() + "(intepreteGNGGA)");
        }

        return tramaDTO;
    }

    private Date getUTCtime(String time) {
        Date horaOnlyGPS = null;
        if ( isCheckStringCorrect(time) ) {
            
        } else {
            return null;
        }
        return horaOnlyGPS;
    }

    private Double getLatitude(String latitude) {
        Double latitudeGPS = null;
        if ( isCheckStringCorrect(latitude) ) {
            
        } else {
            return null;
        }
        return latitudeGPS;
    }

    /**
     * Funcion que comprueba que una cadena no sea NULL y que contenga
     * 'CARACTERES' o 'NUMEROS' y que al principio no tenga 'ESPACIOS'.
     *
     * @param cadena Cadena que se comprobara.
     * @return Retorna TRUE si y solo si ... NO es null. NO tiene espacios
     * vacios al pricipio. SI contiene algo escrito con caracteres o número,
     */
    public boolean isCheckStringCorrect(String cadena) {
        return cadena != null && StringUtil.containsCharacter(cadena)
                && !StringUtil.containSpaceFirst(cadena);
    }

}
