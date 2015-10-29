package com.mx.teknei.readIWL;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 26/10/2015
 * @class Main
 */
public class Main {

    public static void main(String[] args) {
        String tramaGPS = "2015-10-23 13:45:00 $GNGGA,210502.00,1858.87564,N,09815.20059,W,2,12,0.67,2118.8,M,-7.9,M,,0000*73";
        String[] tramaDiv = tramaGPS.split(" ");
        String[] fecha = tramaDiv[0].split("-");
        String[] hora = tramaDiv[1].split(":");
        System.out.println("DIV:");
        for (String tma : tramaDiv) {
            System.out.println(tma);
        }
        System.out.println("FECHA:");
        for (String fch : fecha) {
            System.out.println(fch);
        }
        System.out.println("HORA:");
        for (String hr : hora) {
            System.out.println(hr);
        }
        if (tramaDiv[2].contains("$GNGGA")) {
            System.out.println(tramaDiv[2]);
            String[] tramaGPSonly = tramaDiv[2].split(",");
            boolean compruebaGPS = true;
            for (String gps : tramaGPSonly) {
                if (gps.equals("") || gps.equals(" ")) {
                    System.out.println("CUIDADO CAMPOS VACIOS ٩(×̯×)۶");
                    compruebaGPS = !false;
                }
            }
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
        
    }
}
