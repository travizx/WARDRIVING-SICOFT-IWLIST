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
        
        
    }
}
