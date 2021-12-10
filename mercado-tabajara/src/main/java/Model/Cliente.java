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
        return pedidos;
    }

    public Set<Produto> getCarrinho() {
        return carrinho;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + '}';
    }
    
    
}
