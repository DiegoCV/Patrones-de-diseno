/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t3;
import java.util.List;
import patrones.uitl.Lector;
/**
 *
 * @author DiegoCarrascal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> acc_1 = Lector.getAcciones("src/patrones/talleres/t3/acci_1.txt");
        List<Integer> acc_2 = Lector.getAcciones("src/patrones/talleres/t3/acci_2.txt");
        
        IRobot robot1 = new RobotHamburguesa();
        IRobot robot2 = new RobotHotDog();
        
        robot1.cargarAcciones(acc_1);
        robot2.cargarAcciones(acc_2);
        
        robot1.trabajar();
        robot2.trabajar();
    }
    
}
