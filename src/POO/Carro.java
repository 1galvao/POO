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
public class Carro {
    
    String tipo; 
    String cor; 
    String placa; 
    int numPortas;
    
    void imprimeDadosCarro(){
        System.out.println("---------Carro---------");
        System.out.println("Cor do carro: "+cor);
        System.out.println("Numero de Portas: "+numPortas);
        System.out.println("Placa do carro: "+placa);
        System.out.println("Modelo do carro: "+tipo);
    }
    
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor=cor;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa=placa;
    }
    
    public int getNumPortas(){
        return numPortas;
    }
    
    public void setNumPortas(int numPortas){
        this.numPortas=numPortas;
    }
    
}
