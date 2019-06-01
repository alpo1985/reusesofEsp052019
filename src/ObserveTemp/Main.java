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
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        ClimaTempo climatempo = new ClimaTempo("Clima Tempo");
        Inmet inmet = new Inmet("Inmet");
        CamposUniversitarios universidade = new CamposUniversitarios("Universidade");
        
        
        
        Estacao estacao = new Estacao();
        estacao.adicionarObservador(climatempo);
        estacao.adicionarObservador(inmet);
        estacao.adicionarObservador(universidade);
        estacao.atualizar();
       
        
    }
}
