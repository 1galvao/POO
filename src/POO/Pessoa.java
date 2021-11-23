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
    
    String nome;
    Double altura;
    int idade;
    Double RG;
    
    void imprimeDadosPessoa(){
        System.out.println("---------Pessoa--------");
        System.out.println("Nome da pessoa: "+nome);
        System.out.println("Idade da pessoa: "+idade);
        System.out.println("Altura da pessoa: "+altura);
        System.out.println("Numero do RG: "+RG);
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

    
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getRG() {
        return RG;
    }

    public void setRG(Double RG) {
        this.RG = RG;
    }
    
    
}
