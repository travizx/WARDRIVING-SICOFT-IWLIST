package com.mx.teknei.readIWL;

import com.mx.teknei.util.DateUtil;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 29/10/2015
 * @class nuevoMain
 */
public class nuevoMain {

    public static void main(String[] args) {
        Date obtenido = new DateUtil().convertStringToDate2("2015-10-27", "13:33:00");
        System.out.println(obtenido);
    }
}
