package factoryveiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Programa {
    
    public static void main(String[] args){
        IFactory fabrica = new Factory();
        Veiculo Carro = fabrica.create("S",10,"Sol");
        Carro.imprimirNome();
        System.out.println();
        
   
        
    
  }
}