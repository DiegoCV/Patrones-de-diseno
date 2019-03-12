/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t1;

import patrones.talleres.t1.conexion.*;

/**
 *
 * @author estudiante
 */
public class FactoryConexion {
    
    private static FactoryConexion factoryConexion;
    private final IConexion conexion;
    
    private FactoryConexion(String conexion){
        switch(conexion.toLowerCase()){
            case "oracle":               
                this.conexion = new ConexionOracle();
                break;
            case "mariadb":
                this.conexion =  new ConexionMariaDb();
                break;
            default:
                this.conexion =  new ConexionPlano();            
        }  
    }
    
    public static IConexion getConexion(String conexion){
        if(factoryConexion == null){
            factoryConexion = new FactoryConexion(conexion);
        }
        return factoryConexion.conexion;  
    }

    
  
}
