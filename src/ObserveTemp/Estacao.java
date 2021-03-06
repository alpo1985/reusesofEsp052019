/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserveTemp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author João
 */
public class Estacao {
    private double temperatura;
    private double umidade;
    private double pressao;
    
    private List<Observador> observadores = new ArrayList();
    
    public void adicionarObservador(Observador observador){
        observadores.add(observador);
    }
    
    public void removerObservador(Observador observador){
        observadores.remove(observador);
    }
    
    public void atualizarObservadores(){
        for (Observador observador : observadores){
            observador.atualizar(temperatura,umidade,pressao);
        }
    }
    
    public void atualizar(){
        Random random = new Random();
        this.temperatura = random.nextDouble()*50;
        this.umidade = random.nextDouble()*100;
        this.pressao = random.nextDouble()*20;
        atualizarObservadores();        
    }
}
