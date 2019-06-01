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
public class Main {
    
    public static void main (String args[]){
    // Plano Basico
    IPreco preco= new PrecoBasico();
    IContentTransformer qualidade = new Simples();
    InumeroTransmicoes numeroLimite = new TransmicaoUnica();
    
    Assinatura planoBasico = new Assinatura(preco, qualidade,numeroLimite);
    
    System.out.println(planoBasico.getPreco());
    planoBasico.disponilizarConteudo();
    planoBasico.permitirNumeroTransmissoes();
    }
    
}
