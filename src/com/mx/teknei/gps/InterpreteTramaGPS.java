/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.gps;

import com.mx.teknei.DTO.GNGGADTO;

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
     * Función que recibe un string que es la trama que se optiene de GPS, esta trama 
     * son para las que contienen el Formato GNGGA
     * @param trama
     * @return 
     */
    public GNGGADTO intepreteGNGGA(String trama){
        if (trama.contains("$GNGGA")) {
            System.out.println(trama);
            String[] tramaGPSonly = trama.split(",");
            //--------OBTENER PUNTOS GPS TRAMA---------
            System.out.println("----TRAMA GPS:");
            String latitud = tramaGPSonly[2].length() == 0 ? "0" : tramaGPSonly[2];
            boolean norte = tramaGPSonly[3].equals("N");
            String longitud = tramaGPSonly[4].length() == 0 ? "0" : tramaGPSonly[4];
            boolean este = tramaGPSonly[5].equals("E");
            //-------------VARS------------------------
            String gradosLatitud = "0";
            String minutosLatitud = "0";
            String gradosLongitud = "0";
            String minutosLongitud = "0";
            Double latitudDecimal = 0d;
            Double longitudDecimal = 0d;
            //--------Convertir TRAMA-------------------
            if (!latitud.equals("0")) {
                gradosLatitud = latitud.substring(0, 2);
                minutosLatitud = latitud.substring(2);
            }
            if (!longitud.equals("0")) {
                gradosLongitud = longitud.substring(0, 3);
                minutosLongitud = longitud.substring(3);
            }
            latitudDecimal = Double.parseDouble(gradosLatitud) + (Double.parseDouble(minutosLatitud) / 60);
            longitudDecimal = Double.parseDouble(gradosLongitud) + (Double.parseDouble(minutosLongitud) / 60);

            latitudDecimal = norte ? latitudDecimal : latitudDecimal * -1;
            longitudDecimal = este ? longitudDecimal : longitudDecimal * -1;
            //----------FIN CALCULO GEOLOCALIZACION---------------
            System.out.println("LAT:");
            System.out.println(gradosLatitud);
            System.out.println(minutosLatitud);
            System.out.println("LONG:");
            System.out.println(gradosLongitud);
            System.out.println(minutosLongitud);
            System.out.println("Latitud: " + latitudDecimal + " Longitud: " + longitudDecimal);

        } else {
            System.out.println("\\o/ NOOO LO TIENEN \\o/");
        }
        return null;
    }
    
   
}
