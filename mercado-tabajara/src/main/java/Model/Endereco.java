/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nicolas
 */
public class Endereco {
    private String rua;
    private String bairro;
    private int cep;
    private int numero;
    private String cidade;

    public Endereco(String rua, String bairro, int cep, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidadeCep(this.cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String cidadeCep(int cep){
        String cidade = "";
        switch(cep){
            case 89155000: {
                cidade = "Dona Emma";
                break;
            }
            
            case 89140000: {
                cidade = "Ibirama";
                break;
            }
            
            case 89150000: {
                cidade = "Presidente Getúlio";
                break;
            }
            
            case 89148000: {
                cidade = "Vitor Meireles";
                break;
            }
            
            case 891157000: {
                cidade = "Witmarsum";
                break;
            }
        }
        return cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", bairro=" + bairro + 
                ", cep=" + cep + ", numero=" + numero + 
                ", cidade=" + cidade + '}';
    }
    
}
