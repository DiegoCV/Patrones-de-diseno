/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.talleres.t3;

import java.util.List;

/**
 *
 * @author DiegoCarrascal
 */
public interface IRobot {
    public void trabajar();
    public void cargarAcciones(List<Integer> lista);
}
