/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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

    public Estoque(String nome, Endereco endereco) {
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

    public void addProduto(int cod, Produto produto){
        this.produtos.put(cod, produto);
    }
    
    public void listaProduto(){
          for (int cod : this.produtos.keySet()){
              System.out.println("Codigo: " + cod + " " + produtos.get(cod));
          }
    }
    
    public void listaProduto(int cod){
        System.out.println(produtos.get(cod));
    }
    
    public void listaProduto(String nome){
        for(int cod : produtos.keySet()){
            Produto p = produtos.get(cod);
            if(p.getNome().equals(nome)){
                System.out.println(p);
            }
        }
    }
    
    //Inserir método para pesquisar por categoria.
    
    @Override
    public String toString() {
        return "Estoque{" + "nome=" + nome + ", endereco=" + 
                endereco + '}';
    }
    
    
    
    
}
