/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabajara.mercado.tabajara;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nicolas
 */
public class Estoque {
    
    private String nome;
    private Endereco endereco;
    private Map<Integer, Produto> produtos;

    public Estoque(String nome, Endereco endereco, Map<Integer, Produto> produtos) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Map<Integer, Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Integer, Produto> produtos) {
        this.produtos = produtos;
    }

    //Inserir os métodos de listagem (listar todos, listar por código e listar por nome)
    
    @Override
    public String toString() {
        return "Estoque{" + "nome=" + nome + ", endereco=" + 
                endereco + '}';
    }
    
    
    
    
}
