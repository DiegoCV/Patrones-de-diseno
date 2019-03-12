/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t1.conexion;

/**
 *
 * @author estudiante
 */
public class ConexionPlano implements IConexion{

    private int con = 0;
    private String nombre = "plano";
    
    @Override
    public String getComentario() {
        con++;
        return "Soy plano, las veces que el metodo se ha llamado es: "+con;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
}
