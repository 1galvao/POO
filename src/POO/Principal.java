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
        //CONSTRUTOR 1 - com assinatura 
        Carro carro = new Carro("Miura X8","Vermelho","OPR-2365",2);
    
        carro.imprimeDadosCarro();
        
        Carro outroCarro = new Carro();
        outroCarro.setTipo("Gol");
        outroCarro.setCor("Verde");
        outroCarro.setPlaca("OXE-2114");
        outroCarro.setNumPortas(2);
        
        /*double a=3, b=2;
        System.out.println("Quadrado de "+a+" "
                + "é "+Calculo.elevar(a));*/
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("João");
        pessoa.setIdade(15);
        pessoa.setAltura(1.75);
        pessoa.setRG(7.017345);
        
        pessoa.imprimeDadosPessoa();
        
        
    }            
}
