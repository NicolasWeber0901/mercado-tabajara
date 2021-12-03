/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class Mercado {

    private static Mercado mercado;

    private String nome;
    private String telefone;
    private String cnpj;
    private Endereco endereco;
    private Estoque estoque;
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<Categoria> categorias;

    //Adicionar a lista de pedidos.
    public Mercado(String nome, String telefone, String cnpj, Endereco endereco, Estoque estoque) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.estoque = estoque;
        this.categorias = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    //Criar métodos de listagem de pedidos.
    
    public void listaCliente(){
        for(Cliente c : this.clientes){
            System.out.println(c);
        }
    }
    
    public void listaCliente(String cpf){
        for(Cliente c : this.clientes){
            if(c.getCpf().equals(cpf)){
                System.out.println(c);
            }
        }
    }
    
    public void listaClienteNome(String nome){
        for(Cliente c : this.clientes){
            if(c.getNome().equals(nome)){
                System.out.println(c);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Mercado{" + "nome=" + nome + ", telefone=" + telefone + ", cnpj=" + cnpj + ", endereco=" + endereco + ", estoque=" + estoque + '}';
    }

    
    public static Mercado getMercado() {
        if (Mercado.mercado == null) {
            Endereco e1 = new Endereco("Alberto Koglin", "Centro", "89155000", 123);
            Estoque estoque = new Estoque("EStoque Matriz", e1);
            Mercado.mercado = new Mercado("Tabajara", "40028922", "33.666.330/0001-70",
                    e1, estoque);
        }
        return Mercado.mercado;
    }

}
