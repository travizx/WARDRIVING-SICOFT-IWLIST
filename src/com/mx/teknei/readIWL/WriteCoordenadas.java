package com.mx.teknei.readIWL;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 26/10/2015
 * @class WriteCoordenadas
 */
public class WriteCoordenadas {

    public static void main(String[] args) {
        while (true) {
            File file = new File("src/wifi_14.iwl");
            if (file.exists()) {
                System.out.println("si existe este archivo");
            } else {
                System.out.println("No existe");
            }
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(file, true));
                System.out.println("Escriba en el archivo :" + file.getName());
                String content = "\n" + "Nueva Linea_____Extrema"+(int)(Math.random()*100000000);
                bw.write(content);
            } catch (Exception e) {
                System.out.println("Error al leer el archivo:" + e.getMessage());
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        System.out.println("Error..." + ex.getMessage());
                    }
                }
            }
            
            ///Espera :) 
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WriteCoordenadas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
