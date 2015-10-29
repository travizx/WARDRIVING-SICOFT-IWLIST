package com.mx.teknei.util;

import java.util.Date;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 26/10/2015
 * @class DateUtil
 */
public class DateUtil {

    public DateUtil() {
        
    }

    /**
     * Funcion que convierte una cadena de Strings a un OBJETO DATE, comprueba
     * que tenga mas o menos la forma de "mié oct 14 13:28:14 CDT 2015".
     *
     * @param dia es la cadena en la que se contendra la fecha que se quiere
     * convertir.
     * @return Objeto DATE .. Es null si en el proceso de convertir a Date hubo
     * un error con los datos del String.
     */
    public Date convertStringToDate(String dia) {
        Date diaConvert = null;
        String[] diaSeparado = null;
        String[] horaSeparada = null;
        if (dia.contains("CDT")) {
            diaSeparado = dia.split(" ");
            //Comparar que tenga la LONGITUD adecuada.
            if (diaSeparado != null && diaSeparado.length == 6) {
                //Entonces Dia Separado hay que checar que trae
                System.out.println("Es una buena probabilidad de que sea fecha");
                //Comprobamos el MES que sea el correcto
                if (obtenerMesNumber(diaSeparado[1]) != -1) {
                    int mesNum = obtenerMesNumber(diaSeparado[1]);//***MES
                    System.out.println("+MES:" + mesNum);
                    //Comprobamos el DIA;
                    try {
                        int convertDia = Integer.parseInt(diaSeparado[2]);//***DIA
                        System.out.println("+DIA:" + convertDia);
                        if (convertDia <= 31 && convertDia >= 1) {
                            //Comprobamos el AÑO
                            try {
                                int anioNum = Integer.parseInt(diaSeparado[5]);//***AÑOS
                                System.out.println("+AÑO:" + anioNum);
                                horaSeparada = diaSeparado[3].split(":");
                                if (horaSeparada != null && horaSeparada.length == 3) {
                                    //Comprobamos la HORA
                                    try {
                                        int hora = Integer.parseInt(horaSeparada[0]);//**HRS
                                        System.out.println("+HORA:" + hora);
                                        int min = Integer.parseInt(horaSeparada[1]);//**MIN
                                        System.out.println("+MIN:" + min);
                                        int seg = Integer.parseInt(horaSeparada[2]);//**SEC
                                        System.out.println("+SEG:" + seg);
                                        diaConvert = new Date(anioNum - 1900, mesNum, convertDia, hora, min, seg);
                                    } catch (NumberFormatException nfe) {
                                        return null;
                                    }
                                } else {
                                    return null;
                                }
                            } catch (NumberFormatException nfe) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } catch (NumberFormatException nfe) {
                        return null;
                    }
                } else {
                    //Esta mal la fecha en el ARCHIVO.
                    return null;
                }
            } else {
                System.out.println("No es una fecha es:" + dia);
            }
        }

        return diaConvert;
    }

    /**
     * Funcion que convierte dos cadenas de Strign una la Hora y la otra Fecha
     * en un OBJETO DATE, comprueba que tenga este formato "2015-10-23" y
     * "13:45:00"
     *
     * @param fecha Parámetro que contenga la fehca
     * @param hora Parámetro que contienen la hora
     * @return Regresa un Object Date
     */
    public Date convertStringToDate2(String fecha, String hora) {
        Date diaCalculado = null;
        if (fecha != null || !fecha.equals(" ") && hora != null || !hora.equals(" ")) {
            String[] fechaDiv = fecha.split("-");
            String[] horaDiv = fecha.split(":");
            Date fechaOBT = new Date();
        } else {
            return diaCalculado;
        }
        return diaCalculado;
    }

    /**
     * Funcion para convertir de un MES en String en número int del 0-11
     *
     * @param mesString Debe ser un mes Corto de 3 letras nada más.
     * @return Regresa -1 si no le mandas ningun correcto. Regresa del 0-11
     * dependiendo del mes que pasastes como parametros.
     */
    public int obtenerMesNumber(String mesString) {
        int numeroMes = -1;
        switch (mesString) {
            case "ene":
                numeroMes = 0;
                break;
            case "feb":
                numeroMes = 1;
                break;
            case "mar":
                numeroMes = 2;
                break;
            case "abr":
                numeroMes = 3;
                break;
            case "may":
                numeroMes = 4;
                break;
            case "jun":
                numeroMes = 5;
                break;
            case "jul":
                numeroMes = 6;
                break;
            case "ago":
                numeroMes = 7;
                break;
            case "sep":
                numeroMes = 8;
                break;
            case "oct":
                numeroMes = 9;
                break;
            case "nov":
                numeroMes = 10;
                break;
            case "dic":
                numeroMes = 11;
                break;
            default:
                numeroMes = -1;
        }
        return numeroMes;
    }

}
