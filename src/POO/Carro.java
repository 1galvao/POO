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
    
    private String tipo; 
    private String cor; 
    private String placa; 
    private int numPortas;
    private Pessoa dono;
    private int cambio;

    public int getCambio() {
        System.out.print("marhca: "+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    
    public void Ligar(){
        System.out.println("Ligando Carro");
    }
    
    public void Desligar(){
        System.out.println("Desligando Carro");
    }
    
    public void Acelerar(){
        System.out.println("Acelerando Carro");
    }
    
    public void Frear(){
        System.out.println("Freando Carro");
    }
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public Carro(){
        
    }
    
    public Carro(String tipo, String cor, String placa, int numPortas){
        this.tipo=tipo;
        this.cor=cor;
        this.placa=placa;
        this.numPortas=numPortas;
               
    }
    
    public void imprimeDadosCarro(){
        System.out.println();
        System.out.println("---------Carro---------");
        System.out.println("Cor do carro: "+cor);
        System.out.println("Numero de Portas: "+numPortas);
        System.out.println("Placa do carro: "+placa);
        System.out.println("Modelo do carro: "+tipo);
        System.out.println("dono do carro: "+dono.nome);
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
