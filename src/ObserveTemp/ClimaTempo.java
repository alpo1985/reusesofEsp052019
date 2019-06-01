/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserveTemp;

import java.util.Date;


public class ClimaTempo implements Observador{

    private String nome;
    
    public ClimaTempo(String nome){
        this.nome = nome;
    }
    
    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("");
        System.out.println("ATUALIZADO");
        System.out.println(nome);
        System.out.println("Temperatura: " + String.valueOf(temperatura));
        System.out.println("Umidade: " + String.valueOf(umidade));
        System.out.println("Pressão" + String.valueOf(pressao));
    }
    
}
