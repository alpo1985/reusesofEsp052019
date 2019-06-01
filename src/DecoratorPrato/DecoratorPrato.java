/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPrato;

/**
 *
 * @author Aluno
 */
public class DecoratorPrato {
    
    public static void main(String [] args){
           Pedido meuPedido = new Prato_A() {};
           System.out.println(meuPedido.getNome()+"="+meuPedido.getPreco());
           
           
           
    }
    
    
}
