
package com.mx.teknei.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 30/10/2015
 * @class StringUtil
 */
public class StringUtil {

    /**
     * Funcion que checa si una cadena contiene por lo menos alguna letra o un 
     * número dentro de el.
     * @param cadena cadena que se quiere comprobar.
     * @return Retorna TRUE si y solo si encuentra alguna letra o numero 
     */
    public static boolean containsCharacter(String cadena){
        //Patron que pregunta si la cadena tiene algun caracter
        Pattern pat = Pattern.compile(".*[a-z|A-Z|0-9].*");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    
    /**
     * Funcion que comprueba que si la cadena contiene al principio espacios en blanco
     * @param cadena Cadena que se quiere comprobar
     * @return Retorna True si y solo si AL principio de la Cadena Existe algún espacio.
     */
    public static boolean containSpaceFirst(String cadena){
        //Patron que pregunta si la cadena  tiene espacios al Principio
        Pattern pat2 = Pattern.compile("^[\\s].*");
        Matcher mat2 = pat2.matcher(cadena);
        return mat2.matches();
    }
}
