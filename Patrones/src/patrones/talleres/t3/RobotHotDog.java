/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t3;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DiegoCarrascal
 */
public class RobotHotDog implements IRobot{
    
    List<Integer> acciones;

    public RobotHotDog() {
    }

    public List<Integer> getAcciones() {
        return acciones;
    }

     private void setAcciones(List<Integer> acciones) {
        this.acciones = acciones;
    }

    private void inicio() {
        System.out.println("Inicio");
    }

    private void fin() {
        System.out.println("Fin");
    }

    private void revisar() {
        System.out.println("revisar");
    }

    private void buscarIngrediente() {
        System.out.println("Buscar Ingrediente");
    }

    private void armarHotDog() {
        System.out.println("Armando HotDog");
    }

    private void revisandoHotDog() {
        System.out.println("HotDog Revisada");
    }
    
    @Override
    public void trabajar() {
        this.inicio();
        Iterator ite = this.acciones.iterator();
        while (ite.hasNext()) {
            this.llamarMetodo((Integer) ite.next());
        }
        this.fin();
    }

    private void llamarMetodo(Integer i) {
        switch(i){
            case 1:
                this.revisar();
                break;
            case 2:
                this.buscarIngrediente();
                break;
            case 3:
                this.armarHotDog();
                break;
            case 4:
                this.revisandoHotDog();
                break;
            default:
                System.out.println("Accion no existe");
        } 
              
    }
    
    @Override
    public void cargarAcciones(List<Integer> lista) {
        this.setAcciones(lista);
    }
    
}