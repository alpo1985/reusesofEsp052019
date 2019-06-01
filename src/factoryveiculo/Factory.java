/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryveiculo;

/**
 *
 * @author Aluno
 */
public class Factory implements IFactory{

    @Override
    public Veiculo create(String abastecimento,int qtd, String tempo) {
        
        if ((qtd <= 2)||(abastecimento == "S")){
            return new Tesla();
        }
        if ( (qtd <= 5) && (tempo.equals("Sol"))){
            return new Escort();
        }
        if((qtd <= 5) && (tempo.equals("Chuva"))){
            return new Opala();
        }
        if (qtd > 5){
            return new Besta(); 
        }
        return null;      
    }

    
}