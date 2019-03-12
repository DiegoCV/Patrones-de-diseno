/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t1.main;
import patrones.talleres.t1.FactoryConexion;
import patrones.talleres.t1.conexion.*;
/**
 *
 * @author estudiante
 */
public class NewMain {
    
    public static void imprimir(IConexion[] con){
        for (IConexion iConexion : con) {
            System.out.println(iConexion.getComentario());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(FactoryConexion.getConexion("plano").getComentario());
        System.out.println(FactoryConexion.getConexion("mariadb").getComentario());
        System.out.println(FactoryConexion.getConexion("oracle").getComentario());
        System.out.println(FactoryConexion.getConexion("mariadb").getComentario());
    }
    
}
