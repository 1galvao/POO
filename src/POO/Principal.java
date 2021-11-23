/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Principal {
    
    public static void main(String[] args){
    
        Carro carro = new Carro();
    
        carro.setCor("Azul");
        carro.setNumPortas(2);
        carro.setPlaca("OPR-1290");
        carro.setTipo("Miura X8");
        
        carro.imprimeDadosCarro();
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("João");
        pessoa.setIdade(15);
        pessoa.setAltura(1.75);
        pessoa.setRG(7.017345);
        
        pessoa.imprimeDadosPessoa();
    }            
}
