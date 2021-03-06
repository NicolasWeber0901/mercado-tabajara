/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Nicolas
 */
public class Cliente extends Pessoa{

    private List<Pedido> pedidos;
    private Set<Produto> carrinho;
    
    public Cliente(String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, String usuario, String senha) {
        super(nome, cpf, dataNascimento, telefone, endereco, usuario, senha);
        this.pedidos = new ArrayList<>();
        this.carrinho = new HashSet<>();
    }

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    public Set<Produto> getCarrinho() {
        return this.carrinho;
    }

    public double calculaTotal(){
        double total = 0;
        for(Produto p : this.carrinho){
            total += p.getValor();
        }
        
        return total;
    }
    
    public void addPedido(Pedido p){
        this.pedidos.add(p);
    }
    
    public void addCarrinho(Produto p){
        this.carrinho.add(p);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
    
    
}
