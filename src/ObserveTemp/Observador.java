/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserveTemp;

/**
 *
 * @author João
 */
public interface Observador {
    public void atualizar(double temperatura, double umidade, double pressao);
}
