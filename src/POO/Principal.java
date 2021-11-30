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
        
       
        Pessoa p = new Pessoa();
        
        p.setNome("João");
        p.setIdade(15);
        p.setAltura(1.75);
        p.setRG(7017345);
   
        p.imprimeDadosPessoa();
        
        Carro carro = new Carro();
        carro.setTipo("Gol");
        carro.setCor("Verde");
        carro.setPlaca("OXE-2114");
        carro.setNumPortas(2);
        carro.setDono(p);
        
        p.setCarro(carro);
        p.setCarro(carro);
        p.ligarCarro();
        p.setCambioMarcha(1);
        p.Acelerar();
        p.setCambioMarcha(2);
        p.Acelerar();
        p.setCambioMarcha(3);
        p.Acelerar();
        p.desligarFrear();
        p.desligarCarro();
        
        p.getCarro().getCambio();
        
        carro.imprimeDadosCarro();
    }            
}
