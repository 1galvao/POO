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
public class Pessoa {
    
    public String nome;
    private double altura;
    private int idade;
    private int RG;
    public Carro carro1;
    
    public void ligarCarro(){
        carro1.Ligar();
    }

    public void desligarCarro(){
        carro1.Desligar();
    }
    
    public void desligarFrear(){
        carro1.Frear();
    }
    
    public void Acelerar(){
        carro1.Acelerar();
    }
    
    public void setCambioMarcha(int marcha){
        carro1.setCambio(marcha);
    }
    
    public Carro getCarro() {
        return carro1;
    }

    public void setCarro(Carro carro1) {
        this.carro1 = carro1;
    }
    
    public void imprimeDadosPessoa(){
        System.out.println("---------Pessoa--------");
        System.out.println("Nome da pessoa: "+nome);
        System.out.println("Idade da pessoa: "+idade);
        System.out.println("Altura da pessoa: "+altura);
        System.out.println("Numero do RG: "+RG);
        System.out.println();
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }
    
    
}
