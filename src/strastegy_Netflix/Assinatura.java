/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strastegy_Netflix;

/**
 *
 * @author Aluno
 */
public class Assinatura {
    private IPreco preco;
    private IContentTransformer qualidade;
    private InumeroTransmicoes numeroLimite;
    
    public Assinatura (IPreco preco, IContentTransformer qualidade, 
            InumeroTransmicoes numeroLimite){
    
       this.preco = preco;
       this.qualidade = qualidade;
       this.numeroLimite = numeroLimite;
    
    }
          
  
    public double getPreco(){
           return preco.getpreco();
    }
    
    public void disponilizarConteudo() {
        qualidade.converteQualidade();
    }

    public void permitirNumeroTransmissoes() {
        System.out.println(numeroLimite.numeroTransmicoes());

   
}
}
