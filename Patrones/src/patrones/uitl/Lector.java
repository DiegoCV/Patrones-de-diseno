/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.uitl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DiegoCarrascal
 */
public class Lector {

    public static List<Integer> getAcciones(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<Integer> acciones = new ArrayList<>();
        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                acciones.add(Integer.parseInt(linea));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return acciones;
    }

}
